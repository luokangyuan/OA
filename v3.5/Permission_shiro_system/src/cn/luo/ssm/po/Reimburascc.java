package cn.luo.ssm.po;

import java.util.Date;

public class Reimburascc {
    private Integer reimascId;

    private Integer staId;

    private Integer reimId;

    private Date reimascTine;

    private String reimascRemark;

    private String reimascType;

    public Integer getReimascId() {
        return reimascId;
    }

    public void setReimascId(Integer reimascId) {
        this.reimascId = reimascId;
    }

    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public Integer getReimId() {
        return reimId;
    }

    public void setReimId(Integer reimId) {
        this.reimId = reimId;
    }

    public Date getReimascTine() {
        return reimascTine;
    }

    public void setReimascTine(Date reimascTine) {
        this.reimascTine = reimascTine;
    }

    public String getReimascRemark() {
        return reimascRemark;
    }

    public void setReimascRemark(String reimascRemark) {
        this.reimascRemark = reimascRemark == null ? null : reimascRemark.trim();
    }

    public String getReimascType() {
        return reimascType;
    }

    public void setReimascType(String reimascType) {
        this.reimascType = reimascType == null ? null : reimascType.trim();
    }
}