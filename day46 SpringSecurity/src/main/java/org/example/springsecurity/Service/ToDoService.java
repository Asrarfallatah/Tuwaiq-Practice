package org.example.springsecurity.Service;

import lombok.RequiredArgsConstructor;
import org.example.springsecurity.Api.ApiException;
import org.example.springsecurity.Model.ToDo;
import org.example.springsecurity.Model.User;
import org.example.springsecurity.Repository.AuthRepository;
import org.example.springsecurity.Repository.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ToDoService {

    // connect to the database
    private final ToDoRepository toDoRepository;
    private final AuthRepository authRepository;

    // get
    public List<ToDo> getAllToDos() {

        // check if list is empty
        if (toDoRepository.findAll().isEmpty()) {
            throw new ApiException("no ToDos found in the database yet ");
        }

       return toDoRepository.findAll();
    }

    // get my ToDos
    public List<ToDo> getMyToDos(Integer userId){

        // check if the user exists
        User user = authRepository.findUserById(userId);
        if (user == null){
            throw new ApiException("user not found");
        }

        // return the toDos of this specific user
        return toDoRepository.findAllByUser(user);
    }

    // add
    public void addToDo(Integer userId, ToDo toDo) {

        // check if the user authenticated to this existed
        User user = authRepository.findUserById(userId);
        if (user == null){
            throw new ApiException("user not found");
        }

        // set the user to the toDo
        toDo.setUser(user);
        toDoRepository.save(toDo);
    }

    // update
    public void updateToDo(Integer userId, Integer toDoId , ToDo toDo) {

        // check if the toDo exists
        ToDo oldTodo = toDoRepository.findToDoById(toDoId);
        if (oldTodo == null) {
            throw new ApiException("no ToDo with that id is not found in the database to update it");
          }

        // check if the user authenticated to this existed
        User user = authRepository.findUserById(userId);
        if (user == null){
            throw new ApiException("user not found");
        }

        // check if the toDo belongs to the authenticated user
        if(oldTodo.getUser().getId() != userId){
            throw new ApiException("you are not authorized to update this ToDo");
        }

        // update the toDo
        oldTodo.setTitle(toDo.getTitle());
        oldTodo.setStatus(toDo.getStatus());

        // save the updated toDo
        toDoRepository.save(oldTodo);

    }

    // delete
    public void deleteToDo(Integer userId, Integer toDoId ) {

        // check if the toDo exists
        ToDo todo = toDoRepository.findToDoById(toDoId);
        if (todo == null) {
            throw new ApiException("no ToDo with that id is not found in the database to delete it");
          }

        // check if the user authenticated to this existed
        User user = authRepository.findUserById(userId);
        if (user == null){
            throw new ApiException("user not found");
        }

        // check if the toDo belongs to the authenticated user
        if(todo.getUser().getId() != userId){
            throw new ApiException("you are not authorized to delete this ToDo");
        }

        // delete the toDo
        toDoRepository.delete(todo);

    }



}
