import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Title()
    {
      GreenfootImage img = new GreenfootImage(200,100);
      img.drawString("Guess the Animal",10, 10);
      setImage(img); 
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}