<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>일정 상세보기</title>
	<link rel="icon" href="./image/logo-icon.png">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" href="./css/app.css"/>
	<link rel="stylesheet" href="./css/other.css"/>
	<script src="https://kit.fontawesome.com/9299056aff.js" crossorigin="anonymous"></script>
	
	<script src="https://code.jquery.com/jquery-3.6.1.min.js"
	  integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
	  crossorigin="anonymous"></script>
	  
	<script src="./js/detail-todo.js"></script>
</head>
<body>
	
	
	<div  style="padding-top:120px;width:1000px;margin:0 auto;">
		<input id="k-todo-idx" type="hidden" value="${todo.todo_idx}"/>
		<div id="title" style="font-family:bold;font-size:22px;">
			${todo.title}
		</div>
		<div>
			<div class="inf-box">
				<span class="t">중요도</span>
				<span class="c">${todo.importance}</span>
			</div>
			
			<div class="inf-box">
				<span class="t">공부분야</span>
				<span class="c">${todo.type}</span>
			</div>
			
			<div  class="inf-box">
				<span class="t">글쓴이</span>
				<span class="c">${todo.name}</span>
			</div>
		</div>
		
		<div>
			<button class="app-long-btn danger" id="delete-btn" style="width:100px;">삭제하기</button>
			<button class="app-long-btn"  id="complete-btn" style="width:100px;">완료하기</button>
		</div>
	</div>
	
	
	
</body>
</html>