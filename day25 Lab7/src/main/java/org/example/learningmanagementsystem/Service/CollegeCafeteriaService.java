package org.example.learningmanagementsystem.Service;

import org.example.learningmanagementsystem.Model.CollegeCafeteria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CollegeCafeteriaService {

    // arraylist as DataBase
    ArrayList<CollegeCafeteria> collegeCafeterias = new ArrayList<>();

    // create
    public ArrayList<CollegeCafeteria> displayOrders(){
        return collegeCafeterias;
    }

    // add
     public void addOrder(CollegeCafeteria order){
        collegeCafeterias.add(order);
     }

    // update
    public boolean updateOrder(String id, CollegeCafeteria order){
        for (int i = 0; i < collegeCafeterias.size(); i++) {
            if (collegeCafeterias.get(i).getCafeteriaFoodOrderedID().equalsIgnoreCase(id)){
                collegeCafeterias.set(i, order);
                return true;
            }
        }
        return false;
    }

    // delete
    public boolean deleteOrder(String id){
        for (int i = 0; i < collegeCafeterias.size(); i++) {
            if (collegeCafeterias.get(i).getCafeteriaFoodOrderedID().equalsIgnoreCase(id)){
                collegeCafeterias.remove(i);
                return true;
            }
        }
        return false;
    }

    // get by food type
    public   ArrayList<CollegeCafeteria> getByType(String cafeteriaFoodType){

        ArrayList<CollegeCafeteria> foundOrders = new ArrayList<>();

        for (int i = 0; i < collegeCafeterias.size(); i++) {
            if (collegeCafeterias.get(i).getCafeteriaFoodType().equalsIgnoreCase(cafeteriaFoodType)) {
                foundOrders.add(collegeCafeterias.get(i));
            }

        }
        return foundOrders;
    }

    // get by food price range
    public   ArrayList<CollegeCafeteria> getByPrice(double cafeteriaFoodPriceMin , double cafeteriaFoodPriceMax ){

        ArrayList<CollegeCafeteria> foundOrders = new ArrayList<>();

        for (int i = 0; i < collegeCafeterias.size(); i++) {
            if (collegeCafeterias.get(i).getCafeteriaFoodPrice() >= cafeteriaFoodPriceMin &&  collegeCafeterias.get(i).getCafeteriaFoodPrice() <= cafeteriaFoodPriceMax) {
                foundOrders.add(collegeCafeterias.get(i));
            }

        }
        return foundOrders;
    }


}
