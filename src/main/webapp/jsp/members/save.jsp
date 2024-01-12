<%@ page import="ddongle.meali.domain.member.Member" %>
<%@ page import="ddongle.meali.domain.member.MemberRepository" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    MemberRepository memberRepository = MemberRepository.getInstance();

    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    id: <%= member.getId() %>
    username: <%= member.getUsername() %>
    age : <%= member.getAge()%>
<li>
    <a href="/index.html">메인</a>
</li>
</body>
</html>