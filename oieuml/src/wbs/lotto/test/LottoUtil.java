package wbs.lotto.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import wbs.lotto.persistence.EntityManagerHelper;
import wbs.lotto.persistence.Lottogebuehren;
import wbs.lotto.persistence.LottogebuehrenDAO;
import wbs.lotto.persistence.Lottoschein;
import wbs.lotto.persistence.LottoscheinDAO;
import wbs.lotto.persistence.Lottozahlenset;
import wbs.lotto.persistence.Lottoziehung;
import wbs.lotto.persistence.LottoziehungDAO;
import wbs.lotto.persistence.Quotenspiel77;
import wbs.lotto.persistence.Quotenspiel77DAO;
import wbs.lotto.persistence.Quotensuper6;
import wbs.lotto.persistence.Quotensuper6DAO;
import wbs.lotto.persistence.Verteilungsschluessel6aus49;
import wbs.lotto.persistence.Verteilungsschluessel6aus49DAO;

public class LottoUtil {

	public static void populateLottoScheine(Date date) {

		LottoscheinDAO lottoscheinDAO = new LottoscheinDAO();

		Lottoschein lottoschein;

		Lottozahlenset lottozahlenset;

		Timestamp timestamp = new Timestamp(date.getTime());

		Set<Integer> zahlen = new HashSet<>();
		int zahl;
		long setZahlen;

		Random rnd = new Random();

		EntityManagerHelper.beginTransaction();

		for (int anzahl = 1; anzahl <= 100; anzahl++) {		    

			lottoschein = new Lottoschein();
			lottoschein.setSpielScheinNummer(1000000 + anzahl);
			lottoschein.setAbgabeDatum(timestamp);
			lottoschein.setGluecksSpirale(rnd.nextBoolean());
			lottoschein.setSpiel77(rnd.nextBoolean());
			lottoschein.setSuper6(rnd.nextBoolean());
			lottoschein.setZiehungsTage("MITTWOCH");
			lottoschein.setLaufZeit("EINE_WOCHE");

			lottoscheinDAO.save(lottoschein);

			for (int j = rnd.nextInt(12) + 1; j >= 0; j--) {
				zahlen.clear();
				setZahlen = 0;
				while (zahlen.size() < 6) {
					zahl = rnd.nextInt(49) + 1;
					zahlen.add(zahl);
					setZahlen |= (1L << zahl);
				}
				lottozahlenset = new Lottozahlenset();
				lottozahlenset.setLottoZahlen((long) setZahlen);
				lottozahlenset.setLottoschein(lottoschein);
				lottoschein.getLottozahlensets().add(lottozahlenset);
			}
		}
		EntityManagerHelper.commit();

	}

	// TODO superzahl genau checken
	public static void populateLottoZiehung(Date date) {

		LottoziehungDAO lottoziehungDAO = new LottoziehungDAO();
		Set<Integer> zahlen = new HashSet<>();
		Random rnd = new Random();
		Timestamp ziehungsDatum = new Timestamp(date.getTime());

		int spiel77 = 1000000 + rnd.nextInt(9000000);
		int gluecksSpirale = 1000000 + rnd.nextInt(9000000);
		int super6 = 100000 + rnd.nextInt(900000);
		int superZahl;

		int zahl;
		long gewinnZahlen = 0;

		while (zahlen.size() < 6) {
			zahl = rnd.nextInt(49) + 1;
			zahlen.add(zahl);
			gewinnZahlen |= (1L << zahl);
		}

		// TODO  regeln fuer superzahl genau pruefen
		do {
			superZahl = rnd.nextInt(49) + 1;
		} while (zahlen.contains(superZahl));

		EntityManagerHelper.beginTransaction();

		Lottoziehung lottoziehung = new Lottoziehung();
		lottoziehung.setGewinnZahlen(gewinnZahlen);
		lottoziehung.setSpiel77(spiel77);
		lottoziehung.setSuper6(super6);
		lottoziehung.setSuperZahl(superZahl);
		lottoziehung.setZiehungsDatum(ziehungsDatum);
		// new
		lottoziehung.setJackpot6aus49(0.0);
		lottoziehung.setJackpotSpiel77(0.0);
		lottoziehung.setGluecksSpirale(gluecksSpirale);

		lottoziehungDAO.save(lottoziehung);

		EntityManagerHelper.commit();

	}

	public static void populateLottoGebuehren(Date gueltigAb, double gebuehr) {
		LottogebuehrenDAO gebuehrenDAO = new LottogebuehrenDAO();
		Lottogebuehren gebuehren = new Lottogebuehren();
		Timestamp timestamp = new Timestamp(gueltigAb.getTime());

		gebuehren.setGebuehr(gebuehr);
		gebuehren.setGueltigAb(timestamp);

		EntityManagerHelper.beginTransaction();

		gebuehrenDAO.save(gebuehren);

		EntityManagerHelper.commit();
	}

	// TODO regeln genau ermitteln
	public static void populateVerteilungsSchluessel6aus49(Date gueltigAb) {
		Verteilungsschluessel6aus49DAO verteilungsschluessel6aus49dao = new Verteilungsschluessel6aus49DAO();
		Verteilungsschluessel6aus49 verteilungsschluessel6aus49 = new Verteilungsschluessel6aus49();
		Timestamp timestamp = new Timestamp(gueltigAb.getTime());

		verteilungsschluessel6aus49.setGueltigAb(timestamp);

		verteilungsschluessel6aus49.setAusschuettungsQuote(0.5);
		verteilungsschluessel6aus49.setKlasse1(12.8);
		verteilungsschluessel6aus49.setKlasse2(10.0);
		verteilungsschluessel6aus49.setKlasse3(5.0);
		verteilungsschluessel6aus49.setKlasse4(15.0);
		verteilungsschluessel6aus49.setKlasse5(5.0);
		verteilungsschluessel6aus49.setKlasse6(10.0);
		verteilungsschluessel6aus49.setKlasse7(10.0);
		verteilungsschluessel6aus49.setKlasse8(45.0);
		verteilungsschluessel6aus49.setKlasse9(5.0);

		EntityManagerHelper.beginTransaction();

		verteilungsschluessel6aus49dao.save(verteilungsschluessel6aus49);

		EntityManagerHelper.commit();
	}

	// TODO genaue regeln ermitteln
	public static void populateQuotenSpiel77(Date gueltigAb) {
		Quotenspiel77DAO quotenspiel77dao = new Quotenspiel77DAO();
		Quotenspiel77 quotenspiel77 = new Quotenspiel77();
		Timestamp timestamp = new Timestamp(gueltigAb.getTime());
		quotenspiel77.setGueltigAb(timestamp);
		quotenspiel77.setKlasse1(0.0);
		quotenspiel77.setKlasse2(77777.0);
		quotenspiel77.setKlasse3(7777.0);
		quotenspiel77.setKlasse4(777.0);
		quotenspiel77.setKlasse5(77.0);
		quotenspiel77.setKlasse6(17.0);
		quotenspiel77.setKlasse7(5.0);

		EntityManagerHelper.beginTransaction();

		quotenspiel77dao.save(quotenspiel77);

		EntityManagerHelper.commit();
	}

	public static void populateQuotenSuper6(Date gueltigAb) {
		Quotensuper6DAO quotensuper6dao = new Quotensuper6DAO();
		Quotensuper6 quotensuper6 = new Quotensuper6();
		Timestamp timestamp = new Timestamp(gueltigAb.getTime());

		quotensuper6.setGueltigAb(timestamp);

		quotensuper6.setKlasse1(100000.0);
		quotensuper6.setKlasse2(6666.0);
		quotensuper6.setKlasse3(666.0);
		quotensuper6.setKlasse4(66.0);
		quotensuper6.setKlasse5(6.0);
		quotensuper6.setKlasse6(2.5);

		EntityManagerHelper.beginTransaction();

		quotensuper6dao.save(quotensuper6);

		EntityManagerHelper.commit();
	}

	public static void populateLottoDatabase() {
		Date date = new Date();
		populateLottoZiehung(date);
		populateLottoScheine(date);
		populateLottoGebuehren(date, 2.0);
		populateQuotenSpiel77(date);
		populateQuotenSuper6(date);
		populateVerteilungsSchluessel6aus49(date);

	}

}
