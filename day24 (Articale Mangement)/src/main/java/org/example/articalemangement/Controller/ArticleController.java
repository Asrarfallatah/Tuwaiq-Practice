package org.example.articalemangement.Controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.articalemangement.ApiResponse.ApiResponse;
import org.example.articalemangement.Model.Article;
import org.example.articalemangement.Service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/article")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;


    // display (get)
    @GetMapping("/get")
    public ResponseEntity<?> getArticle(){

        return ResponseEntity.status(200).body( articleService.getArticles());

    }

    // add (post)
    @PostMapping("/add")
    public ResponseEntity<?> addArticle(@Valid @RequestBody Article article, Errors errors){

        if (errors.hasErrors()){
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        articleService.addArticle(article);
        return ResponseEntity.status(200).body(new ApiResponse(" Article information has been  updated successfully !"));

    }

    // update (put)
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateArticle( @Valid @PathVariable String id , @Valid @RequestBody Article article , Errors errors){

        if(errors.hasErrors()){
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new ApiResponse(message));
        }

        boolean isUpdated = articleService.updateArticle(id, article);
        if(isUpdated){
            return ResponseEntity.status(200).body(new ApiResponse(" Article information has been  updated successfully !"));
        }

        return ResponseEntity.status(200).body(new ApiResponse(" Error no Article with that information  !"));

    }

    // delete (delete)
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteArticle(@Valid @PathVariable String id){

        boolean isDeleted = articleService.deleteArticale(id);
        if (isDeleted) {
            return ResponseEntity.status(200).body(new ApiResponse(" Article information has been  deleted successfully !"));
        }

        return ResponseEntity.status(400).body(new ApiResponse(" Error no Article with that information  !"));

    }


    // change published article status
    @PutMapping ("/set-published/{id}")
    public ResponseEntity<?> publishArticle(@Valid @PathVariable String id){

        boolean isPublished = articleService.publishArticle(id);

        if (isPublished) {
            return ResponseEntity.status(200).body(new ApiResponse(" Article information has been  published successfully !"));
        }

        return ResponseEntity.status(400).body(new ApiResponse(" Error no Article with that information  !"));

    }


    //get all published article
    @GetMapping ("/get-published")
    public ResponseEntity<?> getAllPublish( ){

        ArrayList<Article> check = articleService.getAllPublished();

        if (check.isEmpty()) {
            return ResponseEntity.status(400).body(new ApiResponse(" Error no Article has been published  !"));
        }

        return ResponseEntity.status(200).body(check);
    }


    // get articales by category :
    @GetMapping ("/get-category/{category}")
    public ResponseEntity<?> getByCategory( @Valid @PathVariable String category){

        ArrayList<Article> check = articleService.getByCategory(category);

        if (check.isEmpty()) {
            return ResponseEntity.status(400).body(new ApiResponse(" Error no Article in that category  !"));
        }

        return ResponseEntity.status(200).body(check);
    }



}
