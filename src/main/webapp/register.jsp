<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
    <form action="/regist" method="post">
                         邮箱或电话：<input type="text" name="email" />
                                     密码:<input type="password" name="password" />
                                     
    </form>
    <a href="/success.html"><input type="submit" value="注册" /></a>
</body>
</html>