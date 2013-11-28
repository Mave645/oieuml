package wbs.lotto.util;

import wbs.lotto.persistence.*;
import java.util.Date;

/*
 * liefert u.a methoden, um gültge records mit quoten, gebühren,....
 * zu einem gegebenen datum zu ermitteln
 */

public class LottoUtils {

    /*
     * wir liefern zu einem datum den zu diesem zeitpunkt gültigen record aus
     * der tabelle LottoEinsatz
     */

    public Lottoeinsatz getLottoeinsatzByDate(Date date) {
	LottoeinsatzDAO lottoeinsatzDAO = new LottoeinsatzDAO();
	return lottoeinsatzDAO.findAll().get(0);
    }

    /*
     * wir schreiben eine methode, die ermittelt, ob ein gegebener lottoschein
     * an einer ziehung, deren datum gegeben ist, teilnimmt.
     */

    public static boolean isLottoZiehungZugeordnet(Date ziehungsDatum,
	    Lottoschein lottoschein) {
	return true;
    }
}