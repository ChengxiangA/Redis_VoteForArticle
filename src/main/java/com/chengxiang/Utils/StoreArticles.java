package com.chengxiang.Utils;

import com.chengxiang.bean.Article;

import java.util.ArrayList;
import java.util.List;

public class StoreArticles {
    public static Article getArticles(String articleId) {
        Article article1 = new Article("1", "白夜行", "《白夜行》是日本作家东野圭吾创作的长篇小说，也是其代表作。该小说于1997年1月至1999年1月间连载于期刊，单行本1999年8月在日本发行。故事围绕着一对有着不同寻常情愫的小学生展开。1973年，大阪的一栋废弃建筑内发现了一具男尸，此后19年，嫌疑人之女雪穗与被害者之子桐原亮司走上截然不同的人生道路，一个跻身上流社会，一个却在底层游走，而他们身边的人，却接二连三地离奇死去，警察经过19年的艰苦追踪，终于使真相大白。"
                , "/vote/img/article1.png", "2020-01-03", "东野圭吾");
        Article article2 = new Article("2", "恶意", "《恶意》讲述的是作家在出国前一晚被杀，警方很快锁定了凶手，但事情的真相绝非如此 [1]  。其主体部分表现为第一人称不定内聚焦型叙述，并充分体现了内聚焦叙述的特点 [2]  。故事在结尾戛然而止，使得读者不能迅速从叙事语篇的指示中心中抽离出来，这种抽离的缺失往往会更加引人深思，更能体会小说的主题，即人性的恶意 [3]  。"
                , "/vote/img/article2.png", "2020-01-04", "东野圭吾");
        Article article3 = new Article("3", "嫌疑人X的献身", "沉默寡言的天才数学家石固（柳承范饰）每天唯一的乐趣，便是去固定的便当店买午餐，只为看一眼在便当店做事的邻居花善（李瑶媛饰）。花善与女儿允儿相依为命，可是有一个总来找麻烦的前夫金哲民。终于有一天，花善手刃了前来纠缠的前夫。石固察觉花善出于自卫而杀人的事实后，主动提出由他料理善后，为这桩犯罪设计了完美的不在场的证明 [2]  。"
                , "/vote/img/article3.png", "2020-01-05", "东野圭吾");
        List<Article> articles = new ArrayList<>();
        if("1".equals(articleId)) {
            return article1;
        } else if("2".equals(articleId)){
            return article2;
        } else {
            return article3;
        }
    }
}
