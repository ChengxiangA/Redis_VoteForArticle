package com.chengxiang.Utils;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisUtil {

    /**
     * 点赞
     * @param articleId
     * @param uid
     */
    public static void upArticle(String articleId,String uid) {
       Jedis jedis = new Jedis("127.0.0.1",6379);
       jedis.sadd("upvote:" + articleId,"user:" + uid);
       jedis.zincrby("score",432d,"article:" + articleId);
       jedis.zincrby("vote",1d,"article:" + articleId);
    }

    /**
     * 拉踩
     * @param articleId
     * @param uid
     */
    public static void downArticle(String articleId,String uid) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.sadd("downvote:" + articleId,"user:" + uid);
        jedis.zincrby("score",-432d,"article:" + articleId);
        if(jedis.zscore("vote","article:" + articleId) != 0) {
            jedis.zincrby("vote",-1d,"article:" + articleId);
        }
    }

    /**
     * 通过时间给文章排序
     * @return 文章集合
     */
    public static Set<String> sortByPushTime() {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        Set<String> articles = jedis.zrevrange("time", 0, -1);
        return articles;
    }

    /**
     * 通过综合评分给文章排序
     * @return 文章集合
     */
    public static Set<String> sortByScore() {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        Set<String> articles = jedis.zrevrange("score", 0, -1);
        return articles;
    }

    /**
     * 通过vote给文章排序
     * @return 文章集合
     */
    public static Set<String> sortByUpAndDown() {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        Set<String> articles = jedis.zrevrange("vote", 0, -1);
        return articles;
    }
}
