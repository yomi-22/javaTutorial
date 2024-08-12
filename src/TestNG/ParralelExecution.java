package TestNG;

import org.testng.annotations.Test;

public class ParralelExecution {
    /*There are 3 ways to execute tests in parallel
    1. Execute tests in parallel on method level e.g.You need to specify the keyword
    'parallel' and named is 'methods' and the keyword 'thread-count' and assign a value
    of at least 2 in the xml file
    <suite name="All Test Suite" parallel="methods" thread-count="2">
        <test name="MethodParallelExecution">
        <classes>
            <class name="TestNG.ParralelExecution">
                <methods>
                    <include name="info"/>
                    <include name="info2"/>
                    <include name="study"/>
                </methods>
            </class>
        </classes>
    </test>

    2.Execute tests in parallel on class level e.g.You need to specify the keyword
    'parallel' and named it as 'classes' and the keyword 'thread-count' and assign a value
    of at least 2 in the xml file e.g.
    <suite name="All Test Suite" parallel="classes" thread-count="2">
        <test name="MethodParallelExecution">
        <classes>
            <class name="TestNG.ParralelExecution">
            <class name="TestNG.ParralelExecution2">
            </class>
        </classes>
    </test>
    </suite>
    3. Parallel Test Execution Suite level -
    Execute tests in parallel on suite level e.g.You need to specify the keyword
    'parallel' and named is 'tests' and the keyword 'thread-count' and assign a value
    of at least 2 in the xml file e.g.
    <suite name="All Test Suite" parallel="tests" thread-count="2">
        <test name="MethodParallelExecution">
        <classes>
             <class name="TestNG.ParralelExecution2">
            </class>
        </classes>

         <test name="MethodParallelExecution">
        <classes>
            <class name="TestNG.ParralelExecution">
             </class>
        </classes>
    </test>
    </suite>
    * */

    @Test
    void info(String name)
    {
        System.out.println("My name is "+ name);
    }
    @Test
    void info2(String name, int age)
    {
        System.out.println("My name is " + name + " " + "I am " + age + "years old");
    }
    @Test
    void study(String education)
    {
        System.out.println("I study " + education + "at university");
    }
   }
