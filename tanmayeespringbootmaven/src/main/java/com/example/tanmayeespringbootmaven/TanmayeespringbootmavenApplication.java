package com.example.tanmayeespringbootmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TanmayeespringbootmavenApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(TanmayeespringbootmavenApplication.class, args);

		//it returns a configurable application context

		Alien a = context.getBean(Alien.class);

		a.show();
	}

}

//SpringApplication.run returns a spring container that is inside the JVM
//the moment we say run it will return the context
//where it initiates the container
//container will take care of creating the objects of specified class
//instead of creating all objects for all available classes in project
//we need to specify the spring that a particular class objects need to be created
//so we specify that using @Component over the class from which we want the object
//spring framework automatically creates objects for specified class and injects automatically for us


//by adding @Component then that particular class will be converted into a spring Bean

//spring framework will creates the objects for us

//In total it only creates one object
//By default Spring framework used singleton design pattern where it only creates one object


//we add another anotation @scope(value="prototype")
//it means it will create an object instance the point where we need

//if nothing specified springboot automatically considers it as singleton and then creates objects once at the start of the application
//for prototype it will create during the usage


