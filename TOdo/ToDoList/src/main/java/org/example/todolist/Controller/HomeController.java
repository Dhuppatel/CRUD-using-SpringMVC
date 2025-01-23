package org.example.todolist.Controller;

import org.example.todolist.Entities.ToDo;
import org.example.todolist.Services.ToDoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ToDoList toDoList;
//    @RequestMapping("/home")
//    public String home(Model m) {
//      m.addAttribute("page","home");
//        return "index";
//    }
    @RequestMapping("/")
    public String home(Model model) {
        return "index";
    }
    @RequestMapping("/add")
    public String addTodo(Model m) {
        m.addAttribute("page","addToDo");
        m.addAttribute("toDoForm",new ToDo());
        return "index";
    }
    @PostMapping("/save")
    public String SaveTodo(@ModelAttribute ToDo todo) {

        System.out.println(todo);
        toDoList.addToDo(todo);
        return "redirect:/view";
    }
    @RequestMapping("/view")
    public String viewToDos(Model model) {
        model.addAttribute("page","view");
        List<ToDo> todos = toDoList.getAllToDos();
        model.addAttribute("todos",todos);
        System.out.println(todos);
        return "index";
    }
    @RequestMapping("/delete/{id}")
    public String deleteToDo(@PathVariable long id) {
        toDoList.deleteToDo(id);
        return "redirect:/view";
    }
    @RequestMapping("/edit/{id}")
    public String editToDo(@PathVariable long id, Model model) {
        ToDo toDoEdit=toDoList.getToDoById(id);

        model.addAttribute("page","edit");
        model.addAttribute("toDoForm",toDoEdit);

        return "index";
    }
    @PostMapping("/update")
    public String updateToDo(@ModelAttribute ToDo todo,Model model) {
        toDoList.updateToDo(todo);
        List<ToDo> todos = toDoList.getAllToDos();  // Get the updated list of todos
        model.addAttribute("todos", todos);
        return "redirect:/view";
    }
}
