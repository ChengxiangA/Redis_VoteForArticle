package com.chengxiang.bean;

public class Article {
    private String articleId;
    private String articleName;
    private String articleInfo;
    private String articleImg;
    private String articlePushTime;
    private String articlePoster;
    private Long articleUpNum;
    private Long articleDownNum;
    
    public Article() {
    }

    public Article(String articleId, String articleName, String articleInfo, String articleImg, String articlePushTime, String articlePoster, Long articleUpNum, Long articleDownNum) {
        this.articleId = articleId;
        this.articleName = articleName;
        this.articleInfo = articleInfo;
        this.articleImg = articleImg;
        this.articlePushTime = articlePushTime;
        this.articlePoster = articlePoster;
        this.articleUpNum = articleUpNum;
        this.articleDownNum = articleDownNum;
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

    public Long getArticleUpNum() {
        return articleUpNum;
    }

    public void setArticleUpNum(Long articleUpNum) {
        this.articleUpNum = articleUpNum;
    }

    public Long getArticleDownNum() {
        return articleDownNum;
    }

    public void setArticleDownNum(Long articleDownNum) {
        this.articleDownNum = articleDownNum;
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
                ", articleUpNum=" + articleUpNum +
                ", articleDownNum=" + articleDownNum +
                '}';
    }
}
