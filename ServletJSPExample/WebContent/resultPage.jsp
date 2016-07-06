<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
<%
String repliedName=(String) request.getAttribute("nameAttribute");
String repliedPass= (String) request.getAttribute("passAttribute");
%>
<table>
<th><td>Id</td><td>Name</td><td>pass</td></th>
<%for(int i=0; i <=10; i++){%>
<tr><td><%=i %></td><td><%=repliedName %></td><td><%=repliedPass %></td></tr>
<%
//out.print("<br>-------" + i + "-------<br>");
//out.print("<br>my name is: " + repliedName);
//out.print("<br>my pass is: "+ repliedPass);
}
%>
</table>

</body>
</html>