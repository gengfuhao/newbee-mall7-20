package ltd.newbee.mall.newbeemall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class TodoController {
	@Resource
	private TodoService todoService;
	
	@GetMapping("/todo")
	@ResponseBody
	public Result getgoodsDetail(int taskId) {
		return ResultGenerator.genSuccessResult(todoService.getTodoList(taskId));
	}
}
