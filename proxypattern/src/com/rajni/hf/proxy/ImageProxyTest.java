/**
 * 
 */
package com.rajni.hf.proxy;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author rajni.ubhi
 *
 */
public class ImageProxyTest {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Image Loading");
		frame.setSize(800, 800);
		Icon icon = new ImageProxy();
		JLabel label = new JLabel(icon);
		frame.add(label);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
