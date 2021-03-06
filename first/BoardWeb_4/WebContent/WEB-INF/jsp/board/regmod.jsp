<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록/수정</title>
<style>
	* { margin: 0px; padding: 0px;}
	body {background: #2B3032;  margin-top : 100px; font-family:나눔고딕;}
	#frm{ width:830px; height: 600px;; margin: 0 auto;}

	.h33 {color: white;}
	#container { padding-top: 70px; text-align: center; width: 1000px; height: 650px; margin: 0 auto; background: #232729;} 
	.ipt{ font-family:나눔고딕; margin-top: 50px; border: 1px solid #4e4e4e; width: 800px; height: 30px; padding-left:10px;  padding-right: 10px; background:#2B3032; color: dedede;}
	.tpt{ font-family:나눔고딕; margin-top: 20px; border: 1px solid #4e4e4e; width: 800px; height: 300px; padding: 10px; background:#2B3032;}
	#button { font-family:나눔고딕; margin-top: 70px; margin-bottom:30px; width: 100px; height: 40px; color: #dedede; background: #4e4e4e; border: none;}
	#button:hover { font-weight: bold; color: white;}
	.ipt::placeholder { font-family:나눔고딕; color: #ffffff;}
	.tpt::placeholder { font-family:나눔고딕; color: #ffffff;}
</style>
</head>
<body>
	<div id="container">
		<h2 class="h33">게시글작성</h2>
		<form id="frm"action="regmod" method="post">
			<div><input class="ipt" type="text" class="input"name="title" placeholder="제목을 작성해주세요 (HTML코드를 사용하지 마세요)" value="${data.title}" style="color:#ffffff; font-weight:bold;"></div>
			<div><textarea class="tpt" name="cont" placeholder="내용을 작성해주세요 (HTML코드를 사용하지 마세요)" style="color:#ffffff;">${data.cont}</textarea></div>
			<input type="hidden" name="i_board" value="${data.i_board}">
			<div><input id="button" type="submit" value="등록"></div>
		</form>
	</div>
</body>
</html>