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
    GreenfootImage[] idle = new GreenfootImage[8];
    
    public Elephant() {
        for (int i = 0; i < 8; i++) {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
            idle[i].scale(100, 100);
        }
        setImage(idle[0]);
    }
    
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
        
        // Animate elephant
        animateElephant();
    }
    
    /**
     * Elephant animation
     */
    int imageIndex = 0;
    public void animateElephant() {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
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
