package com.test.readEXCEL.queDingPicWeiZhi002;

import org.apache.poi.hssf.usermodel.HSSFSheet;

/**
 * Created by Administrator on 2017/6/5.
 */
public class PicAndRowAndColum {
    //yonglai cunchu tupian de zijie
    byte[]picData=null;
    //zai excel zhong de nayi hang  //cong 0 kaishi suo yin
    Integer row=null;
    //zai excel zhong de lieshu//cong 0 kaishi  shu excel
    Integer colum=null;

    HSSFSheet sheet=null;

    public PicAndRowAndColum() {
    }


    public HSSFSheet getSheet() {
        return sheet;
    }

    public void setSheet(HSSFSheet sheet) {
        this.sheet = sheet;
    }

    public byte[] getPicData() {
        return picData;
    }

    public void setPicData(byte[] picData) {
        this.picData = picData;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColum() {
        return colum;
    }

    public void setColum(Integer colum) {
        this.colum = colum;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PicAndRowAndColum{");
        sb.append("row=").append(row);
        sb.append(", colum=").append(colum);
        sb.append('}');
        return sb.toString();
    }
}
