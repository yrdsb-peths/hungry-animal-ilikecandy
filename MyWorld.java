import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Jacob Tian
 * @version September 2024
 */
public class MyWorld extends World
{

    /**
     * The main world for the hero.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        createApple();
    }
    
    /**
     * Create an apple at a random x location
     */
    public void createApple() {
        Apple apple = new Apple();
        addObject(apple, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(300));
    }
}
