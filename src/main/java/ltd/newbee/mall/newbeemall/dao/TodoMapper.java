package ltd.newbee.mall.newbeemall.dao;

import java.util.List;
import java.util.Map;

import ltd.newbee.mall.newbeemall.entity.Todo;

public interface TodoMapper {
//	get data
	List<Todo> findTaskByTaskId();
	
	//insert data
	int insertTodo(Map<String,Object> todo );
	int findMaxTaskId(); //採番
	
	//update data
	int updateTodo(int taskId,int status);
	//List<Todo> findUpdatedTodo(int taskId);
	
	//update status
	int deleteTodo(int taskId);
}
