import Concrete.KampanyaManager;
import Concrete.KullaniciDogrulamaManager;
import Concrete.OyunSatisManager;
import Concrete.OyuncuManager;
import Entities.OyunSatisi;
import Entities.Oyuncu;

public class Main { 

	public static void main(String[] args) {

		OyuncuManager oyuncuManager = new OyuncuManager(new KullaniciDogrulamaManager());
		Oyuncu oyuncu=new Oyuncu();
		oyuncu.setAd("Gizem");
		oyuncu.setSoyad("Ucar");
		oyuncu.setDogumYili(2000);
		oyuncu.setTcNo(12345678);
		
		oyuncuManager.oyuncuAdd(oyuncu);
		
		OyunSatisManager oyunSatisManager = new OyunSatisManager(new KampanyaManager());
		OyunSatisi oyunSatisi = new OyunSatisi();
		oyunSatisi.setOyunFiyati(345);
		oyunSatisManager.oyunSatis(oyuncu, oyunSatisi);
		
		KampanyaManager kampanyaManager=new KampanyaManager();
		kampanyaManager.yeniKampanyaMi(oyunSatisi);
	}

}
