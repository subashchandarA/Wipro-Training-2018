<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String name ="wipro"; %>

<h1>Hello <%=name %> </h1>

<%
for(int i=0;i<7;i++){
%>
	   <h<%=i%>> Subash chandar</h<%=i%>>
	
<%	
 }
%>
<h1> Result = <%=name %></h1>

</body>
</html>