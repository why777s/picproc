<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: why777s
  Date: 2017/6/18
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<s:form action="upload" method="POST" enctype="multipart/form-data">
    <s:file name="upload"/>
    <s:submit value="上传"/>
</s:form>


</body>
</html>
