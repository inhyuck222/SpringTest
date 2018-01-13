<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<p><a href="${pageContext.request.contextPath}/offers">show current offers</a></p>
<p><a href="${pageContext.request.contextPath}/createOffer">insert offer</a></p>

</body>
</html>
