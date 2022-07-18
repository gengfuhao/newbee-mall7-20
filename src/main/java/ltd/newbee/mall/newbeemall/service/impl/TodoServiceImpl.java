package ltd.newbee.mall.newbeemall.service.impl;

import java.util.List;

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
	@Override
	public List<TodoVO> getTodoList(int taskId) {
	List<Todo> entityList = todoMapper.findTaskByTaskId(taskId);
	List<TodoVO> VoList =BeanUtil.copyList(entityList, TodoVO.class);
	return VoList;
	}

}
