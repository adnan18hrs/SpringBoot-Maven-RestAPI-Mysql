<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script src="jquery-3.5.1.min.js"></script>
<script>
var data;
	$(document).ready(function(){
		//On click below button btnClick will get triggered and and getUserAllDetails(handler) is triggered
		$('#btnClick').click(function(){
			$.ajax({
				//this data is going to server
				url:"/getUserByID/"+$('#uid').val(),
				type:"POST",
				contentType:"application/json",//type of data going to server
				dataType:"json",//type of data coming from server
				success:function(r){ //whatever data is coming from getUserAllDetails will be inserted as 'r' inside function
					data=r;
					alert(r)
				}
			})
		})
	})
</script>

</head>

<body>
	<h1> Operation Form </h1>
	
	<form>
		User By ID : <input id="uid" name="UID"/><br>
		<select name="ddlFlag"> 
			<option value="select"> Select Records</option>
			<option value="delete"> Delete Records</option>
			<option value="update"> Update Records</option>
			<option value="custom"> Custom Records</option>
		</select><br>
		<%-- on clicking button above javascript code will run --%>
		<input id="btnClick" type="button" value="Click Now"/><br>
	</form>
	
</body>
</html>