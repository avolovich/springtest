package com.study.spring.configs;


import com.study.spring.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("com.study.spring.entities")
public class MyConfig {

//    @Bean
//    public Cat getCat() {
//        return new Cat();
//    }
//
//    @Bean
//    public Cat getCatWithParrotName(Dog dog) {
//        Cat cat = new Cat();
//        cat.setName(dog.getName()+"-killer");
//        return cat;
//    }
//
//    @Bean("blabla")
//    public Dog blabla() {
//        return new Dog();
//    }
//
//   @Bean("addParrot")
//    public Parrot getParrot() {
//        return new Parrot();
//    }
//
////    @Bean("addOneMoreParrot")
//    public Parrot getParrotDuplicate() {
//        Parrot parrot = new Parrot();
//        String newName = parrot.getName()+"-dobrodetel";
//        parrot.setName(newName);
//        return parrot;
//    }

    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            default: return new Monday();
        }
    }
}
