package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {


    @Bean(name = "Movie.class")
    public Movie getMovie()
    {
        Actor actor=new Actor();
        actor.setName("Himanshu Kohli");
        actor.setAge(25);
        actor.setGender("Male");
        Movie movie1=new Movie(actor);
        movie1.setMovieId(1);
        movie1.setMovieName("Yeh Jawani Hai Deewani");
//        movie1.setActor(actor);
        return movie1;
    }



//    @Bean(name = "Movie.class")
//    public Movie getMovie()
//    {
//        Actor actor=new Actor();
//        actor.setName("Himanshu Kohli");
//        actor.setAge(25);
//        actor.setGender("Male");
//        Movie movie1=new Movie();
//        movie1.setMovieId(1);
//        movie1.setMovieName("Yeh Jawani Hai Deewani");
//        movie1.setActor(actor);
//        return movie1;
//    }

//    @Bean(name = "Movie.class")
//    @Scope("prototype")
//    public Movie getMovie()
//    {
//        Actor actor=new Actor("Himanshu Kohli", "Male",25);
//
//        Movie movie=new Movie(1,"Baarish",actor);
//        return movie;
//    }
//
//    @Bean(name = "Movie.class,Movie.class")
//    @Scope("prototype")
//    public Movie getMovie1()
//    {
//        Actor actor=new Actor("Himanshu Kohli", "Male",25);
//
//        Movie movie=new Movie(1,"Baarish",actor);
//        return movie;
//    }
}
