package com.tanj.service;

import com.tanj.dao.TaskListDao;
import com.tanj.entites.Task;

import java.util.List;

/**
 * @Auther: tanjie
 * @Date: 2020/3/18 23:28
 * @Description:
 */
public class TaskService implements ITaskService {

    TaskListDao dao = new TaskListDao();

    public List<Task> queryAllList() {

        return dao.getAllTasks();
    }
}
