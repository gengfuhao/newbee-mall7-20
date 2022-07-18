package ltd.newbee.mall.newbeemall.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ltd.newbee.mall.newbeemall.service.TodoService;
import ltd.newbee.mall.newbeemall.util.Result;
import ltd.newbee.mall.newbeemall.util.ResultGenerator;

@Controller
public class TodoController {
	@Resource
	private TodoService todoService;

	// get data
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/todo")
	@ResponseBody
	public Result getgoodsDetail() {
		return ResultGenerator.genSuccessResult(todoService.getTodoList());
	}

	//add data
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/todo")
	@ResponseBody
	public Result insertTodo(@RequestBody HashMap<String, Object> todo) {
		return ResultGenerator.genSuccessResult(todoService.insertTodo(todo));
	}

	
	//update status
	@CrossOrigin(origins = "http://localhost:3000")
	@PatchMapping("/todo/{taskId}")
	@ResponseBody
	public Result updateTodo(@PathVariable("taskId") Integer taskId,@RequestBody HashMap<String, Object> todoMap) {
		return ResultGenerator.genSuccessResult(todoService.updateTodoList(taskId,todoMap));
		
	}
	
	//delete data
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/todo/{taskId}")
	@ResponseBody
	public Result deleteTodo(@PathVariable("taskId") Integer taskId) {
		return ResultGenerator.genSuccessResult(todoService.deleteTodo(taskId));
		
	}
	
}
