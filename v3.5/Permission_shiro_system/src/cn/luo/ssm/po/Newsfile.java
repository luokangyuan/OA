package cn.luo.ssm.po;

import java.util.Date;

public class Newsfile {
    private Integer newFileId;

    private Integer newsId;

    private String newFileName;

    private String newFileSize;

    private String newFileType;

    private String newFileService;

    private Date newFileCreate;

    private String newFileAuthor;

    public Integer getNewFileId() {
        return newFileId;
    }

    public void setNewFileId(Integer newFileId) {
        this.newFileId = newFileId;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewFileName() {
        return newFileName;
    }

    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName == null ? null : newFileName.trim();
    }

    public String getNewFileSize() {
        return newFileSize;
    }

    public void setNewFileSize(String newFileSize) {
        this.newFileSize = newFileSize == null ? null : newFileSize.trim();
    }

    public String getNewFileType() {
        return newFileType;
    }

    public void setNewFileType(String newFileType) {
        this.newFileType = newFileType == null ? null : newFileType.trim();
    }

    public String getNewFileService() {
        return newFileService;
    }

    public void setNewFileService(String newFileService) {
        this.newFileService = newFileService == null ? null : newFileService.trim();
    }

    public Date getNewFileCreate() {
        return newFileCreate;
    }

    public void setNewFileCreate(Date newFileCreate) {
        this.newFileCreate = newFileCreate;
    }

    public String getNewFileAuthor() {
        return newFileAuthor;
    }

    public void setNewFileAuthor(String newFileAuthor) {
        this.newFileAuthor = newFileAuthor == null ? null : newFileAuthor.trim();
    }
}