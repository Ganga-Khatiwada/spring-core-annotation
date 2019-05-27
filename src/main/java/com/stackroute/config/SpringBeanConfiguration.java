package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {

    public static void main(String args[]) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("movie");
        ctx.register(AppConfiguration.class);
        ctx.refresh();

        Movie movie = (Movie) ctx.getBean("movie");
    }

    @Bean(name = "Movie.class")
    public Movie getMovie() {
        Actor actor = new Actor();
        actor.setName("Himanshu Kohli");
        actor.setAge(25);
        actor.setGender("Male");
        Movie movie1 = new Movie();
        movie1.setMovieId(1);
        movie1.setMovieName("Yeh Jawani Hai Deewani");
        movie1.setActor(actor);
        return movie1;
    }
}



