import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephant- hero
 * 
 * @author Jacob Tian 
 * @version Septemebr 2024
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("left")) {
            move(-2);
        } else if (Greenfoot.isKeyDown("right")) {
            move(2);
        }
        
        // apple collision behaviour
        eat();
    }
    
    /**
     * Eat apple if touching, and create a new one
     */
    public void eat() {
        if (isTouching(Apple.class)) {
            removeTouching(Apple.class);
                        
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            
            elephantSound.play();
        }
    }
}
