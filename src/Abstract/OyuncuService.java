package Abstract;

import Entities.Oyuncu;

public interface OyuncuService {
	void oyuncuAdd(Oyuncu oyuncu);
	void oyuncuDeleted(Oyuncu oyuncu);
	void oyuncuUpdate(Oyuncu oyuncu);
}
