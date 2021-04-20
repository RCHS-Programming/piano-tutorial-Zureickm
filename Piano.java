import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        makekeys();
        
        
    }
    public void makekeys()
    {
      addObject ( new Key  ( "g", "3a.wav"),  300,  180 );
      for (int i=0; i<12; i++)
      {            
        addObject (new Key ("g", "3a.wav"), i*63 + 54, 140);
      }
        
    }
}
