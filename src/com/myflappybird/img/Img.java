package com.myflappybird.img;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Img {
	
	/**
	 * ����ͼƬ
	 */
	public static Image background = new ImageIcon("skin/Graphics01/background.png").getImage();
	
	public static Image background1 = new ImageIcon("skin/Graphics01/background1.png").getImage();
	
	
	
	/**
	 * ��Ϸ����Ļ�ӭ����
	 */
	public static Image loading = new ImageIcon("skin/Graphics01/loading.png").getImage();
	
	public static Image rect = new ImageIcon("skin/Graphics01/rect.png").getImage();
	
	/**
	 * ��Ϸ��ʼʱ��ͼƬ
	 */
	public static Image start = new ImageIcon("skin/Graphics01/start.png").getImage();
	
	/**
	 * ��ʼ��Ϸ�İ�ť��ͼƬ
	 */
	public static ImageIcon btnBegin = new ImageIcon("skin/Graphics01/begin.png");
	
	/**
	 * ��Ϸ׼������ͼƬ
	 */
	public static Image ready = new ImageIcon("skin/Graphics01/ready.png").getImage();
	
	/**
	 * ����ͼƬ
	 */
	public static Image ground = new ImageIcon("skin/Graphics01/ground.png").getImage();
	
	/**
	 * �Ϸ�����ͼƬ
	 */
	public static Image pillar0 = new ImageIcon("skin/Graphics01/8.png").getImage();
	
	/**
	 * �·�����ͼƬ
	 */
	public static Image pillar1 = new ImageIcon("skin/Graphics01/9.png").getImage();
	
	/**
	 * ��ͣͼƬ
	 */
	public static Image pause = new ImageIcon("skin/Graphics01/pause.png").getImage();
	
	/**
	 * ����С���ͼƬ
	 */
	public static Image deadbird = new ImageIcon("skin/Graphics01/deadbird.png").getImage();
	
	/**
	 *��Ϸ������ͼƬ 
	 */
	public static Image gameover = new ImageIcon("skin/Graphics01/gameover.png").getImage();
	
	/**
	 * ��Ϸ����ͼƬ
	 */
	public static Image scoreboard = new ImageIcon("skin/Graphics01/scoreboard.png").getImage();
	
	/**
	 * ���ڿ�ܵ�ͼƬ
	 */
	public static Image[] windows;
	static {
		windows = new Image[3];
		for(int i = 0; i < 3;i++){
			windows[i] = new ImageIcon("skin/Graphics01/Window0"+i+".png").getImage();
		}
		
	}
	
	/**
	 * ����ͼƬ
	 */
	public static Image[] num;
	static {
		num = new Image[10];
		for(int i = 0;i<10;i++){
			num[i] = new ImageIcon("skin/Graphics01/0"+i+".png").getImage();
		}
		
	}
	
	/**
	 * ��̬С���ͼƬ
	 */
	public static Image[] birds;
	static{
		birds = new Image[8];
		for(int i = 0;i<8;i++){
			birds[i] = new ImageIcon("skin/Graphics01/"+i+".png").getImage();
		}
	}
	
}
