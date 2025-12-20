package org.example.springsecurity.Controller;

import lombok.RequiredArgsConstructor;
import org.example.springsecurity.Api.ApiResponse;
import org.example.springsecurity.Model.ToDo;
import org.example.springsecurity.Model.User;
import org.example.springsecurity.Service.ToDoService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
@RequiredArgsConstructor
public class ToDoController {

    // connect to the Database
    private final ToDoService toDoService;

    // get
    @GetMapping("/get")
    public ResponseEntity<?> getAllToDos(){
        return ResponseEntity.status(200).body(toDoService.getAllToDos());
    }

    // get my ToDos
    @GetMapping("/get-my-todos")
    public ResponseEntity<?> getMyToDos(@AuthenticationPrincipal User user){
        return ResponseEntity.status(200).body(toDoService.getMyToDos(user.getId()));
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addToDo(@AuthenticationPrincipal User user, @RequestBody ToDo toDo){
        toDoService.addToDo(user.getId(), toDo);
        return ResponseEntity.status(200).body(new ApiResponse("ToDo added to the database Successfully !"));
    }

    // update
    @PutMapping("/update/{toDoId}")
    public ResponseEntity<?> updateToDo(@AuthenticationPrincipal User user, @PathVariable Integer toDoId , ToDo toDo){
        toDoService.updateToDo(user.getId(),toDoId, toDo);
        return ResponseEntity.status(200).body(new ApiResponse("ToDo updated in the database Successfully !"));
    }

    // delete
    @DeleteMapping("/delete/{toDoId}")
    public ResponseEntity<?> deleteToDo(@AuthenticationPrincipal User user, @PathVariable Integer toDoId){
        toDoService.deleteToDo(user.getId() , toDoId);
        return ResponseEntity.status(200).body(new ApiResponse("ToDo deleted from the database Successfully !"));
    }





}
