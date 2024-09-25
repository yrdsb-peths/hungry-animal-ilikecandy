import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food abstract class
 * 
 * @author Jacob Tian
 * @version September 2024
 */
public abstract class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    private int points;
    
    public Food(int points, int speed) {
        this.points = points;
        this.speed = speed;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + speed);
        
        // When food reaches the bottom, remove and display game over
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
