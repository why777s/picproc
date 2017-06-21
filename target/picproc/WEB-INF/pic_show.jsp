<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: why777s
  Date: 2017/6/19
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
上传成功!
<br/>
文件为:
<img src="<s:property value="'uploadFiles/'+uploadFileName"/>" width="50%" height="50%" align="center"/>
<h4>
    文件名：
    <s:property value="uploadFileName"/>
    <br/>
    文件类型：
    <s:property value="uploadContentType"/>
    <br/>
    <s:property value="savePath"/>
</h4>
<br/>
</body>
</html>
