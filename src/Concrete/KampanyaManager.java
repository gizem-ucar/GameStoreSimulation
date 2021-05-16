package Concrete;

import Abstract.KampanyaService;
import Entities.Kampanya;
import Entities.OyunSatisi;

public class KampanyaManager implements KampanyaService {

	@Override
	public void kampanayaDeleted(Kampanya kampanya) {
		System.out.println("Kampanya silindi");
		
	}

	@Override
	public void kampanyaUpdate(Kampanya kampanya) {
		System.out.println("Kampanya güncellendi");
		
	}

	@Override
	public boolean yeniKampanyaMi(OyunSatisi oyunSatisi) {
		if (oyunSatisi.getOyunFiyati()>=200) {
			System.out.println("Kampanya eklendi");
			   return true;
		}
		else {
			return false;
		}
	}

}
