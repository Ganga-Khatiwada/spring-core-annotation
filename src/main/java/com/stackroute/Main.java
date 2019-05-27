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
        System.out.println("MovieId:"+ movie.getMovieId());
        System.out.println("MovieName:"+ movie.getMovieName());
        System.out.println("ActorName:"+ movie.getActor().getName());
        System.out.println("ActorAge:"+ movie.getActor().getAge());
        System.out.println("ActorName:"+ movie.getActor().getGender());
    }
}
