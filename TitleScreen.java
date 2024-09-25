import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Jacob Tian
 * @version September 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, getHeight()/2);
    }
    
    /**
     * Main world act loop
     */
    public void act() {
        // Start game if space bar pressed
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
    }
}
