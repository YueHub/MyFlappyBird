package com.myflappybird.service;

import java.awt.Graphics;
import java.awt.Rectangle;
import com.myflappybird.dto.GameDto;
import com.myflappybird.img.Img;

public class Ground {
	
	/**
	 * ���ݴ����
	 */
	GameDto dto;
	
	/**
	 * ����ĳ���
	 */
	private final int GROUND_WIDTH = 800;
	
	/**
	 * ����ĸ߶�
	 */
	private final int GROUND_HEIGHT = 150;
	
	/**
	 * �����X����
	 */
	private int groundX;
	
	/**
	 * �����Y����
	 */
	private int groundY;
	
	/**
	 * ������ƶ����ٶ�
	 */
	private final int SPEED = 8;
	
	/**
	 * ����Ĺ��췽��
	 */
	public Ground(GameDto dto ,int groundX,int groundY){
		this.dto = dto;
		this.groundX = groundX;
		this.groundY = groundY;
	}
	
	/**
	 * �����ƶ��ķ���
	 */
	public void move(){
		//�����Ϸ��ͣ��С����������Ͳ����ƶ�
		if(this.dto.isPause()||this.dto.isBirdDead()){
			return ;
		}
		if(groundX<-100){
			groundX=0;
		}
		groundX-=SPEED;
	}
	
	/**
	 * �õ�����ľ���
	 */
	public Rectangle getRect(){
		return new Rectangle(groundX,groundY,GROUND_WIDTH,GROUND_HEIGHT);
	}
	
	/**
	 * ���Ƶ���ķ���
	 */
	public void drawGround(Graphics g){
		g.drawImage(Img.ground, groundX, groundY, null);
	}
	
	/**
	 * �õ�����X����ķ���
	 */
	public int getGroundX(){
		return groundX;
	}
	
	/**
	 * ���õ���X����ķ���
	 */
	public void setGroundX(int groundX){
		this.groundX = groundX;
	}
	
	/**
	 * �õ�����Y����ķ���
	 */
	public int getGroundY(){
		return groundY;
	}
	
	/**
	 * ���õ���X����ķ���
	 */
	public void setGroundY(int groundY){
		this.groundY = groundY;
	}
	
	
	
}
