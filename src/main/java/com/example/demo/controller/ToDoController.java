package com.example.demo.controller;


import com.example.demo.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Controller
//@SessionAttributes("name")
public class ToDoController {

    private ToDoService toDoService;


    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    public ToDoService getToDoService() {
        return toDoService;
    }

    @Autowired
    public void setToDoService(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @RequestMapping("to-do-list")
    public String accessListToDoPage(ModelMap modelMap) {
        modelMap.addAttribute("listToDo", toDoService.getListTo());
        return "listToDos";
    }

    @RequestMapping("ok")
    @ResponseBody
    public String gg() {
        return "hello";
    }


    @RequestMapping("session-map")
    public String sessionMain() {
        return "sessionName";
    }

    @RequestMapping("sessionSub-map")
    public String sessionSub() {
        return "subSession";
    }


    @RequestMapping(value = "add-to-do", method = RequestMethod.GET)
    public String addToDo(ModelMap modelMap) {
        ToDo todo = new ToDo("5", "", "", LocalDate.now().plusDays(2), false);
        modelMap.put("todo", todo);
        return "addToDo";
    }

    @RequestMapping(value = "add-to-do", method = RequestMethod.POST)
    public String addToDoPost(ModelMap modelMap, ToDo todo) {
//        DateTimeFormatter dateF=DateTimeFormatter.ISO_LOCAL_DATE;
//        LocalDate dateLD=   LocalDate.parse(date,dateF);
        System.out.println(todo);
//        var toDo=new ToDo(new Random().nextInt(20)+"",username,description,targetDate,false);
        toDoService.addNew(todo);

        return "redirect:to-do-list";
    }
}
