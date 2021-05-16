package Concrete;

import Abstract.OyunSatisService;
import Entities.OyunSatisi;
import Entities.Oyuncu;

public class OyunSatisManager implements OyunSatisService{

	KampanyaManager kampanyaManager;
	
	public OyunSatisManager(KampanyaManager kampanyaManager) {
		this.kampanyaManager = kampanyaManager;
	}

	@Override
	public void oyunSatis(Oyuncu oyuncu, OyunSatisi oyunSatisi) {
		System.out.println(oyuncu.getAd()+" adli oyuncu oyun satin aldi.");
		
	}

}
