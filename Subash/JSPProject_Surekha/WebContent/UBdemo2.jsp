<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.wipro.bean.Candidate"></jsp:useBean>
<jsp:setProperty property="candID" name="obj" value="102"/>
<jsp:setProperty property="candName" name="obj" value="Mary"/>
<jsp:setProperty property="course" name="obj" value="Oracle"/>
<pre>
Cand Id <jsp:getProperty property="candID" name="obj"/>
Cand Name <jsp:getProperty property="candName" name="obj"/>
Cand Course <jsp:getProperty property="course" name="obj"/>
</pre>



</body>
</html>