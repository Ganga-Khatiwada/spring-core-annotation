package com.stackroute;

import com.stackroute.config.AppConfiguration;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfiguration.class);
        ctx.refresh();
        Movie movie = (Movie) ctx.getBean("Movie.class");
        System.out.println(movie.toString());


//        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext();
//        ctx2.register(AppConfiguration.class);
//        ctx2.refresh();
//        Movie movies = (Movie) ctx2.getBean("Movie.class");
//        System.out.println("Actor " + movies.getActor().getName() + " of age "+movies.getActor().getAge()+" acted in " + movies.getMovieName());




//        System.out.println("MovieId:"+ movie.getMovieId());
//        System.out.println("MovieName:"+ movie.getMovieName());
//        System.out.println("ActorName:"+ movie.getActor().getName());
//        System.out.println("ActorAge:"+ movie.getActor().getAge());
//        System.out.println("ActorName:"+ movie.getActor().getGender());


//        AnnotationConfigApplicationContext ctxx = new AnnotationConfigApplicationContext();
//        ctxx.register(AppConfiguration.class);
//        ctxx.refresh();
//        Movie movie1 = (Movie) ctxx.getBean("Movie.class");
//        Movie movie2 = (Movie) ctxx.getBean("Movie.class");
//        System.out.println(movie1 == movie2);
//
//
//        AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext();
//        ctx1.register(AppConfiguration.class);
//        ctx1.refresh();
//        Movie movies = (Movie) ctx1.getBean("Movie.class,Movie.class");
//        System.out.println("Actor " + movies.getActor().getName() + " of age "+movies.getActor().getAge()+" acted in " + movies.getMovieName());

    }
}
