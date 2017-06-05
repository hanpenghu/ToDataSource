package com.test.readEXCEL.queDingPicWeiZhi001没有得到合适的结果;

import org.apache.poi.hssf.usermodel.HSSFSheet;

/**
 * Created by Administrator on 2017/6/5.
 */
public class PicAndRowAndColum {
    //yonglai cunchu tupian de zijie
    byte[]picData=null;
    //zai excel zhong de nayi hang  //cong 0 kaishi suo yin
    Short row=null;
    //zai excel zhong de lieshu//cong 0 kaishi  shu excel
    Short colum=null;

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

    public Short getRow() {
        return row;
    }

    public void setRow(Short row) {
        this.row = row;
    }

    public Short getColum() {
        return colum;
    }

    public void setColum(Short colum) {
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
