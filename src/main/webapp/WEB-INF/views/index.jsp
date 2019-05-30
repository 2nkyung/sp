<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="/resources/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	/* 	$(document).ready(function() {
	 $('[type=button]').click(function() {
	 var param = {
	 uiId : document.querySelector('#id').value,
	 uiPwd : document.querySelector('#pwd').value
	 };
	 //var param = {uiId:$('#id').val(),uiPwd:$('#pwd').val()};
	 $.ajax({
	 url : '/login',
	 method : 'POST',
	 contentType : 'application/json',
	 data : JSON.stringify(param),
	 success : function(res) {
	 console.log(res);
	 }
	 });
	 });
	 })
	 */

	/* $(document).ready(function() {
		$('#test').html('하하하');
		$('[type=button]').click(function() {
			$.ajax({
				url : '/userinfos',
				method : 'GET',
				success : function(res) {
					console.log(res)
				}
			});
		}); 
	 */

	$(document).ready(function() {
		$('#test').html('하하하');
		$('[type=button]').click(function() {
			var param = {
				uiId : document.querySelector('#id').value,
				uiPwd : document.querySelector('#pwd').value
			};
			console.log(param);
			$.ajax({
				url : '/login',
				method : 'POST',
				headers : {
					'Content-Type' : 'application/json'
				},
				data : JSON.stringify(param),
				success : function(res) {
					console.log(res)
				}
			});
		});
	})
</script>
<body>
	<form id="loginForm">
		<label for="id">아이디 : </label> <input type="text" id="id"> <br>
		<label for="pwd">비밀번호 : </label> <input type="password" id="pwd">
		<br>
		<button type="button">로그인</button>
	</form>

</body>
</html>
