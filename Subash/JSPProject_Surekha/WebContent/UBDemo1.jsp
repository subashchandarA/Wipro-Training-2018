<%@page import="com.wipro.bean.Candidate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//using traditional model

Candidate obj = new Candidate();
obj.setCandID(101);
obj.setCandName("Dany");
obj.setCourse("Java");

%>
<!-- Printing the data  -->
Candidate ID = <%=obj.getCandID() %><br>
Candidate Name = <%=obj.getCandName() %><br>
Candidate Course = <%=obj.getCourse() %><br>
</body>
</html>