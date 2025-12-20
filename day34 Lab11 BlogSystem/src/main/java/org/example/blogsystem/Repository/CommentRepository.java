package org.example.blogsystem.Repository;

import org.example.blogsystem.Model.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment , Integer> {

    Comment findCommentByCommentId(Integer commentID);



    /// JPA

    // 1- get all comments for a specific posts
    List<Comment> findCommentsByPostId (Integer postId);


    /// JPQL

    //1- get all comments by a specific user
    @Query("select c from Comment c where c.userId = ?1")
    List<Comment> getAllUserCommentHistory( Integer userId);
}
