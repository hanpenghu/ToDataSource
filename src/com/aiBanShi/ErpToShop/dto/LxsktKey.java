package com.aiBanShi.ErpToShop.dto;

public class LxsktKey {
    private String cgq;

    private String dh;

    public String getCgq() {
        return cgq;
    }

    public void setCgq(String cgq) {
        this.cgq = cgq == null ? null : cgq.trim();
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh == null ? null : dh.trim();
    }
}