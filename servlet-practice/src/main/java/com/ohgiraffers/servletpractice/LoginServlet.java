package com.ohgiraffers.servletpractice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<head>")
                .append("<title>Login Page</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>Login Page</h1>")
                .append("</h3> GET 방식의 요청")
                .append("</h3>")
                .append("<form action=\"/login\" method=\"post\">")
                .append("<label>이름 : ")
                .append("</label>")
                .append("<input type=\"text\" name=\"username\">")
                .append("<br>")
                .append("<label>비밀번호 : ")
                .append("</label>")
                .append("<input type=\"text\" name=\"password\">")
                .append("<br>")
                .append("<input type=\"submit\" value=\"LOGIN\">")
                .append("</form>")
                .append("</body>")
                .append("</html>");

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.print(sb);
        out.flush();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        String name = "홍길동";
        String pwd = "1234";

        StringBuilder loginMessage = new StringBuilder();

        if(username.equals(name) && password.equals(pwd)) {
            loginMessage.append("로그인 성공");
        } else {
            loginMessage.append("로그인 실패");
        }

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.print(loginMessage);
        out.flush();
        out.close();
    }
}
