package org.example.day13;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/myString")
    public String myString(){
        return "Hello World :) ";
    }

    @GetMapping("/myInformation")
    public String myInfo(){
        return " ₊✩‧₊˚౨                Hello there Asrar                ৎ˚₊✩‧₊ "+
               "\n        welcome to your first SpringBoot frameWork page       " ;
    }

    @GetMapping("/name")
    public String myName(){
        return "My name is Asrar";
    }

    @GetMapping("/age")
    public int myAge(){
        return 23;
    }

    @GetMapping("/check")
    public String check(){
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health(){
        return "Server Health is up and running ";

    }

    String myCousins [] = {"Reham", "Refal"};

    List<String> myFamily = new ArrayList<>();


    @GetMapping("/names")
    public String names(){
        myFamily.add("Anwaar");
        myFamily.add("Afnan");
        return "my Array is "+Arrays.toString(myCousins) + " my Arraylist "+ myFamily;
    }

}
