package com.qf.oa.controller;

import com.github.pagehelper.PageInfo;
import com.qf.oa.entity.Room;
import com.qf.oa.entity.Teacher;
import com.qf.oa.service.IRoomService;
import com.qf.oa.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private ITeacherService teacherService;

    @Autowired
    private IRoomService roomService;

    @RequestMapping("/page/{pn}")
    private String page(@PathVariable Integer pn, Model model){
        PageInfo pageInfo=teacherService.getList(pn);
        model.addAttribute("pageInfo", pageInfo);
        return "teacherList";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        List<Room> list=roomService.getRoomList();
        model.addAttribute("roomList", list);
        return "teacherAdd";
    }

}
