<html>
<body>
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
if(session.getAttribute("loggedUser") ==null)
{
	response.sendRedirect("login.jsp");
}
%>
<h1>Welcome to our website</h1>
${loggedUser.username} 

<form action="Logout">
<input type="submit" value="logout">
</form>
</body>
</html>