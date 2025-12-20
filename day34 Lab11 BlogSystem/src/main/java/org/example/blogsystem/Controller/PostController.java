package org.example.blogsystem.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.blogsystem.ApiResponse.ApiResponse;
import org.example.blogsystem.Model.Post;
import org.example.blogsystem.Service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/post")
@RequiredArgsConstructor
public class PostController {

    // create connection with Service
    private final PostService postService;

    // get
    @GetMapping("/get")
    public ResponseEntity<?> getPosts(){

        if (postService.getAllPosts().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no posts yet in the DataBase to show their information !"));
        }

        return ResponseEntity.status(200).body(postService.getAllPosts());

    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addPost(@Valid @RequestBody Post post , Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        boolean doesUserExixt = postService.addPost(post);

        if (!doesUserExixt){
            return ResponseEntity.status(400).body(new ApiResponse("no user with that id has been found in the database to add a post ! "));
        }
        return ResponseEntity.status(200).body(new ApiResponse("post information has been added Successfully ! "));

    }

    // update
    @PutMapping("/update/{postId}")
    public ResponseEntity<?> updatePost(@PathVariable Integer postId, @Valid @RequestBody Post post ,  Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        boolean isUpdated = postService.updatePost(postId, post);

        if (!isUpdated){
            return ResponseEntity.status(400).body(new ApiResponse("no post with that ID in the DataBase is found to update it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("post information has been updated Successfully ! "));



    }

    // delete
    @DeleteMapping("/delete/{postId}")
    public ResponseEntity<?> deletePost(@PathVariable Integer postId){

        boolean isDeleted = postService.deletePost(postId);

        if (!isDeleted){
            return ResponseEntity.status(400).body(new ApiResponse("no post with that ID in the DataBase is found to delete it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("post information has been deleted Successfully ! "));

    }


    // extra end points

        /// JPA

            //2- get posts by a specific user
            @GetMapping("/get-post-by-user/{userId}")
            public ResponseEntity<?> findPostsByUserId(@PathVariable Integer userId){

                if (postService.findPostsByUserId(userId).isEmpty()){
                    return ResponseEntity.status(400).body(new ApiResponse("There is no posts mad by this user yet in the DataBase to show their information !"));
                }

                return ResponseEntity.status(200).body(postService.findPostsByUserId(userId));

            }

            //3- get posts by title
            @GetMapping("/get-post-by-title/{postTitle}")
            public ResponseEntity<?> findPostsByPostTitleContainingIgnoreCase(@PathVariable String postTitle){

                if (postService.findPostsByPostTitleContainingIgnoreCase(postTitle).isEmpty()){
                    return ResponseEntity.status(400).body(new ApiResponse("There is no posts mad by this title yet in the DataBase to show their information !"));
                }

                return ResponseEntity.status(200).body(postService.findPostsByPostTitleContainingIgnoreCase(postTitle));

            }

           //4- get all post before a specific date
           @GetMapping("/get-post-by-date/{postDate}")
           public ResponseEntity<?> findPostsByPostPublishDateBefore(@PathVariable LocalDateTime postDate){

               if (postService.findPostsByPostPublishDateBefore(postDate).isEmpty()){
                   return ResponseEntity.status(400).body(new ApiResponse("There is no posts mad by this user yet in the DataBase to show their information !"));
               }

               return ResponseEntity.status(200).body(postService.findPostsByPostPublishDateBefore(postDate));

           }

        ///  JPQL

            //2- get all post for a specific category
                @GetMapping("/get-post-by-category/{categoryId}")
                public ResponseEntity<?> getPostForASpecificCategory(@PathVariable Integer categoryId){

                    if (postService.getPostForASpecificCategory(categoryId).isEmpty()){
                        return ResponseEntity.status(400).body(new ApiResponse("There is no posts mad by this user yet in the DataBase to show their information !"));
                    }

                    return ResponseEntity.status(200).body(postService.getPostForASpecificCategory(categoryId));

                }

            //3- get posts that contains a specific word

                @GetMapping("/get-post-by-word/{word}")
                public ResponseEntity<?> getPostThatHasThisWord(@PathVariable String word){

                    if (postService.getPostThatHasThisWord(word).isEmpty()){
                        return ResponseEntity.status(400).body(new ApiResponse("There is no posts mad by this user yet in the DataBase to show their information !"));
                    }

                    return ResponseEntity.status(200).body(postService.getPostThatHasThisWord(word));

                }
}
