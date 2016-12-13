
 //* To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.

package lightrunner;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;
import java.awt.geom.Area;
import javax.swing.Timer;
import java.awt.Rectangle;



 class LightRunner
{
	public static void main(String[] args) {
         JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(600,520);
        frame.setTitle("Light Runner");
        
        frame.add(new GamePanel());
        frame.setVisible(true);
	}

	public static class GamePanel extends JPanel 
        {
		
		public java.util.List<Rectangle> lives;
                  //rect = new Rectangle(x, y, width, height);
                 
		Ship ship;
                Asteroid asteroid;
                Asteroid asteroid2;
               
                Timer timer;
               Graphics g;
               //  private final int MILLESECONDS_BETWEEN_FRAMES = 10;                
                Asteroid[] ast_array;
                boolean isStar;
		               
		public GamePanel() 
                {         
			super();
                        setBackground(Color.black);
			initializeGameObjects();
			addKeyListener(new ShipMover());                        
			setFocusable(true);		
		}
                                              
       
		public void initializeGameObjects()
                {
                            
                        ast_array = new Asteroid[8];
			ship = new Ship(10, 164,"/Users/nicholascerillo/Desktop/ship.png" );
			timer = new Timer(10, new GameMotion());
                       // 
                        
                         for (int i = 0; i <= 7; i++)
                        {
                            Random rand = new Random();
                            int Astx = WIDTH + (i*200) + 200;
                            int Asty = rand.nextInt((600-0)) + 0; 
                            ast_array[i] = new Asteroid(Astx,Asty);
              
                        }
                                  
                      
		
                      timer.start();  
                        
		}
		@Override
		public void paintComponent(Graphics x) 
                {
			//super();
                          if(ship.getDead())
                                {
                                    
                                    setBackground(Color.red); 
                                }
			Graphics2D g2 = (Graphics2D)x;			
			ship.paint(g2);
                        g2.drawImage(ship.getShip(),ship.getX1(), ship.getY1(),this);
                        
                         for(int r = 0; r < 7; r++)
                         {
                          g2.drawImage(ast_array[r].getImage(), ast_array[r].getX(), ast_array[r].getY(),null); 
                         }
                      

		}

                
		private class GameMotion implements ActionListener 
		{
                                                                        
			public GameMotion() 
                        {
                             
			}
			public void actionPerformed(ActionEvent evt)
                        {	
                  
                               ship.move();
				ast_array[0].moveAsteroid();
                                ast_array[1].moveAsteroid();
                                ast_array[2].moveAsteroid();
                                ast_array[3].moveAsteroid();
                                ast_array[4].moveAsteroid();
                                ast_array[5].moveAsteroid();
                                ast_array[6].moveAsteroid();
                                ast_array[7].moveAsteroid();                                                                                
                                for(int p = 0; p < 7; p++)
                                {
                                ship.isHit(ast_array[p]);                                                                                          
                                }                                                              
				repaint();
                                
                                
			}                                          
		}                              

		private class ShipMover implements KeyListener
           {
			public void keyPressed(KeyEvent evt) {
				
				int key = evt.getKeyCode();

                                 if (key == KeyEvent.VK_RIGHT ) 
                                {                              			
					ship.setSpeedX(5);                                
                                }
                                
				else if (key == KeyEvent.VK_LEFT) 
                                {
					ship.setSpeedX(-5);                                   
				}
                                else if(key == KeyEvent.VK_UP )
                                {
                                    ship.setSpeedY(-5);
                                }
                                else if(key == KeyEvent.VK_DOWN ){
                                    ship.setSpeedY(5);
                                }
			}
			public void keyReleased(KeyEvent evt) {
				int key = evt.getKeyCode();
				if ((key == KeyEvent.VK_LEFT) || (key == KeyEvent.VK_RIGHT) )  {
					ship.setSpeedX(0);
				}
                                
                                else if((key == KeyEvent.VK_UP) || (key == KeyEvent.VK_DOWN))
                                {
                                    ship.setSpeedY(0);
                                }
							
			}
			public void keyTyped(KeyEvent evt) 
                        {

			}
		}
                
                
             

	
	}
}
   //

