package cn.luo.ssm.po;

import java.util.Date;

public class Reimbur {
    private Integer reimId;

    private Integer staId;

    private Integer reimascId;

    private Date reimTime;

    private Date reimBegin;

    private Date reimEnd;

    private String reimtricc;

    private String reimAccom;

    private String reimAccCost;

    private String reimDays;

    private String reimObjec;

    private String reimRemark;

    public Integer getReimId() {
        return reimId;
    }

    public void setReimId(Integer reimId) {
        this.reimId = reimId;
    }

    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public Integer getReimascId() {
        return reimascId;
    }

    public void setReimascId(Integer reimascId) {
        this.reimascId = reimascId;
    }

    public Date getReimTime() {
        return reimTime;
    }

    public void setReimTime(Date reimTime) {
        this.reimTime = reimTime;
    }

    public Date getReimBegin() {
        return reimBegin;
    }

    public void setReimBegin(Date reimBegin) {
        this.reimBegin = reimBegin;
    }

    public Date getReimEnd() {
        return reimEnd;
    }

    public void setReimEnd(Date reimEnd) {
        this.reimEnd = reimEnd;
    }

    public String getReimtricc() {
        return reimtricc;
    }

    public void setReimtricc(String reimtricc) {
        this.reimtricc = reimtricc == null ? null : reimtricc.trim();
    }

    public String getReimAccom() {
        return reimAccom;
    }

    public void setReimAccom(String reimAccom) {
        this.reimAccom = reimAccom == null ? null : reimAccom.trim();
    }

    public String getReimAccCost() {
        return reimAccCost;
    }

    public void setReimAccCost(String reimAccCost) {
        this.reimAccCost = reimAccCost == null ? null : reimAccCost.trim();
    }

    public String getReimDays() {
        return reimDays;
    }

    public void setReimDays(String reimDays) {
        this.reimDays = reimDays == null ? null : reimDays.trim();
    }

    public String getReimObjec() {
        return reimObjec;
    }

    public void setReimObjec(String reimObjec) {
        this.reimObjec = reimObjec == null ? null : reimObjec.trim();
    }

    public String getReimRemark() {
        return reimRemark;
    }

    public void setReimRemark(String reimRemark) {
        this.reimRemark = reimRemark == null ? null : reimRemark.trim();
    }
}