package com.myflappybird.control;

import com.myflappybird.dto.GameDto;

public class GameControl {
	
	/**
	 * ���ݴ����
	 */
	GameDto dto;
	
	/**
	 * ���췽��
	 */
	public GameControl(GameDto dto){
		this.dto = dto;
	}
	
	/**
	 * ��Ϸ��ʼ
	 */
	public void gameStart(){
		this.dto.setGamestart(true);
	}
	
	/**
	 * �����߼���С�����Ϸɵķ���
	 */
	public void birdUp(){
		if(this.dto.isBirdDead()){
			return ;
		}
		this.dto.setSpeed(-22.3);
		this.dto.getBird().flyMusic();
	}

	/**
	 * ������Ϸ��ͣΪtrue
	 */
	public void pause() {
		this.dto.setPause(!this.dto.isPause());
	}
}
