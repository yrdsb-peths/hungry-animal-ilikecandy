import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author Jacob Tian
 * @version September 2024
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + speed);
        
        // When apple reaches the bottom, remove and display game over
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
        
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
