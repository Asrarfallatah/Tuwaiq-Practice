package org.example.blogsystem.Service;


import org.example.blogsystem.Model.Blog;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BlogService {


    ArrayList <Blog> blogs = new ArrayList<>();


    // display (get)

    public ArrayList<Blog> getBlogs(){
        return blogs;
    }



    // add (post)

    public void addBlog(Blog blog){

         blogs.add(blog);

    }


    // update (put)

    public boolean updateBlog(String id, Blog blog){

        for (int i = 0 ; i < blogs.size() ; i++){
            if(blogs.get(i).getID().equalsIgnoreCase(id)){
                blogs.set( i, blog);
                return true;
            }
        }

        return false;

    }

    // delete (delete)

    public boolean deleteBlog(String id){

        for (int i = 0 ; i < blogs.size() ; i++){
            if(blogs.get(i).getID().equalsIgnoreCase(id)){
                blogs.remove( i);
                return true;
            }
        }
        return false;
    }

    // get blog by ID
    public  ArrayList<Blog> getByID (String id){

        ArrayList<Blog> myTargetBlogByID = new ArrayList<>();

        for (Blog blog : blogs) {

            if (blog.getID().equalsIgnoreCase(id)) {
                myTargetBlogByID.add(blog);
                return myTargetBlogByID;
            }

        }

        return null;
    }


    // get by title

    public  ArrayList<Blog> getByTitle(String title){

        ArrayList<Blog> myTargetBlogTitles = new ArrayList<>();

        for (Blog blog : blogs){

            if (blog.getTitle().equalsIgnoreCase(title)){
                myTargetBlogTitles.add(blog);
            }
        }

        return myTargetBlogTitles;
    }



}
