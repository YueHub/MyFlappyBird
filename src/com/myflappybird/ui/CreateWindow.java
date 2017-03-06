package com.myflappybird.ui;

import java.awt.Graphics;
import java.awt.Image;

public class CreateWindow {
	
	/**
	 * ���ƴ��ڵķ���(�и�)
	 * @param g
	 * @param img
	 * @param X
	 * @param Y
	 * @param width
	 * @param height
	 */
	public static void  drawWindow(Graphics g, Image img, int X, int Y, int width, int height){
		//�и����ϲ���
		g.drawImage(img, X, Y, X+9, Y+9, 0, 0, 9,9, null);
		//�и����ϲ���
		g.drawImage(img, X+9, Y, X+width - 9, Y+9, 9, 0, 55,9, null);
		//�и����ϲ���
		g.drawImage(img, X+width - 9, Y, X+width, Y+9, 55, 0, 64,9, null);
		
		//�и����в���
		g.drawImage(img, X, Y + 9, X+9, Y+height-9, 0, 9, 9,55, null);
		//�и����в���
		g.drawImage(img, X+9, Y+9, X+width-9, Y+height-9, 9, 9, 55,55, null);
		//�и����в���
		g.drawImage(img, X+width-9, Y+9, X+width, Y+height-9, 55, 9, 64,55, null);
		
		//�и����󲿷�
		g.drawImage(img, X, Y+height-9, X+9, Y+height, 0, 55, 9,64, null);
		//�и����в���
		g.drawImage(img, X+9, Y+height-9, X+width-9, Y+height, 9, 55, 55,64, null);
		//�и����Ҳ���
		g.drawImage(img, X+width-9, Y+height-9, X+width, Y+height, 55, 55, 64,64, null);		
	}
}
