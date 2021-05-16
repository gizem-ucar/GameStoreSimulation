package Entities;

import Abstract.Entity;

public class Oyuncu implements Entity{

	private int tcNo;
	private String ad;
	private String soyad;
	private int dogumYili;
	
	public Oyuncu() {
		
	}
	public Oyuncu(int tcNo, String ad, String soyad, int dogumYili) {
		super();
		this.tcNo = tcNo;
		this.ad = ad;
		this.soyad = soyad;
		this.dogumYili = dogumYili;
	}

	public int getTcNo() {
		return tcNo;
	}

	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getDogumYili() {
		return dogumYili;
	}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	
	
}
