<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章一览</title>
    <style type="text/css">
        #head {
            text-align: center;
        }
        #main {
            text-align: center;
        }
        .article {
            text-align: center;
        }
        table {
            width: 1000px;
            margin: auto;
        }
        img {
            width: 200px;
        }
    </style>
</head>
<body>
    <div id="head">
        <span>
            <a href="http://localhost:8080/vote/sort?sortId=1">按照发布时间排序</a>
        </span>
        <span>
            <a href="http://localhost:8080/vote/sort?sortId=2">按照点赞数排序</a>
        </span>
        <span>
            <a href="http://localhost:8080/vote/sort?sortId=3">综合排序</a>
        </span>
    </div>
    <div id="main">
        <c:forEach items="${requestScope.articles}" var="article">
            <div class="article">
                <table>
                    <tr>
                        <td width="200px">
                            <a href="http://localhost:8080/vote/up?articleId=${article.articleId}&sortId=${param.sortId}"><img class="click" src="img/up.png"></a>
                            <label>${article.articleUpNum}人点赞过</label>
                        </td>
                        <td rowspan="2">
                            <div>
                                ${article.articleInfo}
                            </div>
                        </td>
                        <td rowspan="2">
                            <img src="${article.articleImg}">
                        </td>
                    </tr>
                    <tr>
                        <td width="200px">
                            <a href="http://localhost:8080/vote/down?articleId=${article.articleId}&sortId=${param.sortId}"><img class="click" src="img/down.png"></a>
                            <label>${article.articleDownNum}人拉踩过</label>
                        </td>
                    </tr>
                </table>
            </div>
        </c:forEach>
    </div>
</body>
</html>
