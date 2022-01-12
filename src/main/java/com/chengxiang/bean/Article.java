package com.chengxiang.bean;

public class Article {
    private String articleId;
    private String articleName;
    private String articleInfo;
    private String articleImg;
    private String articlePushTime;
    private String articlePoster;

    public Article() {
    }

    public Article(String articleId, String articleName, String articleInfo, String articleImg, String articlePushTime, String articlePoster) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.articleInfo = articleInfo;
        this.articleImg = articleImg;
        this.articlePushTime = articlePushTime;
        this.articlePoster = articlePoster;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleInfo() {
        return articleInfo;
    }

    public void setArticleInfo(String articleInfo) {
        this.articleInfo = articleInfo;
    }

    public String getArticleImg() {
        return articleImg;
    }

    public void setArticleImg(String articleImg) {
        this.articleImg = articleImg;
    }

    public String getArticlePushTime() {
        return articlePushTime;
    }

    public void setArticlePushTime(String articlePushTime) {
        this.articlePushTime = articlePushTime;
    }

    public String getArticlePoster() {
        return articlePoster;
    }

    public void setArticlePoster(String articlePoster) {
        this.articlePoster = articlePoster;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId='" + articleId + '\'' +
                ", articleName='" + articleName + '\'' +
                ", articleInfo='" + articleInfo + '\'' +
                ", articleImg='" + articleImg + '\'' +
                ", articlePushTime='" + articlePushTime + '\'' +
                ", articlePoster='" + articlePoster + '\'' +
                '}';
    }
}
