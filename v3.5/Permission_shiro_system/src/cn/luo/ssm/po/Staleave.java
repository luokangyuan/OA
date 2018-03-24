package cn.luo.ssm.po;

import java.util.Date;

public class Staleave {
    private Integer leaveId;

    private Integer staId;

    private Integer leaveassId;

    private String leaveThing;

    private Date leaveTime;

    private Date leaveCreate;

    private String leaveType;

    private String leaveRemark;

    private Date leaveEndTime;

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
    }

    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public Integer getLeaveassId() {
        return leaveassId;
    }

    public void setLeaveassId(Integer leaveassId) {
        this.leaveassId = leaveassId;
    }

    public String getLeaveThing() {
        return leaveThing;
    }

    public void setLeaveThing(String leaveThing) {
        this.leaveThing = leaveThing == null ? null : leaveThing.trim();
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Date getLeaveCreate() {
        return leaveCreate;
    }

    public void setLeaveCreate(Date leaveCreate) {
        this.leaveCreate = leaveCreate;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType == null ? null : leaveType.trim();
    }

    public String getLeaveRemark() {
        return leaveRemark;
    }

    public void setLeaveRemark(String leaveRemark) {
        this.leaveRemark = leaveRemark == null ? null : leaveRemark.trim();
    }

    public Date getLeaveEndTime() {
        return leaveEndTime;
    }

    public void setLeaveEndTime(Date leaveEndTime) {
        this.leaveEndTime = leaveEndTime;
    }
}