<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Thêm Sinh Viên</h1>
	<form action="addsv" method="post">
		<h1>Thêm Sinh Viên</h1>
		<table border="1">
			<tr>
				<th>Tên</th>
				<th>Tuổi</th>
			</tr>
			<tr>
				<td>
					<input type="text" id="name" name="name">
				</td>
				<td>
					<input type="number" id="age" name="age">
				</td>
			</tr>
			<tr><input type="submit" value="Thêm"></tr>
		</table>
	</form>
</body>
</html>