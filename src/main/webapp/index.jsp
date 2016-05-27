<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>
    <form action="/login" method="post">
        <input type="text" name="email" />
        <input type="password" name="password" />
        <input type="submit" value="登陆" />
        
    </form>
    <a href="/register"><input type="submit" value="注册"></a>
</body>
</html>