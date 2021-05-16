package Entities;

import Abstract.Entity;

public class OyunSatisi implements Entity {
	private int id;
	private String oyunAdi;
	private int oyunFiyati;
	
	public OyunSatisi() {
		
	}
	
	public OyunSatisi(int id, String oyunAdi, int oyunFiyati) {
		super();
		this.id = id;
		this.oyunAdi = oyunAdi;
		this.oyunFiyati = oyunFiyati;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOyunAdi() {
		return oyunAdi;
	}

	public void setOyunAdi(String oyunAdi) {
		this.oyunAdi = oyunAdi;
	}

	public int getOyunFiyati() {
		return oyunFiyati;
	}

	public void setOyunFiyati(int oyunFiyati) {
		this.oyunFiyati = oyunFiyati;
	}
	
}
