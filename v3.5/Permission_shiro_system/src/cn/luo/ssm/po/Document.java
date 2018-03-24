package cn.luo.ssm.po;

public class Document {
    private Integer fileId;

    private Integer staId;

    private String fileTitle;

    private String fileName;

    private String fileRemark;

    private String fileServerName;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle == null ? null : fileTitle.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileRemark() {
        return fileRemark;
    }

    public void setFileRemark(String fileRemark) {
        this.fileRemark = fileRemark == null ? null : fileRemark.trim();
    }

    public String getFileServerName() {
        return fileServerName;
    }

    public void setFileServerName(String fileServerName) {
        this.fileServerName = fileServerName == null ? null : fileServerName.trim();
    }
}