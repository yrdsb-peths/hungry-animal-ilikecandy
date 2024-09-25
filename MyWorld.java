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
    int level = 1;
    
    /**
     * The main world for the hero.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        // Create elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create label for score
        scoreLabel = new Label(score, 80);
        addObject(scoreLabel, 50, 50);
        
        createFood();
    }
    
    /**
     * End the game and display game over 
     */
    public void gameOver() {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Update score
     */
    public void increaseScore(int s) {
        score += s;
        scoreLabel.setValue(score);
        
        if (score % 5 == 0) {
            level += 1;
        }
    }
    
    /**
     * Create random food at a random x location
     */
    public void createFood() {
        Food food;
        int rand = Greenfoot.getRandomNumber(2);
        if (rand == 1) {
            food = new Apple(level);
        } else {
            food = new Banana(level);
        }
        
        addObject(food, Greenfoot.getRandomNumber(600), 0);
    }
}
