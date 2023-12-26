package com.in28minutes.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// Normally, you want a separate file for each class and dependency, but for
// simplicity's sake, we'll keep them all in one file for now.
@Component
class YourBusinessClass {
    //@Autowired
    Dependency1 dependency1;
    //@Autowired
    Dependency2 dependency2;

    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection - YourBusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }

    /*@Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter Injection - setDependency1");
        this.dependency1 = dependency1;
    }
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection - setDependency2");
        this.dependency2 = dependency2;
    }*/
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan // Automatically component scans on the current package when no package is specified.
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class);

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        System.out.println(context.getBean(YourBusinessClass.class));
    }
}