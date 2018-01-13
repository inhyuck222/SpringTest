<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<sf:form method="get"
		action="${pageContext.request.contextPath}/doCreate"
		modelAttribute="offer">
		<table class="formtable">
			<tr>
				<td class="label">name :</td>
				<td><sf:input class="control" path="name" /><br/> 
					<sf:errors path="name"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">email :</td>
				<td><sf:input class="control" path="email"></sf:input><br/>
					<sf:errors path="email"></sf:errors>
				</td>
			</tr>
			<tr>
				<td class="label">text</td>
				<td><sf:textarea class="control" path="text" row="10" col="10"></sf:textarea><br/>
					<sf:errors path="text"></sf:errors></td>
			</tr>
			<tr>
				<td class="label"></td>
				<td><input class="control" value="Create Offer" type="submit" /></td>
			</tr>
		</table>
	</sf:form>

</body>
</html>