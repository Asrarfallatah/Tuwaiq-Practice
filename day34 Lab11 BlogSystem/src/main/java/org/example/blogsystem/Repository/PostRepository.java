package org.example.blogsystem.Repository;

import org.example.blogsystem.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post , Integer> {

    Post findPostByPostId(Integer postId);

    /// JPA

    //2- get posts by a specific user
    List<Post> findPostsByUserId(Integer userId);

    //3- get posts by title
    List<Post> findPostsByPostTitleContainingIgnoreCase(String postTitle);

    //4- get all post before a specific date
    List<Post> findPostsByPostPublishDateBefore(LocalDateTime postDate);


    /// JPQL

    //2- get all post for a specific category
    @Query("select p from Post p where p.categoryId = ?1")
    List<Post> getPostForASpecificCategory(Integer categoryId);

    //3- get posts that contains a specific word
    @Query("select p from Post p where lower(p.postContent) like lower(concat('%', ?1, '%'))")
    List<Post> getPostThatHasThisWord(String word);

}
