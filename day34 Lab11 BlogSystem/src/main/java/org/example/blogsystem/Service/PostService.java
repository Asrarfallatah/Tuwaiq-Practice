package org.example.blogsystem.Service;

import lombok.RequiredArgsConstructor;
import org.example.blogsystem.Model.Post;
import org.example.blogsystem.Model.User;
import org.example.blogsystem.Repository.PostRepository;
import org.example.blogsystem.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    // create connection to the DataBase
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    // get all posts information from the DataBase
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    // add a post information to the DataBase
    public boolean addPost(Post post){

        // check if user does exist first
        User user = userRepository.findUserByUserId(post.getUserId());
        if (user == null){
            return false;
        }

        postRepository.save(post);
        return true;
    }

    // update post information in the DataBase
    public boolean updatePost (Integer postId , Post post){

        // check if is it in the DataBase first
        Post oldPost = postRepository.findPostByPostId(postId);
        if ( oldPost== null) {
            return false;
        }

        // update information
         oldPost.setPostTitle(post.getPostTitle());
         oldPost.setPostContent(post.getPostContent());
         oldPost.setCategoryId(post.getCategoryId());
         oldPost.setUserId(post.getUserId());
         oldPost.setPostPublishDate(post.getPostPublishDate());

        // save it
        postRepository.save(oldPost);
        return true;
    }

    // delete post information from the DataBase
    public boolean deletePost (Integer postId){

        // check if is it in the DataBase first
        Post post = postRepository.findPostByPostId(postId);
        if (post == null) {
            return false;
        }

        // delete it
        postRepository.delete(post);
        return true;
    }


    // extra end points

        /// JPA

            //2- get posts by a specific user
                public List<Post> findPostsByUserId (Integer userId){

                    return postRepository.findPostsByUserId(userId);
                }

            //3- get posts by title
                public List<Post> findPostsByPostTitleContainingIgnoreCase (String postTitle){

                    return postRepository.findPostsByPostTitleContainingIgnoreCase(postTitle);
                }

            //4- get all post before a specific date
                public List<Post> findPostsByPostPublishDateBefore (LocalDateTime postDate){

                    return postRepository.findPostsByPostPublishDateBefore(postDate);
                }

       ///  JPQL

             //2- get all post for a specific category
               public List<Post> getPostForASpecificCategory (Integer categoryId){

                   return postRepository.getPostForASpecificCategory(categoryId);
               }
            //3- get posts that contains a specific word
                public List<Post> getPostThatHasThisWord (String word){

                    return postRepository.getPostThatHasThisWord(word);
                }










}
