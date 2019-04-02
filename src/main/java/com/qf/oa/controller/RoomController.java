package com.qf.oa.controller;

import com.github.pagehelper.PageInfo;
import com.qf.oa.entity.Room;
import com.qf.oa.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private IRoomService roomService;
    @RequestMapping("page/{currentPage}")
    public String getList(@PathVariable String currentPage, Model model){
        PageInfo<Room> pageInfo=roomService.getPageList(currentPage);
        model.addAttribute("pageInfo",pageInfo);
        return "roomList";
    }
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "roomAdd";
    }
    @RequestMapping("/add")
    public String add(Room room){
        roomService.insertSelective(room);
        return "redirect:/room/page/1";
    }
}
