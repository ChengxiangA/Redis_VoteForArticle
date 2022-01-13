package com.chengxiang.servlet;

import com.chengxiang.Utils.JedisUtil;
import com.chengxiang.Utils.StoreArticles;
import com.chengxiang.bean.Article;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SortServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sortId = req.getParameter("sortId");
        Set<String> articlesId = null;
        if("1".equals(sortId)) {
            // 按照发布时间排序
            articlesId = JedisUtil.sortByPushTime();
        } else if("2".equals(sortId)) {
            // 按照点赞数排序
            articlesId = JedisUtil.sortByUpAndDown();
        } else {
            // 按照分数排序
            articlesId = JedisUtil.sortByScore();
        }
        List<Article> articles = new ArrayList<>();
        for(String articleId: articlesId) {
            String[] split = articleId.split(":");
            Article article = StoreArticles.getArticles(split[1]);
            article.setArticleUpNum(JedisUtil.getUpNum(split[1]));
            article.setArticleDownNum(JedisUtil.getDownNum(split[1]));
            articles.add(article);
        }
        req.setAttribute("articles",articles);
        req.getRequestDispatcher("page/article.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
