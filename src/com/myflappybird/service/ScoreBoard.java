package com.myflappybird.service;

import java.awt.Graphics;
import com.myflappybird.img.Img;
import com.myflappybird.ui.CreateWindow;

public class ScoreBoard {
	
	/**
	 * ��������X����
	 */
	private int boardX;
	
	/**
	 * �����˶����ٶ�
	 */
	private final int BOARD_SPEED = 8;
	
	/**
	 * ���Ŀ��
	 */
	private final int BOARD_WIDTH = 500;
	
	/**
	 * ���ĸ߶�
	 */
	private final int BOARD_HEIGHT = 200;
	
	/**
	 * ��������Y����
	 */
	private int boardY;
	
	/**
	 * ���췽��
	 * @param boardX
	 * @param boardY
	 */
	public ScoreBoard(int boardX, int boardY){
		this.boardX = boardX;
		this.boardY = boardY;
	}
	
	/**
	 * ����ƶ��ķ���
	 */
	public void boardMove(){
		if(boardY < 100){
			return ;
		}
		boardY -= BOARD_SPEED;
	}
	
	/**
	 * �������ķ���
	 * @param g
	 */
	public void drawBoard(Graphics g){
		//����window
		CreateWindow.drawWindow(g, Img.windows[0], boardX, boardY, BOARD_WIDTH, BOARD_HEIGHT);
		//��������С�� 
		g.drawImage(Img.deadbird, boardX, boardY, null);	
	}
	
}
