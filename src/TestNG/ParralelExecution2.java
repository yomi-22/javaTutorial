package TestNG;

import org.testng.annotations.Test;

public class ParralelExecution2 {
    @Test
    void parallelInfo(String name)
    {
        System.out.println("My name is "+ name);
    }
    @Test
    void parallelinfo2(String name, int age)
    {

        System.out.println("My name is " + name + " " + "I am " + age + "years old");
    }
    @Test
    void parallelstudy(String education)
    {
        System.out.println("I study " + education + "at university");
    }
   }
