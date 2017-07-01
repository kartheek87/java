//write a j2me program to show how to change font
//program
import javax.microedition.lcdui.*;

import javax.microedition.midlet.*; 
 
import java.io.*;
import java.lang.*;

import javax.microedition.io.*;

import javax.microedition.rms.*;

public class changeFont extends MIDlet { public static final boolean COLOR = false;

public static final boolean DEBUG = false; 
public static final int WHITE = 0xFFFFFF;
   
 public static final int BLACK = 0x000000;
  
  public static final int BLUE = 0x0000FF;
  
  public static final int LIGHT_GRAY = 0xAAAAAA;
  
  public static final int DARK_GRAY = 0x555555;
    
   private Display myDisplay = null;
    
   private DecodeCanvas decodeCanvas = null;

     private boolean painting = false;
 
  public changeFont()
 {    myDisplay = Display.getDisplay(this);
 
       decodeCanvas = new DecodeCanvas(this);

   
 }

public void startApp() throws MIDletStateChangeException { 
       
 myDisplay.setCurrent(decodeCanvas);
    }

   public void pauseApp() {


    }

 protected void destroyApp(boolean unconditional)
 throws MIDletStateChangeException {
    }

    class DecodeCanvas extends Canvas {
      
  private changeFont parent = null;
 private int width = getWidth();
      
  private int height = getHeight();
  
 public DecodeCanvas(changeFont parent) {
            
this.parent = parent;
     
        }
  
   public void paint(Graphics g) {
                        
    g.setColor(WHITE);  
           
 g.fillRect(0, 0, width, height);
            
         Font f1 = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN,                  Font.SIZE_LARGE);
        Font f2 = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_MEDIUM);
        Font f3 = Font.getFont(Font.FACE_SYSTEM, Font.STYLE_PLAIN, Font.SIZE_SMALL);  
  
          int yPos = 0;
            
if (COLOR)
               
 g.setColor(BLUE);       
            
else 
                
g.setColor(LIGHT_GRAY);
    
g.fillRect(0, yPos, width, f1.getHeight());

 
  if (COLOR)
               
 g.setColor(WHITE);       
           
 else
                

g.setColor(BLACK);
                   
g.setFont(f1);
           
 g.drawString("BIG FONT", 0, yPos, Graphics.LEFT | Graphics.TOP);
  
  yPos = yPos + f1.getHeight() + 10;
            
g.setFont(f2);
     
       g.drawString("MEDIUM FONT", 0, yPos, Graphics.LEFT | Graphics.TOP);
           
 g.setColor(BLACK);       
           
 
    
       yPos = yPos + f1.getHeight() + 10;            
            g.setFont(f3);
            
g.drawString("SMALL FONT", 0, yPos, Graphics.LEFT | Graphics.TOP);
                        
yPos = yPos + f1.getHeight() + 10;            
           
g.drawLine(0, f3.getHeight() + yPos - 1, width, f3.getHeight() + yPos - 1);
             
           
 painting = false;
        }
        
        }    
} 


