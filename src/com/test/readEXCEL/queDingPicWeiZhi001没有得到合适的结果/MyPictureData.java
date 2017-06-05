package com.test.readEXCEL.queDingPicWeiZhi001没有得到合适的结果;

import org.apache.poi.ddf.EscherClientAnchorRecord;
import org.apache.poi.hssf.usermodel.*;

import java.util.*;

public class MyPictureData {

    public static void main(String[] args) throws Exception {
        /*FileInputStream fis = new FileInputStream
                ("C:\\Users\\Administrator\\Desktop\\1\\linzhan.xls");
        POIFSFileSystem fs = new POIFSFileSystem(fis);
        //得到Excel对象
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        List<HSSFPictureData> pictureList = wb.getAllPictures();
        //得到Excel的sheet对象//从0开始索引
        HSSFSheet sheet = wb.getSheetAt(0);
        List<ClientAnchorInfo> clientAnchorRecords = getClientAnchorRecords(wb);
        //做实验,找到第0个索引的记录
        EscherClientAnchorRecord clientAnchorRecord = clientAnchorRecords.get(0).clientAnchorRecord;
        //新建类的时候就把图片位置计算了,做实验用pictureList第0个索引和EscherClientAnchorRecord的第0个索引
        MyPictureData myPictureData = new MyPictureData(wb, sheet, pictureList.get(0), clientAnchorRecord);
        //找到该图片的位置
        System.out.println(myPictureData.getCol0());
        System.out.println(myPictureData.getRow0());
        //输出该图片右边一列的东西来确定该图片是哪个
        //注意Java索引excel是从0索引的,所以这里的第0行就是excel的第一行
        System.out.println(sheet
                .getRow(myPictureData.getRow2())
                .getCell(myPictureData.getCol0()+1)
        );
        //确切得到该图片并输出到文件夹下面,然后找到excel中该图片右侧的文字是上面一行打印的不是,如果是就证明实验成功
        byte[] data = pictureList.get(0).getData();
        FileOutputStream os =
                new FileOutputStream
                        (new File("C:\\Users\\Administrator\\Desktop\\1\\tu.jpeg"));
        os.write(data);
        os.flush();
        os.close();*/
        /*System.out.println(getPic("C:\\Users\\Administrator\\Desktop\\1\\linzhan.xls",0));*/
        //测试将所有图片写入到一个文件夹中
        List<PicAndRowAndColum> pics = PicUtils.getPic("C:\\Users\\Administrator\\Desktop\\1\\linzhan.xls");
        for(PicAndRowAndColum prc:pics){
            Short newRow = prc.getRow();
            int newColum = prc.getColum()+1;//找到图片后面那一行
            HSSFSheet sheet = prc.getSheet();
            String content = sheet.getRow(newRow).getCell(newColum).toString();
            System.out.println(content);
        }


    }
/////////////////////////////2017_6_5   weekday(1)   13:36:52////////////////////////////////////////////


    /////////////////////////////////////////////////////////////////////////
    private final HSSFWorkbook workbook;
    private final HSSFSheet sheet;
    private final HSSFPictureData pictureData;
    private final EscherClientAnchorRecord clientAnchor;

    public MyPictureData(HSSFWorkbook workbook, HSSFSheet sheet, HSSFPictureData pictureData, EscherClientAnchorRecord clientAnchor) {
        this.workbook = workbook;
        this.sheet = sheet;
        this.pictureData = pictureData;
        this.clientAnchor = clientAnchor;
    }

    public HSSFWorkbook getWorkbook() {
        return workbook;
    }

    public HSSFSheet getSheet() {
        return sheet;
    }

    public EscherClientAnchorRecord getClientAnchor() {
        return clientAnchor;
    }

    public HSSFPictureData getPictureData() {
        return pictureData;
    }

    public byte[] getData() {
        return pictureData.getData();
    }

    public String suggestFileExtension() {
        return pictureData.suggestFileExtension();
    }

    /**
     * 47.     * 推测图片中心所覆盖的单元格，这个值不一定准确，但通常有效
     * 48.     *
     * 49.     * @return the row0
     * 50.
     */
    public short getRow0() {
        int row1 = getRow1();
        int row2 = getRow2();
        if (row1 == row2) {
            return (short) row1;
        }

        int heights[] = new int[row2 - row1 + 1];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = getRowHeight(row1 + i);
        }

        // HSSFClientAnchor 中 dx 只能在 0-1023 之间,dy 只能在 0-255 之间
        // 表示相对位置的比率，不是绝对值
        int dy1 = getDy1() * heights[0] / 255;
        int dy2 = getDy2() * heights[heights.length - 1] / 255;
        return (short) (getCenter(heights, dy1, dy2) + row1);
    }


    private short getRowHeight(int rowIndex) {
        HSSFRow row = sheet.getRow(rowIndex);
        short h = row == null ? sheet.getDefaultRowHeight() : row.getHeight();
        return h;
    }

    /**
     * 78.     * 推测图片中心所覆盖的单元格，这个值不一定准确，但通常有效
     * 79.     *
     * 80.     * @return the col0
     * 81.
     */
    public short getCol0() {
        short col1 = getCol1();
        short col2 = getCol2();

        if (col1 == col2) {
            return col1;
        }

        int widths[] = new int[col2 - col1 + 1];
        for (int i = 0; i < widths.length; i++) {
            widths[i] = sheet.getColumnWidth(col1 + i);
        }

        // HSSFClientAnchor 中 dx 只能在 0-1023 之间,dy 只能在 0-255 之间
        // 表示相对位置的比率，不是绝对值
        int dx1 = getDx1() * widths[0] / 1023;
        int dx2 = getDx2() * widths[widths.length - 1] / 1023;
        return (short) (getCenter(widths, dx1, dx2) + col1);
    }

    /**
     * 104.     * 给定各线段的长度，以及起点相对于起点段的偏移量，终点相对于终点段的偏移量，
     * 105.     * 求中心点所在的线段
     * 106.     *
     * 107.     * @param a the a 各线段的长度
     * 108.     * @param d1 the d1 起点相对于起点段
     * 109.     * @param d2 the d2 终点相对于终点段的偏移量
     * 110.     *
     * 111.     * @return the center
     * 112.
     */
    protected static int getCenter(int[] a, int d1, int d2) {
        // 线段长度
        int width = a[0] - d1 + d2;
        for (int i = 1; i < a.length - 1; i++) {
            width += a[i];
        }

        // 中心点位置
        int c = width / 2 + d1;
        int x = a[0];
        int cno = 0;
        while (c > x) {
            x += a[cno];
            cno++;
        }

        return cno;
    }

    /**
     * 134.     * 左上角所在列
     * 135.     *
     * 136.     * @return the col1
     * 137.
     */
    public short getCol1() {
        return clientAnchor.getCol1();
    }

    /**
     * 143.     * 右下角所在的列
     * 144.     *
     * 145.     * @return the col2
     * 146.
     */
    public short getCol2() {
        return clientAnchor.getCol2();
    }

    /**
     * 152.     * 左上角的相对偏移量
     * 153.     *
     * 154.     * @return the dx1
     * 155.
     */
    public short getDx1() {
        return clientAnchor.getDx1();
    }

    /**
     * 161.     * 右下角的相对偏移量
     * 162.     *
     * 163.     * @return the dx2
     * 164.
     */
    public short getDx2() {
        return clientAnchor.getDx2();
    }

    /**
     * 170.     * 左上角的相对偏移量
     * 171.     *
     * 172.     * @return the dy1
     * 173.
     */
    public short getDy1() {
        return clientAnchor.getDy1();
    }

    /**
     * 179.     * 右下角的相对偏移量
     * 180.     *
     * 181.     * @return the dy2
     * 182.
     */
    public short getDy2() {
        return clientAnchor.getDy2();
    }

    /**
     * 左上角所在的行
     *
     * @return the row1
     */
    public short getRow1() {
        return clientAnchor.getRow1();
    }

    /**
     * 右下角所在的行
     *
     * @return the row2
     */
    public short getRow2() {
        return clientAnchor.getRow2();
    }
}
