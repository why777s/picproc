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
<br/>
<h4>
    X情级别:
    <s:property value="pornLevel"/>
    <br/>
    暴恐级别:
    <s:property value="terrorLevel"/>
</h4>
<br/>
<img src="<s:property value="'uploadFiles/'+uploadFileName"/>" width="50%" height="50%"/>
<br/>
<br/>
文件名：
<s:property value="uploadFileName"/>
<br/>
文件类型：
<s:property value="uploadContentType"/>
<br/>
保存路径:
<s:property value="savePath"/>
</body>
</html>
