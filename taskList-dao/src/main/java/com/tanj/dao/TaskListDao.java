package com.tanj.dao;

import com.tanj.entites.Task;
import com.tanj.untils.JDBCUtils;

import java.util.List;

/**
 * @Auther: tanjie
 * @Date: 2020/3/17 23:13
 * @Description:
 */
public class TaskListDao {
public List<Task> getAllTasks(){

    return JDBCUtils.queryForList("select id,title,status from task",Task.class);
}

}
