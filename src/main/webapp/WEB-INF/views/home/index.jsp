<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>我的首页  微博-随时随地发现新鲜事</title>
        <!-- 新 Bootstrap 核心 CSS 文件 -->
        <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
        
        <!-- 可选的Bootstrap主题文件（一般不用引入） -->
        <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
        
        <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
        <script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
        
        <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
        <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        
        <script src="/assets/js/weibo.js"></script>
        <style type="text/css">
            body{
                margin:20px;
                background:#0e3c6e;
            }
           .send{
                float:right;
            }
            .top{
                border:1px;
            }
        </style>
        
    </head>
    <body>

        <div class="container center-block">
              <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-7">
                    <div class="top">
                        <textarea rows="5" cols="80" id="content" name="content"></textarea>
                        <input class="send" type="button" value="发送"/>
                    </div>
                </div>
                <div class="col-md-3">sdv</div>
              </div>
              <div class="row">
                <div class="col-md-2"></div>
                <div class="col-md-7">
                    <div id="list" class="list">
                        <c:forEach items="${pi.list }" var="w">
                            <div class="weibo">
                                <div class="content">
                                    <img class="h" alt="${w.account.name }" src="/assets/image/1.jsp">
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="col-md-3">dsf
                    
                </div>
              </div>
        </div>
        
    </body>
    <script type="text/javascript">
        $(function(){
            WEIBO.init();
        });
        
        
    </script>
</html>