package org.example.ecommerce.Service;

import lombok.RequiredArgsConstructor;
import org.example.ecommerce.Model.Category;
import org.example.ecommerce.Repository.CategoryRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {




    // create Virtual DataBase
    private final CategoryRepository categoryRepository ;



    // display all categories information
    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }




    // add category information
    public void addCategory(Category category){
        categoryRepository.save(category);
    }




    // update category information
    public boolean updateCategory(Integer categoryID , Category category){

      Category oldCategory = categoryRepository.getById(categoryID);
      if(oldCategory == null){
          return false;
      }

      oldCategory.setCategoryName(category.getCategoryName());

       categoryRepository.save(oldCategory);
        return true;

    }




    // delete category information
    public boolean deleteCategory(Integer categoryID){

        Category category = categoryRepository.getById(categoryID);
        if(category == null){
            return false;
        }

        categoryRepository.delete(category);
        return true;
    }






}

