package org.example.blogsystem.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.blogsystem.ApiResponse.ApiResponse;
import org.example.blogsystem.Model.Comment;
import org.example.blogsystem.Service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comment")
@RequiredArgsConstructor
public class CommentController {

    // create connection with Service
    private final CommentService commentService;


    // get
    @GetMapping("/get")
    public ResponseEntity<?> getComments(){

        if (commentService.getAllComments().isEmpty()){
            return ResponseEntity.status(400).body(new ApiResponse("There is no comments yet in the DataBase to show their information !"));
        }

        return ResponseEntity.status(200).body(commentService.getAllComments());
    }

    // add
    @PostMapping("/add")
    public ResponseEntity<?> addComment(@Valid @RequestBody Comment comment , Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        int isExists = commentService.addComment(comment);
        if (isExists == 1 ){
            return ResponseEntity.status(400).body(new ApiResponse("error no Post with that ID in the DataBase is found to add a comment to it ! "));
        } else if (isExists == 2) {
            return ResponseEntity.status(400).body(new ApiResponse("error no User with that ID in the DataBase is found to add a comment to it ! "));
        }

        if (isExists == 3 ) commentService.addComment(comment);
        return ResponseEntity.status(200).body(new ApiResponse("comment information has been added to the DataBase Successfully ! "));
    }


    // update
    @PutMapping("/update/{commentID}")
    public ResponseEntity<?> updateComment(@PathVariable Integer commentID , @Valid @RequestBody Comment comment, Errors errors){

        if (errors.hasErrors()){
            return ResponseEntity.status(400).body(new ApiResponse(errors.getFieldError().getDefaultMessage()));
        }

        boolean isUpdated = commentService.updateComment(commentID, comment);

        if (!isUpdated){
            return ResponseEntity.status(400).body(new ApiResponse("no comment with that ID in the DataBase with that id is found to update it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("comment information has been updated Successfully ! "));
    }

    // delete

    @DeleteMapping("/delete/{commentID}")
    public ResponseEntity<?> deleteComment(@PathVariable Integer commentID){

        boolean isDeleted = commentService.deleteComment(commentID);

        if (!isDeleted){
            return ResponseEntity.status(400).body(new ApiResponse("no comment with that ID in the DataBase is found to delete it ! "));
        }

        return ResponseEntity.status(200).body(new ApiResponse("comment information has been deleted Successfully ! "));
    }

    // extra end points

        /// JPA

            // 1- get all comments for a specific posts
                @GetMapping("/find-comment-by-post/{postId}")
                public ResponseEntity<?> findCommentsByPostId(@PathVariable Integer postId){

                    if (commentService.findCommentsByPostId(postId).isEmpty()){
                        return ResponseEntity.status(400).body(new ApiResponse("There is no comments under this post yet in the DataBase to show them !"));
                    }

                    return ResponseEntity.status(200).body(commentService.findCommentsByPostId(postId));
                }

        ///  JPQL

            //1- get all comments by a specific user
                @GetMapping("/find-comment-by-user/{postId}")
                public ResponseEntity<?> getAllUserCommentHistory(@PathVariable Integer userId){

                    if (commentService.getAllUserCommentHistory(userId).isEmpty()){
                        return ResponseEntity.status(400).body(new ApiResponse("There is no comments was made by this user yet in the DataBase to show them !"));
                    }

                    return ResponseEntity.status(200).body(commentService.getAllUserCommentHistory(userId));
                }
}
