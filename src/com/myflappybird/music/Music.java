package com.myflappybird.music;

import sun.audio.*; // �� ��sun.audio ��
import java.io.*;

public class Music {

	/**
	 * ����������
	 */
	InputStream in ;
	
	/**
	 * AudioStream����
	 */
	AudioStream as ; 
	
	/**
	 * ���췽��
	 */
	public Music(String filename) throws IOException{
		//��һ�������ļ���Ϊ������
		in = new FileInputStream (filename);
		//��������������AudioStream����
		as = new AudioStream(in); 
	}
	
	/**
	 * ��������
	 */
	public void musicPlay(){ 
		//��AudioPlayer�еľ�̬��Աplayer���Ʋ���
		AudioPlayer.player.start(as); 
	}
	
	
}
