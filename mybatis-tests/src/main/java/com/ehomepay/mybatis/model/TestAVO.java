package com.ehomepay.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class TestAVO implements Serializable {
    private Long pkId;

    private String tA;

    private String tB;

    private String tC;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getPkId() {
        return pkId;
    }

    public void setPkId(Long pkId) {
        this.pkId = pkId;
    }

    public String gettA() {
        return tA;
    }

    public void settA(String tA) {
        this.tA = tA == null ? null : tA.trim();
    }

    public String gettB() {
        return tB;
    }

    public void settB(String tB) {
        this.tB = tB == null ? null : tB.trim();
    }

    public String gettC() {
        return tC;
    }

    public void settC(String tC) {
        this.tC = tC == null ? null : tC.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}