package org.example.coffeejpa.Service;


import lombok.RequiredArgsConstructor;
import org.example.coffeejpa.Api.ApiException;
import org.example.coffeejpa.Model.Coffee;
import org.example.coffeejpa.Repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;
    private final EmployeeService employeeService;


    // get
    public List<Coffee> getAllCoffees() {

        if (coffeeRepository.findAll().isEmpty()) {
            throw new ApiException("no coffees found in the database yet ");
        }

        return coffeeRepository.findAll();
    }

    // add
    public void addCoffee(Coffee coffee) {

        // check for null  validation
        if (coffee.getCoffeeName() == null) {
            throw new ApiException("error coffee name cant be empty");
        } else if (coffee.getCoffeePrice() == null) {
            throw new ApiException("error coffee price cant be empty");
        } else if (coffee.getCoffeeCategory() == null) {
            throw new ApiException("error coffee category cant be empty");
        } else if (coffee.getEmployeeID() == null) {
            throw new ApiException("error employee ID cant be empty");
        }


        // check for coffe name length > 4
        if (coffee.getCoffeeName().length() < 4) {
            throw new ApiException("error coffee name cant be less than 4 characters");
        }

        // check coffee category length > 4
        if (coffee.getCoffeeCategory().length() < 4) {
            throw new ApiException("error coffee category cant be less than 4 characters");
        }

        // check coffee price  > 0
        if (coffee.getCoffeePrice() < 0) {
            throw new ApiException("error coffee price cant be less than zero");
        }

        // does employeeID existence
        if (employeeService.getEmployeeByEmployeeID(coffee.getEmployeeID()) == null) {
            throw new ApiException("error employee ID not found in the database");
        }


        // check for inputMismatch errors
        if (coffee.getCoffeeName().contains("^[0-9]+$")) {
            throw new ApiException("error coffee name must be string only ");
        }

        if (!(coffee.getCoffeePrice().equals("^[0-9]+$"))) {
            throw new ApiException("error coffee price cant have string values ");
        }

        if (coffee.getCoffeeCategory().contains("^[0-9]+$")) {
            throw new ApiException("error coffee category must be string only ");
        }

        if (!(coffee.getEmployeeID().equals("^[0-9]+$"))) {
            throw new ApiException("error employee ID cant have string values ");
        }


        coffeeRepository.save(coffee);
    }

    // update

    public void updateCoffee(Integer coffeeId, Coffee coffee) {

        // check if the coffee id in the parameters is number
        if (coffeeId instanceof Integer == false) {
            throw new ApiException("error if you want to update the coffee information you must put coffee id as a number ");

        }

        // check if the coffee id that we want to be updated  is there in the database
        Coffee oldCoffee = coffeeRepository.findCoffeeByCoffeeID(coffeeId);
        if (oldCoffee == null) {
            throw new ApiException("no coffee is found yet with that id  in the database ");
        }

        // check  if the coffe id is being changed
        if (!coffeeId.equals(coffee.getCoffeeID())) {
            throw new ApiException("error coffee id cant be changed ");
        }

        // check if the employee id is being changed
        if (!oldCoffee.getEmployeeID().equals(coffee.getEmployeeID())) {
            throw new ApiException("error employee id cant be changed ");
        }


        // check for inputMismatch errors
        if (coffee.getCoffeeName().contains("^[0-9]+$")) {
            throw new ApiException("error coffee name must be string only ");
        }

        if (!(coffee.getCoffeePrice().equals("^[0-9]+$"))) {
            throw new ApiException("error coffee price cant have string values ");
        }

        if (coffee.getCoffeeCategory().contains("^[0-9]+$")) {
            throw new ApiException("error coffee category must be string only ");
        }

        if (!(coffee.getEmployeeID().equals("^[0-9]+$"))) {
            throw new ApiException("error employee ID cant have string values ");
        }


        // not null  validation
        if (coffee.getCoffeeName() == null) {
            throw new ApiException("error coffee name cant be empty");
        } else if (coffee.getCoffeePrice() == null) {
            throw new ApiException("error coffee price cant be empty");
        } else if (coffee.getCoffeeCategory() == null) {
            throw new ApiException("error coffee category cant be empty");
        }

        // coffe name length > 4  validation
        if (coffee.getCoffeeName().length() < 4) {
            throw new ApiException("error coffee name cant be less than 4 characters");
        }

        // coffee category length > 4  validation
        if (coffee.getCoffeeCategory().length() < 4) {
            throw new ApiException("error coffee category cant be less than 4 characters");
        }

        // coffee price  > 0  validation
        if (coffee.getCoffeePrice() < 0) {
            throw new ApiException("error coffee price cant be less than zero");
        }

        // employeeID existence  validation
        if (employeeService.getEmployeeByEmployeeID(coffee.getEmployeeID()) == null) {
            throw new ApiException("error employee ID not found in the database");
        }

        // check if there is any change at all
        if (oldCoffee.getCoffeeName().equals(coffee.getCoffeeName()) && oldCoffee.getCoffeeCategory().equals(coffee.getCoffeeCategory()) && oldCoffee.getCoffeePrice().equals(coffee.getCoffeePrice())) {
            throw new ApiException("error there is no change to be updated ");

        }
            //update the old one each variable
            oldCoffee.setCoffeeName(coffee.getCoffeeName());
            oldCoffee.setCoffeeCategory(coffee.getCoffeeCategory());
            oldCoffee.setCoffeePrice(coffee.getCoffeePrice());

            // save it
            coffeeRepository.save(oldCoffee);

        }


    // delete
    public void deleteCoffee (Integer coffeeId){

            // check if the coffee id is integer
            if (coffeeId.equals("^[0-9]+$")) {
                throw new ApiException("error coffee ID cant have string values ");
            }


            // check if coffee is there in the database
            Coffee coffees = coffeeRepository.findCoffeeByCoffeeID(coffeeId);
            if (coffees == null) {
                throw new ApiException("no coffee is found yet with that id  in the database ");
            }


            // delete it
            coffeeRepository.delete(coffees);


        }


        // extra end point
//
//    public void  getCoffeeByCoffeeID(Integer coffeeID ){
//
//        Coffee coffees = coffeeRepository.findCoffeeByCoffeeID(coffeeID);
//
//        if (coffees == null ){
//            return null;
//        }
//
//        return coffees;
//
//    }
//
//    public List<Coffee> getCoffeeByCoffeeCategory(String  coffeeCategory ){
//
//        List <Coffee> coffee = coffeeRepository.findCoffeeByCoffeeCategory(coffeeCategory);
//
//        if (coffee.isEmpty()){
//            return null;
//        }
//
//        return coffee;
//
//    }
//
//    public List<Coffee> getCoffeeByCoffeeCategoryAndCoffeeName(String  coffeeCategory , String coffeeName){
//
//        List <Coffee> coffee = coffeeRepository.findCoffeeByCoffeeCategoryAndCoffeeName(coffeeCategory , coffeeName);
//
//        if (coffee.isEmpty()){
//            return null;
//        }
//
//        return coffee;
//
//    }
//
//
//    public List<Coffee> getCoffeeByEmployeeID(Integer employeeID ){
//
//        List<Coffee> coffee = coffeeRepository.findCoffeeByEmployeeID(employeeID);
//
//        if (coffee == null ){
//            return null;
//        }
//
//        return coffee;
//
//    }
//
//    public List<Coffee> getCategorizedCoffeeByEmployee(String category, Integer employeeID) {
//
//        List<Coffee> coffees = coffeeRepository.findCategorizedCoffeeByEmployee(category, employeeID);
//
//        if (coffees.isEmpty()) {
//            return null;
//        }
//
//        return coffees;
//    }
//
//    public List<Coffee> getCategoryPriceUp(String category) {
//
//        List<Coffee> coffees = coffeeRepository.findCategoryPriceAsc(category);
//
//        if (coffees.isEmpty()) {
//            return null;
//        }
//
//        return coffees;
//    }
//
//    public List<Coffee> getCategoryPriceDown(String category) {
//
//        List<Coffee> coffees = coffeeRepository.findCategoryPriceDesc(category);
//
//        if (coffees.isEmpty()) {
//            return null;
//        }
//
//        return coffees;
//    }
//
//    public List<Coffee> getMostCoffeeMaker() {
//
//        List<Coffee> result = coffeeRepository.findMostCoffeeMaker();
//
//        if (result.isEmpty()) {
//            return null;
//        }
//
//        return result;
//    }
//
//    public Double getTotalCoffeeGain() {
//
//        Double gain = coffeeRepository.getTotalCoffeeShopGain();
//
//        if (gain == null) {
//            return 0.0;
//        }
//
//        return gain;
//    }
//
//    public List<Coffee> getDailyEarnings() {
//
//        List<Coffee> result = coffeeRepository.getDailyEarningsForEmployees();
//
//        if (result.isEmpty()) {
//            return null;
//        }
//
//        return result;
//    }





}