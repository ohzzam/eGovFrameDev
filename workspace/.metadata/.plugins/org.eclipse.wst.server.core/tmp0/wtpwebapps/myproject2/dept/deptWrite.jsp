<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
	table {
		width:400px;
		border-collapse:collapse; /* cell 사이의 간격을 없애 주는 ..*/	
	}
	
	th,td{
		boder:1px solid #cccccc;
		padding:5px;
	}
</style>



<body>

<form name="frm" method="post"  action="deptWriteSave.do">

<table>
	
	<tr>
		<th>부서번호</th>
		<td><input type="text" name="deptno"></td>	
	</tr>
	
	<tr>
		<th>부서이름</th>
		<td><input type="text" name="dname"></td>	
	</tr>
	
    <tr>
		<th>부서위치</th>
		<td><input type="text" name="loc"></td>	
	</tr>

    <tr>
		<th colspan="2">
		<button type="submit">submit</button>
		</th>		
	</tr>
			
</table>

</form>

</body>
</html>