<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ page import="java.util.ArrayList" %> --%>
<%@ page import="java.util.Date,java.util.ArrayList" 
		errorPage="NullError.jsp"	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<pre>
<%
Date d1 =new Date();
ArrayList alist=new ArrayList();
%>
<%= d1  %>
<%
alist.add("One");
alist.add("Two");
%>
Size of Array list is <%=alist.size() %>
</pre>
</body>
</html>


