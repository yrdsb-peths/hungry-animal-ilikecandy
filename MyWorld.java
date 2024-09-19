import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Jacob Tian
 * @version September 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    
    /**
     * The main world for the hero.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        // Create elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create label for score
        scoreLabel = new Label(score, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }
    
    /**
     * Update score
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * Create an apple at a random x location
     */
    public void createApple() {
        Apple apple = new Apple();
        addObject(apple, Greenfoot.getRandomNumber(600), 0);
    }
}
