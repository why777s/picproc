<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: why777s
  Date: 2017/6/18
  Time: 00:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--<script type="application/javascript">--%>
        <%--function loginn() {--%>
            <%--target_form = document.forms[0];--%>
            <%--target_form.action = "login";--%>
        <%--}--%>
        <%--function regisst() {--%>
            <%--target_form = document.forms[0];--%>
            <%--target_form.action = "regist";--%>
        <%--}--%>
    <%--</script>--%>
</head>
<body>

<s:form action="login">
    <s:textfield name="uid"/>
    <s:password name="userpwd"/>
    <s:submit value="登录" />
</s:form>
</body>
</html>
