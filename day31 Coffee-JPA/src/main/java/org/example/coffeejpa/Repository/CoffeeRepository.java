package org.example.coffeejpa.Repository;

import org.example.coffeejpa.Model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee,Integer> {

    //  returnType whatYouWant
    // rules :
    //       1- no underscored _ within the variables names
    //       2- variables name MUST be small litter for first litter in first word capital litter for first litter  the rest

    Coffee findCoffeeByCoffeeID(Integer coffeeID);

    List<Coffee> findCoffeeByCoffeeCategory(String coffeeCategory);

    List<Coffee> findCoffeeByCoffeeCategoryAndCoffeeName(String coffeeCategory , String coffeeName);


    List<Coffee> findCoffeeByEmployeeID(Integer employeeID);



    // 1- find categorised coffee that made from a specific employee

    @Query("SELECT c FROM Coffee c WHERE c.coffeeCategory = ?1 AND c.employeeID = ?2")
    List<Coffee> findCategorizedCoffeeByEmployee(String category, Integer employeeID);


    // 2- see a specific category coffees from min to max

    @Query("SELECT c FROM Coffee c WHERE c.coffeeCategory = ?1 ORDER BY c.coffeePrice ASC")
    List<Coffee> findCategoryPriceAsc(String category);


    // 3- see a specific category coffees from max to min

    @Query("SELECT c FROM Coffee c WHERE c.coffeeCategory = ?1 ORDER BY c.coffeePrice DESC")
    List<Coffee> findCategoryPriceDesc(String category);

    // 4- see the most employer who make coffee

    @Query("SELECT c.employeeID, COUNT(c) FROM Coffee c GROUP BY c.employeeID ORDER BY COUNT(c) DESC")
    List<Coffee> findMostCoffeeMaker();

    // 5- see total coffee shop gain

    @Query("SELECT SUM(c.coffeePrice) FROM Coffee c")
    Double getTotalCoffeeShopGain();

    // 6- see how much each employee make a  day

    @Query("SELECT c.employeeID, SUM(c.coffeePrice) FROM Coffee c GROUP BY c.employeeID")
    List<Coffee> getDailyEarningsForEmployees();






}
