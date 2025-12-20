package org.example;
//Class Syntax access modifier class ClassNAme :
public class Person {


    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int age ;

    public Person(){

    }

    public Person(String firstName,
                  String lastName,
                  String email,
                  String phoneNumber,
                  int age  ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email= email;
        this.phoneNumber =phoneNumber;
        this.age = age;

    }

    //setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
       this.phoneNumber =phoneNumber;

    }
    public void setAge(int age){
        this.age = age;
    }

    //getter
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public int getAge(){
        return age;
    }
}
