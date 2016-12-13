
package lightrunner;

/**
 *
 * @author nicholascerillo
 */
import java.awt.*;
import java.awt.geom.Rectangle2D;


import javax.imageio.*;
//import java.awt.Polygon; 
import java.io.File;
import java.io.IOException;


 class Ship 
{
	
	// location and size variables
        Asteroid ast;
	private  int speedx;
        private  int speedy;
        private  int xP1;
        private  int yP1;
        private int Lx1;
        private  int Lx2;
        private  int Lx3;
 
        private boolean isDead;
        private int Ly1;
        public  int Ly2;
        public  int Ly3;
        private int dm = 2;
        int life = 100;
        private  int width = 600;
        private  int height = 500;
        private int imgwidth = 37;
        private int imgheight = 40;
      //  private boolean isHit = false; 
        private Image ship;
        public java.util.List<Rectangle> lives;
       // private  Rectangle2D.Double deathscreen = new Rectangle2D.Double (0,1000,0,1000);
        Polygon light = new Polygon(new int[] {Lx1,Lx2,Lx3}, new int[]{Ly1,Ly2,Ly3},3);


	public Ship(int x, int y, String loc_file) 
        {          
		//super(); 
           
             try{
                this.ship = ImageIO.read(new File(loc_file));
                }         
                catch (IOException e)
                {
                 System.out.println("Can't load file!");
                } 
		xP1 = x;
                isDead = false;
                yP1 = y;
                Lx1 = x + imgwidth/2;
                Ly1 = y + imgheight/2;
                Lx2 = 1000;
                Ly2 = 0 + dm;
                Lx3 = 1000;
                Ly3 = height - dm;
		speedx = 0;
                speedy = 0;            
	}              
	public void move() 
        {        
           // System.out.println(xP1 + " ---" + yP1);
                light.reset();
		xP1 += speedx;
                yP1 += speedy;   
                Lx1 += speedx;
                Lx2 += speedx;
                Lx3 += speedx;
                Ly1 += speedy;
                Ly2 += speedy + dm;
                Ly3 += speedy - dm;                 
                if(Ly2 != Ly3)
                {
                   dm = 1;
                }
                else{
                    dm = 0;
                    }                                                                                 				
		// update light   
                light.addPoint(Lx1,Ly1);
                light.addPoint(Lx2,Ly2);
                light.addPoint(Lx3, Ly3);  

                if(yP1 <= 0)
                {
                    yP1 = 0;                   
                    Ly1 = imgheight/2;
                    Ly2 = -height/2 ;
                    Ly3 = height/2; 
                    
                }
                if(xP1 <=0 )
                {             
                  xP1 = 0;
                  Lx1 = imgwidth/2;
                  Lx2 = 1000-imgwidth;
                  Lx3 = 1000-imgwidth;    
                 
                }
                                 
                if(yP1 >= (height- (imgheight)))
                {
                  
                   yP1 = height - (imgheight);
                   Ly1 = height-(imgheight/2) ;
                   Ly2 = height/2 ;
                   Ly3 = height + (height/2);                
                }
                if(xP1 >= (width - imgwidth) )
                {
                  xP1 = width-imgwidth;
                  Lx1 = width - (imgwidth/2);
                  Lx2 = width + 1000;
                  Lx3 = width + 1000;
                  
                }
	}
        
      
            
      
            
        
            public void isHit(Asteroid ast)
                {
                    
                     
                     
                   Rectangle2D ship_box = new Rectangle(xP1,yP1,imgwidth,imgheight);
                 
                      
                  
                    if(ast.getHitbox2().intersects(ship_box))
                            {
                                if(ast.isStar() == false)
                                {
                                  life = life - 1;
                                  if(life <= 0){
                                      isDead = true;
                                  }
                                    
                                }
                                else
                                {
                                    Ly2 = Ly2 - 5;
                                    Ly3 = Ly3 + 5;
                                   // System.out.println("Star");
                                }
                            }
                    
                                
                    
                
                
                  //  System.out.println(lives);
                }

	public void paint(Graphics2D p)
        {
               
                p.setColor(Color.WHITE);
                p.drawPolygon(light);             
                p.drawString(Integer.toString(life), 10, 10);
                if(isDead)
                {
                   // p.setColor(Color.RED);
                    p.setColor(Color.WHITE);
                    p.drawString("You Are Dead!!",250,250);
                }
                
                
	     p.fill(light);
                                           
              
	}
        public boolean getDead(){
            return isDead;
        }
        
         public Rectangle2D getHitbox1()
         {
          Rectangle2D ship_box = new Rectangle(xP1,yP1,imgwidth,imgheight);
          return ship_box;
         }    

	public void setSpeedX(int newSpeedX) 
        {
		speedx = newSpeedX;
	}
        public void setSpeedY(int newSpeedY)
        {
                speedy = newSpeedY;
         }
	public int getX1() 
        {
		return xP1;
	}
        public int getY1()
        {
            return yP1;          
        }
        
        public void setLy2(int newLy2)
        {
            Ly2 = newLy2;
        }
        public void setLy3(int newLy3){
             Ly3 = newLy3;
        }


	public Image getShip() {
		return ship;
	} 
      

}