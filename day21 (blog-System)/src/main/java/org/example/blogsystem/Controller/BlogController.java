package org.example.blogsystem.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.blogsystem.ApiResponse.ApiResponse;
import org.example.blogsystem.Model.Blog;
import org.example.blogsystem.Service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/blog")
@RequiredArgsConstructor
public class BlogController {


    private final BlogService blogService ;

    //display
    @GetMapping("/get")
    public ResponseEntity<?> getBlogs() {

        return ResponseEntity.status(200).body(blogService.getBlogs());

    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addBlogs(@Valid @RequestBody Blog blog , Errors errors){

        if (errors.hasErrors()){
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }
        blogService.addBlog(blog);
        return ResponseEntity.status(200).body(new ApiResponse(" Blog information has been added Successfully ! "));

    }

    //update
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateBlogs(@Valid @PathVariable String id , @Valid @RequestBody Blog blog , Errors errors){

        if(errors.hasErrors()){
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        boolean isUpdated = blogService.updateBlog(id, blog);
        if(isUpdated){
            return ResponseEntity.status(200).body(new ApiResponse(" Blog information has been  updated successfully !"));
        }

        return ResponseEntity.status(400).body(new ApiResponse(" Error no Blog with that information  !"));

    }

    //delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBlogs(@Valid @PathVariable String id){

        boolean isDeleted = blogService.deleteBlog(id);
        if (isDeleted) {
            return ResponseEntity.status(200).body(new ApiResponse(" Blog information has been  deleted successfully !"));
        }

        return ResponseEntity.status(400).body(new ApiResponse(" Error no Blog with that information  !"));

    }



    // get blog by ID
    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<?> getByID(@Valid @PathVariable String id ){


        ArrayList<Blog> isFound = blogService.getByID(id);

        if ( !isFound.isEmpty()  ) {
            return ResponseEntity.status(200).body(isFound);
        }

        return ResponseEntity.status(400).body(new ApiResponse(" Error no Blog with that information  !"));
    }

    //get blog by title
    @GetMapping("/get-by-title/{title}")
    public ResponseEntity<?> getByTitle (@PathVariable String title){

        ArrayList<Blog> isFound = blogService.getByTitle(title);

        if ( !isFound.isEmpty()  ) {
            return ResponseEntity.status(200).body(isFound);
        }

        return ResponseEntity.status(400).body(new ApiResponse(" Error no Blog with that information  !"));
    }


}
