package Concrete;

import Abstract.KullaniciDogrulamaService;
import Abstract.OyuncuService;
import Entities.Oyuncu;

public class OyuncuManager implements OyuncuService {

	KullaniciDogrulamaService dogrulamaService;
	
	
	public OyuncuManager(KullaniciDogrulamaService dogrulamaService) {
		this.dogrulamaService = dogrulamaService;
	}

	@Override
	public void oyuncuAdd(Oyuncu oyuncu) {
		if (dogrulamaService.dogrulama(oyuncu)) {
			System.out.println(oyuncu.getAd()+" adli oyuncu eklendi.");
			
		}
		else {
			System.out.println("Dogrulama basarisiz.");
			
		}
		
	}

	@Override
	public void oyuncuDeleted(Oyuncu oyuncu) {
		System.out.println(oyuncu.getAd()+" adli oyuncu silindi.");
	}

	@Override
	public void oyuncuUpdate(Oyuncu oyuncu) {
		System.out.println(oyuncu.getAd()+" adli oyuncu güncellendi.");
	}

}
