package group.guangdong.pojo;

import java.util.Date;

public class Case_title {
    private Integer ctId;

    private String ctName;

    private Date ctUploadTime;

    private String ctUploader;

    private Integer ctShow;

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public String getCtName() {
        return ctName;
    }

    public void setCtName(String ctName) {
        this.ctName = ctName;
    }

    public Date getCtUploadTime() {
        return ctUploadTime;
    }

    public void setCtUploadTime(Date ctUploadTime) {
        this.ctUploadTime = ctUploadTime;
    }

    public String getCtUploader() {
        return ctUploader;
    }

    public void setCtUploader(String ctUploader) {
        this.ctUploader = ctUploader;
    }

    public Integer getCtShow() {
        return ctShow;
    }

    public void setCtShow(Integer ctShow) {
        this.ctShow = ctShow;
    }
}