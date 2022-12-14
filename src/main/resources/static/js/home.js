

$(document).ready(function(){
	
	
	//go detail todo jsp
	$(document).on('click','.todo-list-box',function(){
		var todoIdx= $(this).data('todo-idx');
		location.href='./detail_todo?todo_idx='+todoIdx;
	});
	
	
	
	
	
	$.ajax({
		url:'./todo/all',
		type:'get',
		data:{},
		success:function(list){
			$('#tood-list').empty();
			$.each(list,function(index,item){
				
				var com;
				if(item.complete_ny=='y'){
					com="완료";
				}else{
					com="미완료";
				}
				
				$('#todo-list').append(`
					<div class="todo-list-box" data-todo-idx="${item.todo_idx}">
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
							[${com}] ${item.title}
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