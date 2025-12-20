package org.example.articalemangement.Service;


import org.example.articalemangement.Model.Article;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ArticleService {

    ArrayList<Article> articles = new ArrayList<>();


    // display (get)
    public ArrayList<Article> getArticles (){
        return articles;
    }

    // add (post)
    public void addArticle (Article article) {

        articles.add(article);

    }

    // update (put) by ID
    public boolean updateArticle( String id , Article article){

        for (int i = 0; i < articles.size(); i++) {

            if (articles.get(i).getId().equalsIgnoreCase(id)){
                articles.set(i , article);
                return true;
            }
        }

       return false;
    }

    // delete (delete)
    public boolean deleteArticale(String id){

        for (int i = 0; i < articles.size(); i++) {
            if (articles.get(i).getId().equalsIgnoreCase(id)){
                articles.remove(i);
                return true;
            }
        }
        return false;
    }

    // publish article
    public boolean publishArticle (String id){

        for (int i = 0 ; i < articles.size(); i++) {

            if (articles.get(i).getId().equalsIgnoreCase(id)) {
                articles.get(i).setIsPublished("true");
                return true;
            }

        }

        return false;

    }

    // articale
    public ArrayList<Article> getAllPublished(){

        ArrayList<Article> isPublish = new ArrayList<>();

        for (int i = 0; i < articles.size(); i++) {

            if (articles.get(i).getIsPublished().equalsIgnoreCase("true")){
                isPublish.add(articles.get(i));
            }
        }

        return isPublish;
    }


    // get by category

    public ArrayList<Article> getByCategory(String category){

        ArrayList<Article> isCategory= new ArrayList<>();

        for (int i = 0; i < articles.size(); i++) {

            if (articles.get(i).getCategory().equalsIgnoreCase(category)){
                isCategory.add(articles.get(i));
            }
        }

        return isCategory;
    }
}
