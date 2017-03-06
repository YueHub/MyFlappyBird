package com.myflappybird.dto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.myflappybird.dao.GameData;
import com.myflappybird.img.Img;
import com.myflappybird.service.Bird;
import com.myflappybird.service.Ground;
import com.myflappybird.service.Pillars;
import com.myflappybird.service.ScoreBoard;

public class GameDto {
	
	/**
	 * С�����
	 */
	private Bird bird;
	
	/**
	 * �������
	 */
	private Ground ground;
	
	/**
	 * ����������
	 */
	private Pillars[] pillars;
	
	/**
	 * ��Ϸ�����ݶ���
	 */
	private GameData gamedata;
	
	/**
	 * ����������
	 */
	private ScoreBoard scoreboard; 

	/**
	 * ��Ϸ�Ƿ�ʼ
	 */
	private boolean gamestart;
	
	/**
	 * С���˶����ٶ�
	 */
	private double speed;
		
	/**
	 * С���Ƿ��Ѿ�����
	 */
	private boolean birdDead;

	/**
	 * ��Ϸ����
	 */
	private int score ;
	
	/**
	 * �Ƿ���ͣ
	 */
	private boolean pause;
	
	/**
	 * ��Ϸ�Ƿ����
	 */
	private boolean gameover;
	
	/**
	 * �Ƿ����¿�ʼ
	 */
	private boolean restart;
	
	/**
	 * ��ʼ��Ϸ�İ�ť
	 */
	private JButton btnStart;

	/**
	 * ���췽��
	 */
	public GameDto(){
		this.InitDto();
	}
	
	/**
	 * ��ʼ�����ݴ����
	 */
	public void InitDto(){
		//��ʼ����Ϸû�п�ʼ
		this.gamestart = false;
		//��ʼ��С��û����
		this.birdDead = false;
		//��ʼ����Ϸû����ͣ
		this.pause = false;
		//��ʼ����Ϸû�����¿�ʼ
		this.restart = false;
		//��ʼ����Ϸû�н���
		this.gameover = false;
		//��ʼ������Ϊ0
		this.score = 0;
		//�������ݶ���
		gamedata = new GameData(this);
		//����С�����
		bird = new Bird(this,100,250);
		//�����������
		ground = new Ground(this,0,498);
		//��������������
		scoreboard = new ScoreBoard(70,500);
		//�������������
		pillars = new Pillars[3];
		pillars[0] = new Pillars(this,550);
		pillars[1] = new Pillars(this,790);
		pillars[2] = new Pillars(this,1030);
		this.InitBtn();
	}

	/**
	 * ��ʼ����ť
	 */
	public void InitBtn(){	
		//������ť����
		this.btnStart = new JButton(Img.btnBegin);
		//���ð�ť�ı߿�͸��
		this.btnStart.setBorder(null);
		//�����ڲ�͸��
		this.btnStart.setContentAreaFilled (false);
		//���ð�ť��λ�úʹ�С
		this.btnStart.setBounds(56, 415, 238, 89);
		//��ť����¼�����	
		this.btnStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setGamestart(true);
			}
		});
		
	}
	
	/**
	 * �õ���ť����
	 * @return
	 */
	public JButton getBtnStart() {
		return btnStart;
	}

	/**
	 * ���ð�ť����
	 * @param btnStart
	 */
	public void setBtnStart(JButton btnStart) {
		this.btnStart = btnStart;
	}
	
	/**
	 * �õ�С�����
	 */
	public Bird getBird(){
		return bird;
	}
	
	/**
	 * �õ��������
	 */
	public Ground getGround(){
		return ground;
	}
	
	/**
	 * �õ��������������
	 * @return
	 */
	public Pillars[] getPillars(){
		return pillars;
	}
	
	/**
	 *�õ���Ϸ���ݶ��� 
	 * @return
	 */
	public GameData getGamedata() {
		return gamedata;
	}

	/**
	 * ������Ϸ���ݶ���
	 * @param gamedata
	 */
	public void setGamedata(GameData gamedata) {
		this.gamedata = gamedata;
	}
	
	/**
	 * �õ���Ϸ������������
	 * @return
	 */
	public ScoreBoard getScoreboard() {
		return scoreboard;
	}

	/**
	 * ������Ϸ������������
	 * @param scoreboard
	 */
	public void setScoreboard(ScoreBoard scoreboard) {
		this.scoreboard = scoreboard;
	}

	
	/**
	 * �õ���Ϸ�Ƿ�ʼ
	 */
	public boolean isGamestart() {
		return gamestart;
	}

	/**
	 * ������Ϸ�Ƿ�ʼ
	 */
	public void setGamestart(boolean gamestart) {
		this.gamestart = gamestart;
	}

	/**
	 * �õ�С����ٶ�
	 * @return
	 */
	public double getSpeed(){
		return speed;
	}
	
	/**
	 * ����С����ٶ�
	 * @param speed
	 */
	public void setSpeed(double speed){
		this.speed = speed;
	}
	
	/**
	 * �õ�С���Ƿ��Ѿ�����
	 */
	public boolean isBirdDead(){
		return birdDead;
	}
	
	/**
	 * ����С���Ƿ�����
	 */
	public void setBirdDead(boolean birdDead){
		this.birdDead = birdDead;
	}
	
	/**
	 * �õ���Ϸ����
	 */
	public int getScore() {
		return score;
	}

	/**
	 * ������Ϸ����
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * �õ���Ϸ�Ƿ���ͣ
	 */
	public boolean isPause() {
		return pause;
	}

	/**
	 * ������Ϸ�Ƿ���ͣ
	 */
	public void setPause(boolean puase) {
		this.pause = puase;
	}
	
	/**
	 * �õ���Ϸ�Ƿ����
	 */
	public boolean isGameover() {
		return gameover;
	}

	/**
	 * ������Ϸ�Ƿ����
	 */
	public void setGameover(boolean gameover) {
		this.gameover = gameover;
	}
	
	/**
	 * �õ���Ϸ�Ƿ����¿�ʼ
	 */
	public boolean isRestart() {
		return restart;
	}

	/**
	 * ������Ϸ�Ƿ����¿�ʼ
	 */
	public void setRestart(boolean restart) {
		this.restart = restart;
	}

}
