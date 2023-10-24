<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Danh sách sinh viên</title>
</head>
<body>
	<h1>Danh sách sinh viên</h1>
	<h1>Kết quả:</h1>
	<p>
		Xin chào,
		<%=request.getAttribute("name")%>!
	</p>

	<table>
		<tr>
			<th>Tên</th>
			<th>Tuổi</th>
			<th>Mã số sinh viên</th>
		</tr>

		<c:forEach items="${username}" var="username">
			<tr>
				<td>${username}</td>
				<td>${username}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>