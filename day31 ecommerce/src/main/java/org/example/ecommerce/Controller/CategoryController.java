package org.example.ecommerce.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.ecommerce.ApiResponse.ApiResponse;
import org.example.ecommerce.Model.Category;
import org.example.ecommerce.Service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryController {




    // create instant variable from service class
    public final CategoryService categoryService;





    // display all categories information from Virtual DataBase
    @GetMapping("/get")
    public ResponseEntity<?> getCategories(){

        if (categoryService.getCategories().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no categories in the DataBase to show their information !"));
        }

        return ResponseEntity.status(200).body(categoryService.getCategories());
    }






    // add category information to the Virtual DataBase
    @PostMapping("/add")
    public ResponseEntity<?> addCategory(@Valid @RequestBody Category category , Errors errors){

        if (errors.hasErrors()){
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        categoryService.addCategory(category);
        return ResponseEntity.status(200).body(new ApiResponse("Category information has been added to the DataBase Successfully ! "));
    }







    // update category information from the Virtual DataBase
    @PutMapping("/update/{categoryID}")
    public ResponseEntity<?> updateCategory(@PathVariable Integer categoryID , @Valid @RequestBody Category category , Errors errors){

        if (errors.hasErrors()){
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        boolean isUpdated = categoryService.updateCategory(categoryID , category);
        if (!isUpdated){
            return ResponseEntity.status(400).body(new ApiResponse("no category with that name in the DataBase is found to update it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("Category information has been updated Successfully ! "));

    }






    // delete category information from Virtual DataBase
    @DeleteMapping("/delete/{categoryID}")
    public ResponseEntity<?> deleteCategory(@PathVariable Integer categoryID){

        boolean isDeleted = categoryService.deleteCategory(categoryID);
        if (!isDeleted){
            return ResponseEntity.status(400).body(new ApiResponse("no category with that name in the DataBase is found to delete it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("Category information has been deleted Successfully ! "));

    }






}
