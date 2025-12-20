package org.example.day13part2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class Controller {


        @GetMapping("/pizzaRecipe")
        public String pizzaRecipe() {
            return "My recipe for creating pizza ";
        }

        @GetMapping("/pizzaTools")
        public String pizzaTools() {
            return " bowl, rolling ,  tray, oven, cutter";
        }

        @GetMapping("/pizzaIngredients")
        public String pizzaIngredients() {
            return "Flour, salt, sugar, olive oil, water, tomato sauce, cheese, and toppings like olives, pepperoni";
        }

        @GetMapping("/pizzaSteps")
        public String pizzaSteps() {
            return "1. Mix flour, yeast, sugar, salt, and water to make the dough.\n"
                    + "2. Let the dough rise for about an hour.\n"
                    + "3. Roll the dough flat and spread tomato sauce evenly.\n"
                    + "4. Add cheese and your favorite toppings.\n"
                    + "5. Bake in a preheated oven at 220°C for 12–15 minutes.\n"
                    + "6. Slice pizza ";
        }


        @GetMapping("/cakeRecipe")
        public String cakeRecipe() {
            return " recipe of cake ";
        }

        @GetMapping("/cakeTools")
        public ArrayList<String> cakeTools() {
            String[] tools = {" bowl", "Whisk", "Measuring cups", "Oven", "Cake pan", "Spatula"};
            return new ArrayList<>(Arrays.asList(tools));
        }

        @GetMapping("/cakeIngredients")
        public ArrayList<String> cakeIngredients() {
            return new ArrayList<>(Arrays.asList(
                    "Flour", "Sugar", "Eggs", "Butter", "Milk", "Baking powder", "Vanilla  "
            ));
        }

        @GetMapping("/cakeSteps")
        public ArrayList<String> cakeSteps() {
            return new ArrayList<>(Arrays.asList(
                    "1. Preheat the oven to 180  .",
                    "2. Mix flour, baking powder, and sugar together .",
                    "3. Add eggs, milk, butter, and vanilla extract; whisk until smooth .",
                    "4. Pour the batter into a greased cake pan . ",
                    "5. Bake for 30–35 minutes until golden and cooked through ."
            ));
        }

        @GetMapping("/juiceRecipe")
        public ArrayList<String> juiceRecipe() {
            return new ArrayList<>(Arrays.asList(
                    "1. Wash and peel the fruits  .",
                    "2. Cut them into small pieces .",
                    "3. Add the fruit pieces into a blender .",
                    "4. Pour in some water or milk depending on the juice type .",
                    "5. Blend until smooth  ."
            ));
        }

        @GetMapping("/juiceIngredients")
        public ArrayList<String> juiceIngredients() {
            return new ArrayList<>(Arrays.asList(
                    "Fresh fruits", "Sugar   ", "Water or milk", "Ice cubes"
            ));
        }

        @GetMapping("/coffeeRecipe")
        public ArrayList<String> coffeeRecipe() {
            return new ArrayList<>(Arrays.asList(
                    "1. Boil water in a kettle or pot  .",
                    "2. Add coffee powder or ground coffee to a cup  .",
                    "3. Pour the hot water over the coffee  .",
                    "4. Stir well and add sugar if you like . ",
                    "5. Add milk or cream  ."
            ));
        }

        @GetMapping("/coffeeIngredients")
        public ArrayList<String> coffeeIngredients() {
            return new ArrayList<>(Arrays.asList(
                    "Coffee powder", "Hot water", "Sugar", "Milk or cream"
            ));
        }

// idea : its like a google recibe and steps how to coock !


}
