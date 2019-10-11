package com.study.spring;

import com.study.spring.configs.MyConfig;
import com.study.spring.entities.Cat;
import com.study.spring.entities.Dog;
import com.study.spring.entities.Parrot;
import com.study.spring.entities.WeekDay;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main (String[] args) {

        // automaticAnnotationsTest();

       // springJavaConfigurationTest();

       // poveselee();
       // System.setProperty("webdriver.gecko.driver", "E:/Install/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://pluralsight.com");


    }

    public static void poveselee() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.study.spring.configs");
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's "+weekDay.getWeekDayName()+ " today!");
    }


    public static void automaticAnnotationsTest() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.study.spring.entities");

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

    }

    public static void springJavaConfigurationTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        // ApplicationContext context = new AnnotationConfigApplicationContext("com.study.spring.configs");

        Cat cat = (Cat) context.getBean("getCat");
        Cat catParrotKillerName = (Cat) context.getBean("getCatWithParrotName");

        System.out.println(cat.getName());
        System.out.println(catParrotKillerName.getName());

    }
}
