package Concrete;

import Abstract.KullaniciDogrulamaService;
import Entities.Oyuncu;

public class KullaniciDogrulamaManager implements KullaniciDogrulamaService {

	@Override
	public boolean dogrulama(Oyuncu oyuncu) {
		if (oyuncu.getDogumYili()==2000 && oyuncu.getSoyad()=="Ucar" && oyuncu.getAd()=="Gizem" && oyuncu.getTcNo()==12345678) {
			return true;
		} else {
			return false;
		}
		
	}

}
