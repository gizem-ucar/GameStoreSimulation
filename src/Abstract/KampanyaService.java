package Abstract;

import Entities.Kampanya;
import Entities.OyunSatisi;

public interface KampanyaService {

	void kampanayaDeleted(Kampanya kampanya);
	void kampanyaUpdate(Kampanya kampanya);
	boolean yeniKampanyaMi(OyunSatisi oyunSatisi);
}
