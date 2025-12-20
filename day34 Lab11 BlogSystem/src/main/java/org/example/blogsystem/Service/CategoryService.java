package org.example.blogsystem.Service;

import lombok.RequiredArgsConstructor;
import org.example.blogsystem.Model.Category;
import org.example.blogsystem.Repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {


    // create connection to the DataBase
    private final CategoryRepository categoryRepository;

    // get all comments information from the DataBase
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    // add a comments information to the DataBase
    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    // update comments information in the DataBase
    public boolean updateCategory (Integer categoryId , Category category){

        // check if is it in the DataBase first
        Category oldCategory = categoryRepository.findCategoryByCategoryId(categoryId);
        if ( oldCategory == null) {
            return false;
        }

        // update information
        oldCategory.setCategoryName(category.getCategoryName());

        // save it
        categoryRepository.save(oldCategory);
        return true;
    }

    // delete comments information from the DataBase
    public boolean deleteCategory (Integer categoryId){

        // check if is it in the DataBase first
        Category category = categoryRepository.findCategoryByCategoryId(categoryId);
        if ( category == null) {
            return false;
        }

        // delete it
        categoryRepository.delete(category);
        return true;
    }


    // extra end points

    /// JPA


    ///  JPQL










}
