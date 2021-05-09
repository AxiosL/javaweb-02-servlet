<%--
  Created by IntelliJ IDEA.
  User: 元仔
  Date: 2021/5/5
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h1>赶紧登录</h1>

<div style="text-align: center">
    <%--以post的方式提交表单，提交到login请求--%>

    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        爱好：
        <input type="checkbox" name="hobby" value="男孩">男孩
        <input type="checkbox" name="hobby" value="女孩">女孩
        <input type="checkbox" name="hobby" value="打球">打球

        <br>
        <input type="submit">
    </form>


</div>

</body>
</html>
