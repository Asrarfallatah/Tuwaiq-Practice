package org.example.springsecurity.Repository;

import org.example.springsecurity.Model.ToDo;
import org.example.springsecurity.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo, Integer> {

   ToDo findToDoById(Integer id);

   List<ToDo> findAllByUser(User user);
}
