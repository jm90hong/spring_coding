

$(document).ready(function(){
	
	
	$('#delete-btn').click(function(){
		var con = confirm('정말 삭제하시겠습니까?');
		if(con){
			$.ajax({
				url:'./todo/delTodo',
				type:'post',
				data:{
					todo_idx:$('#k-todo-idx').val()
				},
				success:function(response){
					if(response=='ok'){
						alert('삭제완료!');
						location.replace('./');
					}
				},
				error:function(err){
					
				}
			})		
		}	
	});
	
	
	$('#complete-btn').click(function(){
		$.ajax({
			url:'./todo/updateComplete',
			type:'post',
			data:{
				todo_idx:$('#k-todo-idx').val(),
				ny:'y'
			},
			success:function(response){
				if(response=='ok'){
					alert('할일 성공!');
					location.replace('./');
				}
			},
			error:function(err){
				
			}
		})		
	});
	
});