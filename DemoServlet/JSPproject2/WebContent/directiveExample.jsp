<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%-- the next line is for example of import directive   --%>

<%-- <%@ page import="java.util.Date" %> --%>

<%-- the next line is for example of import multiple package by comma separated   --%>

<%@ page import="java.util.Date,java.util.ArrayList" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<%
Date d1 = new Date();
ArrayList alist=null;
%>
<%=d1 %>

<%
alist.add("one");
alist.add("two");
%>


</pre>
</body>
</html>