package org.example;

public class Car {

        private String code ;
        private Routes route;
        private int maxCapacity;

        // Constructor
        public Car(){}

        public Car(
                 String code ,
                 Routes route,
                 int maxCapacity
        ){
            this.code = code;
            this.route= route;
            this.maxCapacity = maxCapacity;
        }

        //setter
        public void setCode(String code) {
            this.code = code;
        }
        public void setRoute(Routes route) {
            this.route = route;
        }
        public void setMaxCapacity(int maxCapacity) {
            this.maxCapacity = maxCapacity;
        }

        //getter
        public int getMaxCapacity() {
            return maxCapacity;
        }
        public Routes getRoute() {
            return route;
        }
        public String getCode() {
            return code;
        }

        // methods
        public void calculateCapacity(){
             this.maxCapacity -= 1 ;
        }

}
