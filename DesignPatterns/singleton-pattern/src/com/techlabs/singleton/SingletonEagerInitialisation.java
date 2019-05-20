package com.techlabs.singleton;

public class SingletonEagerInitialisation {
  
    private static final SingletonEagerInitialisation instance = new SingletonEagerInitialisation();
    private SingletonEagerInitialisation(){}

    public static SingletonEagerInitialisation getInstance(){
        return instance;
    }
}

/*
 	instance is created even though client application might not be using it*/

