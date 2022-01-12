package com.chengxiang;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Date;

public class redisTest {
    /**
     * 对redis进行初始化
     */
    @Test
    public void startRedis() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        //文章的hash表
        //文章1
        jedis.hset("article:1", "articlePushTime", "1641961298090");
        jedis.hset("article:1", "upNum", "0");
        jedis.hset("article:1", "downNum", "0");
        //文章2
        jedis.hset("article:2", "articlePushTime", "1641966698090");
        jedis.hset("article:2", "upNum", "0");
        jedis.hset("article:2", "downNum", "0");
        //文章3
        jedis.hset("article:3", "articlePushTime", "1641965598090");
        jedis.hset("article:3", "upNum", "0");
        jedis.hset("article:3", "downNum", "0");
        //根据文章发布时间生成的时间zset集合
        jedis.zadd("time",1641961298090d,"article:1");
        jedis.zadd("time",1641966698090d,"article:2");
        jedis.zadd("time",1641965598090d,"article:3");
        //根据文章发布时间和up、down数生成的分数zset集合
        jedis.zadd("score",1641961298090d,"article:1");
        jedis.zadd("score",1641966698090d,"article:2");
        jedis.zadd("score",1641965598090d,"article:3");
        //根据文章获得的up、down数生成的票数set集合
        jedis.zadd("vote",0d,"article:1");
        jedis.zadd("vote",0d,"article:2");
        jedis.zadd("vote",0d,"article:3");
        //对某个文章up的用户集合
        jedis.sadd("upvote:1","user:1");
        jedis.sadd("upvote:2","user:1");
        jedis.sadd("upvote:3","user:1");
        //对某个文章down的用户集合
        jedis.sadd("downvote:1","user:1");
        jedis.sadd("downvote:2","user:1");
        jedis.sadd("downvote:3","user:1");
        jedis.close();
    }

    /**
     * 清空redis
     */
    @Test
    public void endRedis() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.flushDB();
        jedis.close();
    }
}
