package com.ajan.swingpaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JComponent;
//Component for draw



public class DrawArea extends JComponent {
	
	//image in which  we are going to  draw
	 
	private Image image;
	//Graphics 2D object
	private Graphics2D g2;
	//mouse coordinates 
	private int currentX,currentY,oldX,oldY;
	
	public DrawArea() 
	
	{
		setDoubleBuffered(false);
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				//save cordinates x,y when mouse is pressed
				oldX=e.getX();
				oldY=e.getY();
			}
			
		});
		addMouseMotionListener(new MouseMotionAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				//cordinates x,y when drag mouse 
				currentX = e.getX();
				currentY = e.getY();
				if(g2!=null)
				{
					// draw line if g2 context not null
					g2.drawLine(oldX,oldY,currentX,currentY);
					//refresh draw area to repaint 
					repaint();
					//store the current coords x,y as olds x,y
					oldX=currentX;
					oldY=currentY;
				}
			} }
				);
		 
	}
	@Override
	protected void paintComponent(Graphics g) {
	    if (image == null) {
	        // image to draw is null ==> create.
	        createImage(getSize().width, getSize().height);
	        image = createImage(getSize().width, getSize().height); // Assign the created image to the variable
	        g2 = (Graphics2D) image.getGraphics();
	        // enable antialiasing
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        // clear draw area
	        clear();
	    }
	    g.drawImage(image, 0, 0, null);
	    // now we create exposed methods
	}

	void clear() {
		g2.setPaint(Color.white);
		//draw white on entire draw are a to clear .
		g2.fillRect(0, 0, getSize().width, getSize().height);
		g2.setPaint(Color.black);
		repaint();
			
		
	}
	 public void red() {
		    // apply red color on g2 context
		    g2.setPaint(Color.red);
		  }
		 
		  public void black() {
		    g2.setPaint(Color.black);
		  }
		 
		  
		  public void magenta() {
		    g2.setPaint(Color.magenta);
		  }
		 
		  
		  public void green() {
		    g2.setPaint(Color.green);
		  }
		 
		  
		  public void blue() {
		    g2.setPaint(Color.blue);
		  }
		  
		  
		  public void yellow() {
		        g2.setPaint(Color.yellow);
		    }

		  
		  
		    public void orange() {
		        g2.setPaint(Color.orange);
		    }

		  
		    public void gray() {
		        g2.setPaint(Color.gray);
		    }
			public void customColor(Color yellow) {
				// TODO Auto-generated method stub
				
			}
			public void cyan(Color cyan) {
				// TODO Auto-generated method stub
				
			}

		  
		
		 
	
	
}
