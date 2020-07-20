package group.guangdong.pojo;

import java.util.Date;

public class Article extends ArticleKey {
    private String articleTitle;

    private Date articlePublishTime;

    private String articleFrom;

    private String articleAuthor;

    private Integer stitleId;

    private Integer hits;

    private String articleUploader;

    private Date articleUploadTime;

    private String researchPlatform;

    private String researchField;

    private Integer top;

    private Integer ctId;

    private String articleContent;

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Date getArticlePublishTime() {
        return articlePublishTime;
    }

    public void setArticlePublishTime(Date articlePublishTime) {
        this.articlePublishTime = articlePublishTime;
    }

    public String getArticleFrom() {
        return articleFrom;
    }

    public void setArticleFrom(String articleFrom) {
        this.articleFrom = articleFrom;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public Integer getStitleId() {
        return stitleId;
    }

    public void setStitleId(Integer stitleId) {
        this.stitleId = stitleId;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getArticleUploader() {
        return articleUploader;
    }

    public void setArticleUploader(String articleUploader) {
        this.articleUploader = articleUploader;
    }

    public Date getArticleUploadTime() {
        return articleUploadTime;
    }

    public void setArticleUploadTime(Date articleUploadTime) {
        this.articleUploadTime = articleUploadTime;
    }

    public String getResearchPlatform() {
        return researchPlatform;
    }

    public void setResearchPlatform(String researchPlatform) {
        this.researchPlatform = researchPlatform;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}