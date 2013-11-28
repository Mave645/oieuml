package wbs.lotto.test;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;

import wbs.lotto.persistence.EntityManagerHelper;
import wbs.lotto.persistence.Lottoschein;
import wbs.lotto.persistence.LottoscheinDAO;
import wbs.lotto.persistence.Lottozahlenset;

public class LottoscheinTest {

	
	@Test
	public void testSaveLottoSchein() {
		
		LottoscheinDAO lottoscheinDAO = new LottoscheinDAO();
		
		Lottoschein lottoschein = new Lottoschein();
		
		Date date = new Date();
		Timestamp timestamp = new Timestamp(date.getTime());
		
		int anzahlNachher;
		int anzahlVorher;
		
		lottoschein.setSpielScheinNummer(1234567);
		lottoschein.setAbgabeDatum(timestamp);
		lottoschein.setGluecksSpirale(true);
		lottoschein.setSpiel77(true);
		lottoschein.setSuper6(true);
		lottoschein.setZiehungsTage("MITTWOCH");
		lottoschein.setLaufZeit("EINE_WOCHE");
		
		Lottozahlenset set = new Lottozahlenset();
		set.setLottoZahlen(63L);  // 111111 -> 1 2 3 4 5 6
		
		
		anzahlVorher = lottoscheinDAO.findAll().size();
		
		EntityManagerHelper.beginTransaction();
		lottoscheinDAO.save(lottoschein);
		set.setLottoschein(lottoschein);
		lottoschein.getLottozahlensets().add(set);
		EntityManagerHelper.commit();
		
		anzahlNachher = lottoscheinDAO.findAll().size();
		assertEquals(1, anzahlNachher - anzahlVorher);
	}

}
