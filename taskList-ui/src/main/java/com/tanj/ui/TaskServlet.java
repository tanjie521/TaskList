package com.tanj.ui;

import com.tanj.service.ITaskService;
import com.tanj.service.TaskService;
import com.tanj.untils.R;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: tanjie
 * @Date: 2020/3/19 20:17
 * @Description:
 */
@WebServlet("/TaskServlet")
public class TaskServlet extends HttpServlet {

    ITaskService service=new TaskService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String json= R.ok(service.queryAllList()).Json();

        response.getWriter().write(json);
    }
}
