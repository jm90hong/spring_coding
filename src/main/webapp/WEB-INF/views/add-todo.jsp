<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>일정 추가하기</title>
	<link rel="icon" href="./image/logo-icon.png">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" href="./css/app.css"/>
	<script src="https://kit.fontawesome.com/9299056aff.js" crossorigin="anonymous"></script>
	
	<script src="https://code.jquery.com/jquery-3.6.1.min.js"
	  integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
	  crossorigin="anonymous"></script>
	  
	<script src="./js/add-todo.js"></script>
</head>
<body>
	
	<header>
		<div class="header">
			<img src="./image/logo.png"/>
			
			<div>
				<span class="menu-item">개발하기</span>
				<span class="menu-item">웹프론트</span>
				<span class="menu-item">자바스크립트</span>
				<span class="menu-item">데이터베이스</span>
				<span class="menu-item">웹프레임워크</span>
			</div>
		</div>
	</header>
	
	<div align="center" style="padding-top:120px;">
		<div style="font-family:bold;font-size:28px;">
			개발공부 일정등록
		</div>
		<div style="display:flex;flex-direction:column;align-items:center;">
			<select id="type" class="app-select-box">
				<option value="웹프론트">웹프론트</option>
				<option value="웹백엔드">웹백엔드</option>
				<option value="데이터베이스">데이터베이스</option>
				<option value="리눅스서버">리눅스서버</option>
			</select>
			<select id="importance" class="app-select-box">
				<option value="중요">중요</option>
				<option value="보통">보통</option>
			</select>
			<input id="name" class="app-inp" placeholder="이름"/>
			<input id="title" class="app-inp" placeholder="개발공부 내용"/>
			
			
			<button id="add-todo-btn" class="app-long-btn">
				일정등록하기
			</button>
			
		</div>
	</div>
	
	
	
</body>
</html>