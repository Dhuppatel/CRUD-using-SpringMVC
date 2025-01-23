package org.example.todolist.Services;

import lombok.Getter;
import lombok.Setter;
import org.example.todolist.Entities.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
@Service
public class ToDoList {
    @Override
    public String toString() {
        return "ToDoList{" +
                "toDoList=" + toDoList +
                '}';
    }

    public void deleteToDo(long id) {
        toDoList.removeIf(toDo -> toDo.getId() == id);

    }

    public List<ToDo> getAllToDos() {
        return toDoList;
    }

    private List<ToDo> toDoList;

    public ToDoList() {
        toDoList = new ArrayList<>();
    }

    public void addToDo(ToDo toDo) {
        toDoList.add(toDo);
    }

    public ToDo getToDoById(long id) {
        return toDoList.stream().filter(toDo -> toDo.getId() == id).findFirst().orElse(null);
    }

    public void updateToDo(ToDo todo) {
        for (int i = 0; i < toDoList.size(); i++) {
            if (toDoList.get(i).getId() == todo.getId()) {
                toDoList.set(i, todo);
                return;
            }

        }
    }
}