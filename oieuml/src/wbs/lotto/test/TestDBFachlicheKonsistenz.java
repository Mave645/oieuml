//..begin "File Description"
/*--------------------------------------------------------------------------------*
 Filename:  TestDBFachlicheKonsistenz.java
 Tool:      objectiF, 
 *--------------------------------------------------------------------------------*/
//..end "File Description"

package wbs.lotto.test;

import static org.junit.Assert.*;

import javax.validation.constraints.AssertTrue;

import org.junit.Test;

import wbs.lotto.persistence.*;

//..begin "Imports"

//..end "Imports"

public class TestDBFachlicheKonsistenz {

    @Test
    public void testDBFachlicheKonsistenz() {
	/*
	 * sind in allen kästchen aller lottoscheine auch wirklich sechs
	 * verschiedene zahlen zwischen 1 und 49 ?
	 */
	LottozahlensetDAO lottozahlensetDAO = new LottozahlensetDAO();
	long upperBound = (1L << 50);
	boolean hasNurKaestchenOk = true;
	long zahlen;
	for (Lottozahlenset lottozahlenset : lottozahlensetDAO.findAll()) {
	    zahlen = lottozahlenset.getLottoZahlen();
	    hasNurKaestchenOk = (Long.bitCount(zahlen) == 6)
		    && zahlen < upperBound && (1L & zahlen) == 0 && zahlen > 0;
	    if (!hasNurKaestchenOk) {
		break;
	    }
	}
	assertTrue(hasNurKaestchenOk);
    }
}