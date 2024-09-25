import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Jacob Tian
 * @version September 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2 - 100, 100);
        prepare();
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,464,106);
        Label label = new Label("Use \u2190 and \u2192 arrows to move", 40);
        addObject(label,245,209);
        Label label2 = new Label("Press space to start!", 40);
        addObject(label2,298,271);
    }
}
