<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Login</title>
</head>
<body>
  <h1>Login</h1>
  <h3>GET 방식의 요청</h3>
  <form action="login" method="post">
    <label>사용자명 : </label><input type="text" name="username">
    <br>
    <label>비밀번호 : </label><input type="text" name="password">
    <br>
    <input type="submit" value="LOGIN">
  </form>
  <h3>POST 방식의 요청</h3>
  <form action="login" method="post">
    <label>사용자명 : </label><input type="text" name="username">
    <br>
    <label>비밀번호 : </label><input type="text" name="password">
    <br>
    <input type="submit" value="LOGIN">
  </form>
</body>
</html>