package org.example.events.Controller;

import jakarta.validation.Valid;
import org.example.events.ApiResponse.ApiResponse;
import org.example.events.Model.EventsSystem;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/events-system")
public class EventsSystemController {

    ArrayList<EventsSystem> events = new ArrayList<>();

    // get all
    @GetMapping("/get")
    public  ArrayList <EventsSystem>  displayEvents(){
        return  events;
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addEvent(@Valid @RequestBody EventsSystem event, Errors errors){

      if (errors.hasErrors()){
          String message = errors.getFieldError().getDefaultMessage();
          return ResponseEntity.status(400).body(new ApiResponse(message));
      }

        events.add(event);
        return ResponseEntity.status(200).body( new ApiResponse("event has been added successfully "));

    }

    //edit
    @PutMapping("/update/{index}")
    public ResponseEntity<?> updateEvent(@Valid @RequestBody EventsSystem event ,@PathVariable int index, Errors errors){

        if (errors.hasErrors()){
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        events.set(index, event);
        return ResponseEntity.status(200).body( new ApiResponse("event has been updated successfully "));
    }

    //delete
    @DeleteMapping("/delete/{index}")
    public ResponseEntity<?> deleteEvent(@PathVariable int index){
        events.remove(index);
        return  ResponseEntity.status(200).body(new ApiResponse("event has been deleted successfully "));
    }

    //change capacity
    @PutMapping("/change/{ID}/{capacity}")
    public ResponseEntity<?>  changeCapacity(@PathVariable String ID ,@PathVariable int capacity){

        for (EventsSystem eventsSystem : events){
            if (eventsSystem.getID().equalsIgnoreCase(ID)){
                eventsSystem.setCapacity(capacity);
                return   ResponseEntity.status(200).body(new ApiResponse("event capacity updated successfully"));
            }
        }

        return  ResponseEntity.status(400).body(new ApiResponse("error no event with same id to change its capacity"));
    }


    //search
    @GetMapping("/find-id/{ID}")
    public ResponseEntity<?> findByID(@PathVariable String ID){

        for(EventsSystem eventsSystem  :events){
            if (eventsSystem.getID().equalsIgnoreCase(ID)){
                return ResponseEntity.status(200).body(eventsSystem);
            }
        }

        return ResponseEntity.status(400).body(new ApiResponse("error no event with same id to find"));
    }

}
