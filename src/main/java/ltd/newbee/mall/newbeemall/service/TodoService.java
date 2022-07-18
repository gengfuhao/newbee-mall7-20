package ltd.newbee.mall.newbeemall.service;

import java.util.List;

import ltd.newbee.mall.newbeemall.vo.TodoVO;

public interface TodoService {
	List<TodoVO> getTodoList(int taskId);
}
