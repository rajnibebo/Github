/**
 * 
 */
package com.rajni.hf.proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * @author rajni.ubhi
 * 
 */
public class ImageProxy implements Icon {

	private ImageIcon icon;
//	private URL imageUrl;
	private Thread retrievingThread;
	private boolean retrieving = false;
/*
	public ImageProxy(String url) {
		// TODO Auto-generated constructor stub
		this.imageUrl = url;
	}*/
	
	public ImageProxy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		if (icon != null) {
			return icon.getIconHeight();
		}
		return 600;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		if (icon != null) {
			return icon.getIconWidth();
		}
		return 800;
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		if (icon != null) {
			icon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading Cover..Please Wait...", x+300, y+190);
			if(!retrieving) {
				retrieving = true;
				retrievingThread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						try {
							Thread.sleep(10000);
							icon = new ImageIcon("pic.jpg","CD Cover");
							c.repaint();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				});
				retrievingThread.start();
			}
		}
	}

}
