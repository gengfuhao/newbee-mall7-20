package ltd.newbee.mall.newbeemall.dao;

import java.util.List;

import ltd.newbee.mall.newbeemall.entity.Todo;

public interface TodoMapper {
	List<Todo> findTaskByTaskId(int taskId);
}
