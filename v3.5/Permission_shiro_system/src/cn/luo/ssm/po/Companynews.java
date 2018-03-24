package cn.luo.ssm.po;

import java.util.Date;

public class Companynews {
    private Integer newsId;

    private Integer staId;

    private String newsTitlle;

    private String newsContent;

    private Date newsCreate;

    private String newsSmaill;

    private String newsMain;

    private String newsUser;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public String getNewsTitlle() {
        return newsTitlle;
    }

    public void setNewsTitlle(String newsTitlle) {
        this.newsTitlle = newsTitlle == null ? null : newsTitlle.trim();
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public Date getNewsCreate() {
        return newsCreate;
    }

    public void setNewsCreate(Date newsCreate) {
        this.newsCreate = newsCreate;
    }

    public String getNewsSmaill() {
        return newsSmaill;
    }

    public void setNewsSmaill(String newsSmaill) {
        this.newsSmaill = newsSmaill == null ? null : newsSmaill.trim();
    }

    public String getNewsMain() {
        return newsMain;
    }

    public void setNewsMain(String newsMain) {
        this.newsMain = newsMain == null ? null : newsMain.trim();
    }

    public String getNewsUser() {
        return newsUser;
    }

    public void setNewsUser(String newsUser) {
        this.newsUser = newsUser == null ? null : newsUser.trim();
    }
}