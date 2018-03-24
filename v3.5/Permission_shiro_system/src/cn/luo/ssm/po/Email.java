package cn.luo.ssm.po;

import java.util.Date;

public class Email {
    private Integer emailId;

    private Integer staId;

    private String emailName;

    private String emailContent;

    private String emailAuthor;

    private Date emailCreate;

    private String emailNumber;

    private String emailType;

    private String emailDept;

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName == null ? null : emailName.trim();
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent == null ? null : emailContent.trim();
    }

    public String getEmailAuthor() {
        return emailAuthor;
    }

    public void setEmailAuthor(String emailAuthor) {
        this.emailAuthor = emailAuthor == null ? null : emailAuthor.trim();
    }

    public Date getEmailCreate() {
        return emailCreate;
    }

    public void setEmailCreate(Date emailCreate) {
        this.emailCreate = emailCreate;
    }

    public String getEmailNumber() {
        return emailNumber;
    }

    public void setEmailNumber(String emailNumber) {
        this.emailNumber = emailNumber == null ? null : emailNumber.trim();
    }

    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType == null ? null : emailType.trim();
    }

    public String getEmailDept() {
        return emailDept;
    }

    public void setEmailDept(String emailDept) {
        this.emailDept = emailDept == null ? null : emailDept.trim();
    }
}