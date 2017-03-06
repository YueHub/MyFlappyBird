package com.myflappybird.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.crypto.Data;
import com.myflappybird.dto.GameDto;

public class GameData implements Data{

	/**
	 * ���ݴ����
	 */
	GameDto dto;
	
	/**
	 * ����������
	 */
	DataInputStream is;
	
	/**
	 * ���������
	 */
	DataOutputStream os;
	
	/**
	 * ��ʷ��߷�
	 */
	private static int MaxScore;
	
	/**
	 * ���췽��
	 * @param dto
	 */
	public GameData(GameDto dto){
		MaxScore = 0;
		this.dto = dto;
	}
	
	/**
	 * �洢���ݵķ���
	 */
	public void saveData(){
		if(this.dto.isGameover()){
			try {
				os = new DataOutputStream(new FileOutputStream("save/maxScore.bat"));
				os.writeInt(MaxScore);
				is = new DataInputStream(new FileInputStream("save/maxScore.bat"));
				if(this.dto.getScore() > is.read()){
					MaxScore = this.dto.getScore();
				}
				else{
					MaxScore = is.read();
				}
				System.out.println("��ʷ��߷�Ϊ"+is.read());
				
				os.close();
				is.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * ������߷ֵķ���
	 */
	public void calcMaxScore(){
		try {
			is = new DataInputStream(new FileInputStream("save/maxScore.bat"));
			if(MaxScore > is.readInt()){
				
			}
			else{
				MaxScore = is.readInt();
			}
			
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
