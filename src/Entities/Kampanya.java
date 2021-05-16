package Entities;

import Abstract.Entity;

public class Kampanya implements Entity{
	
	private String kampanyaAdi;
	private int id;
	
	public Kampanya() {
		
	}
	public Kampanya(String kampanyaAdi, int id) {
		super();
		this.kampanyaAdi = kampanyaAdi;
		this.id = id;
	}
	
	public String getKampanyaAdi() {
		return kampanyaAdi;
	}
	public void setKampanyaAdi(String kampanyaAdi) {
		this.kampanyaAdi = kampanyaAdi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
