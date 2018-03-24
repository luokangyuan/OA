package cn.luo.ssm.po;

import java.util.Date;

public class Calfile {
    private Integer calFileId;

    private Integer calendarId;

    private String calFileName;

    private String calFileType;

    private String calFileSize;

    private String calFileServerName;

    private Date calFileTime;

    private Integer calFileuserId;

    public Integer getCalFileId() {
        return calFileId;
    }

    public void setCalFileId(Integer calFileId) {
        this.calFileId = calFileId;
    }

    public Integer getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(Integer calendarId) {
        this.calendarId = calendarId;
    }

    public String getCalFileName() {
        return calFileName;
    }

    public void setCalFileName(String calFileName) {
        this.calFileName = calFileName == null ? null : calFileName.trim();
    }

    public String getCalFileType() {
        return calFileType;
    }

    public void setCalFileType(String calFileType) {
        this.calFileType = calFileType == null ? null : calFileType.trim();
    }

    public String getCalFileSize() {
        return calFileSize;
    }

    public void setCalFileSize(String calFileSize) {
        this.calFileSize = calFileSize == null ? null : calFileSize.trim();
    }

    public String getCalFileServerName() {
        return calFileServerName;
    }

    public void setCalFileServerName(String calFileServerName) {
        this.calFileServerName = calFileServerName == null ? null : calFileServerName.trim();
    }

    public Date getCalFileTime() {
        return calFileTime;
    }

    public void setCalFileTime(Date calFileTime) {
        this.calFileTime = calFileTime;
    }

    public Integer getCalFileuserId() {
        return calFileuserId;
    }

    public void setCalFileuserId(Integer calFileuserId) {
        this.calFileuserId = calFileuserId;
    }
}