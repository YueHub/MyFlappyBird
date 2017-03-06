package com.myflappybird.control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.myflappybird.dto.GameDto;

public class PlayerControl extends KeyAdapter{

	/**
	 * ���ݴ����
	 */
	GameDto dto;
	
	/**
	 * ��Ϸ������
	 */
	GameControl gamecontrol;
	
	/**
	 * ���췽��
	 */
	public PlayerControl(GameDto dto){
		this.dto = dto;
		gamecontrol = new GameControl(this.dto);
	}
	
	/**
	 * �¼�����
	 */
	public void keyPressed(KeyEvent e){
		switch(e.getKeyCode()){
		case KeyEvent.VK_SPACE:
		case KeyEvent.VK_UP:
			this.gamecontrol.birdUp();
			break;
		case KeyEvent.VK_ENTER:
			this.gamecontrol.pause();
			break;
		case KeyEvent.VK_F1:
			this.gamecontrol.gameStart();
			break;
		default:break;
		}	
	}
	
}
