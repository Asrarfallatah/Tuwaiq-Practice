package org.example.blogsystem.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.blogsystem.ApiResponse.ApiResponse;
import org.example.blogsystem.Model.Category;
import org.example.blogsystem.Service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryController {

    // create connection with Service
    private final CategoryService categoryService;


    // get
    @GetMapping("/get")
    public ResponseEntity<?> getCategories(){

        if (categoryService.getAllCategories().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no categories yet in the DataBase to show their information !"));
        }

        return ResponseEntity.status(200).body(categoryService.getAllCategories());
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addCategory(@Valid @RequestBody Category category , Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        categoryService.addCategory(category);
        return ResponseEntity.status(200).body(new ApiResponse("category information has been added to the DataBase Successfully ! "));
    }


    // update
    @PutMapping("/update/{categoryID}")
    public ResponseEntity<?> updateCategory(@PathVariable Integer categoryID , @Valid @RequestBody Category category, Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        boolean isUpdated = categoryService.updateCategory(categoryID, category);

        if (!isUpdated){
            return ResponseEntity.status(400).body(new ApiResponse("no category with that ID in the DataBase with that id is found to update it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("category information has been updated Successfully ! "));
    }

    // delete

    @DeleteMapping("/delete/{categoryID}")
    public ResponseEntity<?> deleteCategory(@PathVariable Integer categoryID){

        boolean isDeleted = categoryService.deleteCategory(categoryID);

        if (!isDeleted){
            return ResponseEntity.status(400).body(new ApiResponse("no category with that ID in the DataBase is found to delete it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("category information has been deleted Successfully ! "));
    }



}
