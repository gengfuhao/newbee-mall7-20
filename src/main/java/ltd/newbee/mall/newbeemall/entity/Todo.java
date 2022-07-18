package ltd.newbee.mall.newbeemall.entity;

import java.util.Date;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Todo {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2943406+09:00", comments="Source field: todo.task_id")
    private Integer taskId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2963362+09:00", comments="Source field: todo.task")
    private String task;

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2963362+09:00", comments="Source field: todo.data")
//    private Date data;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+9")
	private Date date;
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2963362+09:00", comments="Source field: todo.status")
    private Integer status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2963362+09:00", comments="Source field: todo.task_id")
    public Integer getTaskId() {
        return taskId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2963362+09:00", comments="Source field: todo.task_id")
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2963362+09:00", comments="Source field: todo.task")
    public String getTask() {
        return task;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2963362+09:00", comments="Source field: todo.task")
    public void setTask(String task) {
        this.task = task == null ? null : task.trim();
    }

//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2963362+09:00", comments="Source field: todo.data")
//    public Date getData() {
//        return data;
//    }
//
//    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2963362+09:00", comments="Source field: todo.data")
//    public void setData(Date data) {
//        this.data = data;
//    }
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
    
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2973328+09:00", comments="Source field: todo.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-07-18T08:59:37.2973328+09:00", comments="Source field: todo.status")
    public void setStatus(Integer status) {
        this.status = status;
    }
}