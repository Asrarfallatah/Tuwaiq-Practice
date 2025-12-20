package org.example.day14;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller {

    public Controller(String message){
        System.out.println(message);
    }

//    public Controller(int message){
//        System.out.println(message);
//    }


//    @GetMapping("/hi")
//    public String myName(){
//        return "My name is Asrar and i am in post man :) ";
//    }


}





