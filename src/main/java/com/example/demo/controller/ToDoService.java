package com.example.demo.controller;

import com.example.demo.entity.ToDo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
public class ToDoService {

    private static List<ToDo> listToDo;
    static {
       listToDo=new ArrayList<>();
        listToDo.add(new ToDo("1","Learn AWS","Continue to learn", LocalDate.now().plusDays(2),false));
        listToDo.add(new ToDo("2","Learn Spring","Continue to learn", LocalDate.now().plusDays(2),false));
        listToDo.add(new ToDo("3","Learn Java","Continue to learn", LocalDate.now().plusDays(2),false));

    }

    public  void  addNew(ToDo toDo){
        listToDo.add(toDo);
    }
//    public  static List<ToDo> findToDoById(String id){
//
//        List<ToDo> listTd=new ArrayList<ToDo>();
//        for (var toDo : listToDo
//             ) {
//            if(id.equals(toDo.getId())) listTd.add(toDo);
//        }
//        return listTd;
//    }

    public List<ToDo> getListTo(){
    return listToDo;
    }

}
