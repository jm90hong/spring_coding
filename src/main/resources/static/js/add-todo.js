

$(document).ready(function(){
	
	
	
	$('#add-todo-btn').click(function(){
		
		var con = confirm('일정을 등록 하시겠습니까?');
		
		if(con){
			var type=$('#type').val();
			var importance=$('#importance').val();
			var name=$('#name').val();
			var title=$('#title').val();
			
			
			
			if(name.length>0 && title.length>0){
				$.ajax({
					url:'./todo/add',
					type:'post',
					data:{
						type:type,
						name:name,
						title:title,
						im:importance
					},
					success:function(response){
						if(response=='ok'){
							alert('일정등록 완료');
							location.replace('./');	
						}
					},
					error:function(err){
						
					}
				});
			}else{
				alert('모든 내용을 입력해주세요.')
			}
			
			
		}
		
		
		
		
		
	
		
	});
});