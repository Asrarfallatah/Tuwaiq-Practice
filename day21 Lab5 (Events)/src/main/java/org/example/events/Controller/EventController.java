package org.example.events.Controller;


import org.example.events.ApiResponse.ApiResponse;
import org.example.events.Model.Event;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/event")
public class EventController {

    ArrayList <Event> events = new ArrayList<>();

    // get all
    @GetMapping("/get")
    public  ArrayList <Event>  displayEvents(){
      return  events;
    }

    // add
    @PostMapping("/add")
    public ApiResponse addEvent(@RequestBody Event event){
        events.add(event);
        return new ApiResponse("event has been added successfully ");
    }

    //edit
    @PutMapping("/edit/{index}")
    public ApiResponse editEvent(@RequestBody Event event ,@PathVariable int index){
        events.set(index, event);
        return new ApiResponse("event has been edited successfully ");
    }

    //delete
    @DeleteMapping("/delete/{index}")
    public ApiResponse deleteEvent(@PathVariable int index){
        events.remove(index);
        return new ApiResponse("event has been deleted successfully ");
    }

    //change capacity
    @PutMapping("/change/{ID}/{capacity}")
    public ApiResponse changeCapacity(@PathVariable String ID ,@PathVariable int capacity){

        for (Event event : events){
            if (event.getID().equalsIgnoreCase(ID)){
                event.setCapacity(capacity);
                return new ApiResponse("event capacity updated successfully");
            }
        }
        return new ApiResponse("error no event wihth same id to change its capacity");
    }


    //search
    @GetMapping("/findid/{ID}")
    public Event findByID(@PathVariable String ID){

        for(Event event :events){
            if (event.getID().equalsIgnoreCase(ID)){
                return event;
            }
        }
        return null;
    }

}
