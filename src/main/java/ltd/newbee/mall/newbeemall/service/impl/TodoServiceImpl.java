package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ltd.newbee.mall.newbeemall.dao.TodoMapper;
import ltd.newbee.mall.newbeemall.entity.Todo;
import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.util.BeanUtil;
import ltd.newbee.mall.newbeemall.vo.TodoVO;

@Service
public class TodoServiceImpl implements TodoService {

	@Resource
	TodoMapper todoMapper;
	
	//get data
	@Override
	public List<TodoVO> getTodoList() {
	List<Todo> entityList = todoMapper.findTaskByTaskId();
	List<TodoVO> VoList =BeanUtil.copyList(entityList, TodoVO.class);
	return VoList;
	}
	
	//insert data
	@Override
	public List<TodoVO> insertTodo(Map<String, Object> todo) {
		int newTaskId=todoMapper.findMaxTaskId()+1;
		todo.replace("taskId", newTaskId);
		todoMapper.insertTodo(todo);
		List<Todo> entityList = todoMapper.findTaskByTaskId();
		List<TodoVO> VoList =BeanUtil.copyList(entityList, TodoVO.class);
		return VoList;
	}

	//update status
	@Override
	public List<TodoVO> updateTodoList(int taskId, Map<String, Object> todoMap) {
		int status=(int) todoMap.get("status");
		todoMapper.updateTodo(taskId,status);
		List<Todo> entityList = todoMapper.findTaskByTaskId();
		List<TodoVO> VoList =BeanUtil.copyList(entityList, TodoVO.class);
		return VoList;
	}

	//delete data
	@Override
	public List<TodoVO> deleteTodo(int taskId) {
		todoMapper.deleteTodo(taskId);
		List<Todo> entityList = todoMapper.findTaskByTaskId();
		List<TodoVO> VoList =BeanUtil.copyList(entityList, TodoVO.class);
		return VoList;
	}

}
