package org.example.todolist.Configs;

import org.example.todolist.Entities.ToDo;
import org.example.todolist.Services.ToDoList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class toDoListConfig {


    @Bean
    public List<ToDo> getToDoList(){
        return new ArrayList<ToDo>();
    }
}
