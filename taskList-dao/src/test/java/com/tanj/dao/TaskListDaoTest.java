package com.tanj.dao;

import com.tanj.entites.Task;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: tanjie
 * @Date: 2020/3/18 00:00
 * @Description:
 */
public class TaskListDaoTest {

    @Test
    public void getAllTasks() {
        TaskListDao dao=new TaskListDao();
        List<Task> allTasks = dao.getAllTasks();
        Assert.assertEquals(2, allTasks.size());

    }
}