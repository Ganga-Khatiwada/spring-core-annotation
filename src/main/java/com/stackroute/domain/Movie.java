package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
        private int movieId;
        private String movieName;
        private Actor actor;

        public Movie(int movieId,String movieName,Actor actor) {
            this.movieId = movieId;
            this.movieName = movieName;
            this.actor = actor;
        }
        public Movie(){}

        @Autowired
        public Movie(Actor actor) {
            this.actor = actor;
        }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        System.out.println("ApplicationContext: "+ applicationContext);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
        System.out.println("BeanFactory: "+ beanFactory);
    }

    @Override
    public void setBeanName(String s)
    {
        System.out.println("BeanName: "+ s);
    }

            public int getMovieId() {
            return movieId;
        }

        public void setMovieId(int movieId) {
            this.movieId = movieId;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }

        public Actor getActor() {
            return actor;
        }

        public void setActor(Actor actor) {
            this.actor = actor;
        }

        @Override
        public String toString() {
            return "MovieId: " + movieId + " MovieName: " + movieName+" Actor"+actor;
        }
    }

