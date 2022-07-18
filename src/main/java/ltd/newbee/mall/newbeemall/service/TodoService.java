package ltd.newbee.mall.newbeemall.service;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.vo.TodoVO;

public interface TodoService {
//	get data
	List<TodoVO> getTodoList();

	// insert data
	//int insertTodo(Map<String, Object> todo);
	List<TodoVO> insertTodo(Map<String,Object> todo);

	// update status
	List<TodoVO> updateTodoList(int taskId,Map<String,Object> todoMap);
	
//	delete data
	List<TodoVO> deleteTodo(int taskId);
}
