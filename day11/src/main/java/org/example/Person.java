package org.example;
//Class Syntax access modifier class ClassNAme :
public class Person {


    private String name ;
    private String city;
    private String collegeName;
    private String email;
    private String major ;
    private String phoneNumber;
    private int age ;
    private double gpa ;

    // constructor is like a method but it is not a method.
    // it is better to be public, but it is not a must
    // if we write our own constructor the default one disappear
    // constructor Syntax : access modifier CLassName (){   }

    public Person(){

    }

    public Person(String name ,
                  String city,
                  String collegeName,
                  String email,
                  String major ,
                  String phoneNumber,
                  int age ,
                  double gpa  ){
                this.name = name;
                this.city= city;
                this.collegeName =collegeName;
                this.email= email;
                this.major= major;
                this.phoneNumber =phoneNumber;
                this.age = age;
                this.gpa = gpa;
    }

    //setter and getter :

    public String setName(String name){
        if (name.length() < 4 ){
            this.name= "Names can't be less than 4 character";
            return this.name;
        }
        this.name = name;
        return this.name;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setCollegeName(String collegeName){
        this.collegeName = collegeName;
    }

    public String setEmail(String email){

        if (!email.contains("@")){
            this.email = "this is is not a valid email ";
            return this.email;
        }
        this.email = email;
        return this.email;
    }

    public void setMajor(String major){
        this.major = major;
    }
    public String setPhoneNumber(String phoneNumber){
        if (phoneNumber.length() < 10 ){
            this.phoneNumber= "Phone numbers can't be less than 10 numbers";
            return this.phoneNumber;
        }
        this.phoneNumber = phoneNumber;
        return this.phoneNumber;

    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }



    public String getName(){
       return  name;
    }
    public String getCity(){
        return city;
    }
    public String getCollegeName(){
        return collegeName;
    }
    public String getEmail(){
        return email;
    }
    public String getMajor(){
        return major;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public int getAge(){
        return age;
    }

    public double getGpa(){
        return gpa;
    }
}
