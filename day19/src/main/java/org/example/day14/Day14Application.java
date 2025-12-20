package org.example.day14;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class Day14Application {

    public static void main(String[] args) {
        SpringApplication.run(Day14Application.class, args);
    }

    @Bean
    @Qualifier("first")
    public String message1(){
        System.out.println("this is my primary in message 1 ");
        return "from message1 in message2";
    }

    @Bean
    @Primary
    @Qualifier("fourth")
    public String message2(@Qualifier("third") String message){
        System.out.println(message);
        return "from message3 in message8";
    }

    @Bean
    @Qualifier("third")
    public String message3(@Qualifier("second") String message){
        System.out.println(message);
        return "from message2 in message3";
    }

    @Bean
    @Qualifier("myInt2")
    public int message4(){
        System.out.println("this is my message 4 ");
        return 24;
    }

    @Bean
    @Primary
    @Qualifier("myInt")
    public int message5(@Qualifier("myInt2") int message){
        System.out.println(message);
        return 25;
    }

    @Bean
    @Qualifier("second")
    public String message6(@Qualifier("first") String message){
        System.out.println(message);
        return "from message6 in message3";
    }

    @Bean
    public int message7(@Qualifier("myInt") int message){
        System.out.println(message);
        return 27;
    }


    @Bean
    public String message8(@Qualifier("fourth") String string){
        System.out.println(string);
        return "message8";
    }

    @Bean
    public int message9(){
        System.out.println("this is my message9");
        return 29;
    }

}

//*
//
//
/// /// Spring context ذي تخلنينا نقول للبرنامج ترا فيه حاجة هنا و ترتيبهم
//
/// // spring container ذي تحتوي كل حاجة
//          هنا فيه اولوية لmethoods اي وحدة ما فيها parameter تشتغل اول حاجة
//
//
///// @bean  ذي اساس كل ال الات الموجودة
//
//
// *//
