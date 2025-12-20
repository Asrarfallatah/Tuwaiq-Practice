package org.example.coffeejpa.Api;

public class ApiException extends  RuntimeException{

    public ApiException (String message){
        super(message);
    }
}
