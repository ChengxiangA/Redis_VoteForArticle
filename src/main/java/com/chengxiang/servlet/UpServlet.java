package com.chengxiang.servlet;

import com.chengxiang.Utils.JedisUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

public class UpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String articleId = req.getParameter("articleId");
        String uid = "" + new Random().nextInt(10000);
        JedisUtil.upArticle(articleId,uid);
        String sortId = req.getParameter("sortId");
        resp.sendRedirect("sort?sortId=" + sortId);
        System.out.println("用户" + uid + "点赞了文章" + articleId);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
