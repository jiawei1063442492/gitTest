package group.guangdong.pojo;

import java.util.Date;

public class Home_picture {
    private Integer hpId;

    private Integer hpType;

    private String hpName;

    private String hpUploader;

    private Date hpUploadTime;

    private String hpAddress;

    private Integer articleId;

    private Integer hpShow;

    public Integer getHpId() {
        return hpId;
    }

    public void setHpId(Integer hpId) {
        this.hpId = hpId;
    }

    public Integer getHpType() {
        return hpType;
    }

    public void setHpType(Integer hpType) {
        this.hpType = hpType;
    }

    public String getHpName() {
        return hpName;
    }

    public void setHpName(String hpName) {
        this.hpName = hpName;
    }

    public String getHpUploader() {
        return hpUploader;
    }

    public void setHpUploader(String hpUploader) {
        this.hpUploader = hpUploader;
    }

    public Date getHpUploadTime() {
        return hpUploadTime;
    }

    public void setHpUploadTime(Date hpUploadTime) {
        this.hpUploadTime = hpUploadTime;
    }

    public String getHpAddress() {
        return hpAddress;
    }

    public void setHpAddress(String hpAddress) {
        this.hpAddress = hpAddress;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getHpShow() {
        return hpShow;
    }

    public void setHpShow(Integer hpShow) {
        this.hpShow = hpShow;
    }
}