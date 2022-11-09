

$(document).ready(function(){
	
	
	$('#testBtn').click(function(e){
		e.preventDefault();
		$('#testModal').modal("show");
	});
	
	
	$.ajax({
		url:'./todo/all',
		type:'get',
		data:{},
		success:function(list){
			$('#tood-list').empty();
			$.each(list,function(index,item){
				
				$('#todo-list').append(`
					<div class="todo-list-box">
						<div style="display:flex;justify-content:space-between;">
							<span>
								<span class="tag-box ${item.importance=='중요' ? 'red' : 'yellow'}">${item.importance}</span>
								<span class="title">${item.type}</span>
							</span>
							<span class="date">
								${item.created_date.split(' ')[0]} 작성
							</span>
						</div>
						<p class="content">
							${item.title}
						</p>
					</div>	
				`);
			});
			
		},
		error:function(err){}
	})
	
	
	$('#go-add-todo-btn').click(function(){
		location.href='./add_todo';
	});
});