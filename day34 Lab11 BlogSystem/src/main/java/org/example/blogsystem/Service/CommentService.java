package org.example.blogsystem.Service;

import lombok.RequiredArgsConstructor;
import org.example.blogsystem.Model.Comment;
import org.example.blogsystem.Model.Post;
import org.example.blogsystem.Model.User;
import org.example.blogsystem.Repository.CommentRepository;
import org.example.blogsystem.Repository.PostRepository;
import org.example.blogsystem.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {


    // create connection to the DataBase
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    // get all comment information from the DataBase
    public List<Comment> getAllComments (){
        return commentRepository.findAll();
    }

    // add a comment information to the DataBase
    public int addComment(Comment comment){

        // check if post does exist first
       Post post = postRepository.findPostByPostId( comment.getPostId());

        if (post == null ) {
            return 1;
        }

        // check user exists
        User user = userRepository.findUserByUserId(comment.getUserId());
        if (user == null){
            return 2;
        }

        commentRepository.save(comment);
        return 3;
    }

    // update comment information in the DataBase
    public boolean updateComment (Integer commentId , Comment comment){

        // check if is it in the DataBase first
        Comment oldComment = commentRepository.findCommentByCommentId(commentId);
        if ( oldComment== null) {
            return false;
        }

        // update information
        oldComment.setCommentContent(comment.getCommentContent());
        oldComment.setCommentPublishDate(comment.getCommentPublishDate());
        oldComment.setPostId(comment.getPostId());
        oldComment.setUserId(comment.getUserId());

        // save it
        commentRepository.save(oldComment);
        return true;
    }

    // delete comment information from the DataBase
    public boolean deleteComment (Integer commentId){

        // check if is it in the DataBase first
        Comment comment = commentRepository.findCommentByCommentId(commentId);
        if (comment == null) {
            return false;
        }

        // delete it
        commentRepository.delete(comment);
        return true;
    }


    // extra end points

    /// JPA
        // 1- get all comments for a specific posts
            public List<Comment> findCommentsByPostId (Integer postId){

                return commentRepository.findCommentsByPostId(postId);
            }

    ///  JPQL

       //1- get all comments by a specific user
            public List<Comment> getAllUserCommentHistory (Integer userId){

                return commentRepository.getAllUserCommentHistory(userId);
            }






}
