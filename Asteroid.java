/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lightrunner;
import java.awt. *;
import java.awt.event. *;
import java.awt.image.*;
import java.io. *;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.geom.Rectangle2D;
//import java.awt.geom.Ellipse2D;

/**
 *
 * @author nicholascerillo
 */
class Asteroid 
{
   private int ast_speed;
 
   private int xP1;
   private int yP1;
   private int Width;
   private int Height;
   private boolean isStar;
  // private Rectangle2D.Double ast = new Rectangle2D.Double(xP1,yP1,width,height);
   private Image ast;
     
   public Asteroid(int x, int y)
   {
       xP1 = x;
       yP1 = y;
       Width = 48; 
       Height = 40;
       ast_speed = 4;
     if(y%6 ==  1)
     {
       try
       {
       this.ast = ImageIO.read(new File("/Users/nicholascerillo/Desktop/star.png"));
       isStar = true;
       } catch (IOException e)
    {
        System.out.println("Can't load file!");
    }   
     }
     else
     {
           try
       {
       this.ast = ImageIO.read(new File("/Users/nicholascerillo/Desktop/asteroid.png"));
       isStar = false;
       } catch (IOException e)
    {
        System.out.println("Can't load file!");
    }
     }
    
       
                         
   }
   
   public int getX()
   {
    return xP1;
   }
   public int getY()
   {
       return yP1;
   }
   public boolean isStar()
   {
       return isStar;
   }
        
    public void moveAsteroid()
    {
        
     xP1 -= ast_speed;
    //ast.setRect(xP1,yP1,width,height);
     if(xP1 < -100)
        {
          Random rand = new Random();
           xP1 = 600;  
           yP1 = rand.nextInt(600 - 0);
        }
    }
    
    public Rectangle2D getHitbox2(){
          Rectangle ast_box = new Rectangle(xP1,yP1,Width,Height);
        return ast_box;
        
    }
            
    
    public Image getImage()
    {
        return ast;
    }
     

    
}
