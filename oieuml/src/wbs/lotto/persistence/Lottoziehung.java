package wbs.lotto.persistence;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Lottoziehung entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "lottoziehung", catalog = "lotto", uniqueConstraints = @UniqueConstraint(columnNames = "ziehungsDatum"))
public class Lottoziehung implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idLottoZiehung;
	private Timestamp ziehungsDatum;
	private Integer gluecksSpirale;
	private Integer spiel77;
	private Integer super6;
	private Integer superZahl;
	private Long gewinnZahlen;
	private Double jackpot6aus49;
	private Double jackpotSpiel77;
	private Set<Gewinnespiel77> gewinnespiel77s = new HashSet<Gewinnespiel77>(0);
	private Set<Quoten6aus49> quoten6aus49s = new HashSet<Quoten6aus49>(0);
	private Set<Gewinnesuper6> gewinnesuper6s = new HashSet<Gewinnesuper6>(0);

	// Constructors

	/** default constructor */
	public Lottoziehung() {
	}

	/** minimal constructor */
	public Lottoziehung(Timestamp ziehungsDatum, Integer gluecksSpirale,
			Integer spiel77, Integer super6, Integer superZahl,
			Long gewinnZahlen, Double jackpot6aus49, Double jackpotSpiel77) {
		this.ziehungsDatum = ziehungsDatum;
		this.gluecksSpirale = gluecksSpirale;
		this.spiel77 = spiel77;
		this.super6 = super6;
		this.superZahl = superZahl;
		this.gewinnZahlen = gewinnZahlen;
		this.jackpot6aus49 = jackpot6aus49;
		this.jackpotSpiel77 = jackpotSpiel77;
	}

	/** full constructor */
	public Lottoziehung(Timestamp ziehungsDatum, Integer gluecksSpirale,
			Integer spiel77, Integer super6, Integer superZahl,
			Long gewinnZahlen, Double jackpot6aus49, Double jackpotSpiel77,
			Set<Gewinnespiel77> gewinnespiel77s,
			Set<Quoten6aus49> quoten6aus49s, Set<Gewinnesuper6> gewinnesuper6s) {
		this.ziehungsDatum = ziehungsDatum;
		this.gluecksSpirale = gluecksSpirale;
		this.spiel77 = spiel77;
		this.super6 = super6;
		this.superZahl = superZahl;
		this.gewinnZahlen = gewinnZahlen;
		this.jackpot6aus49 = jackpot6aus49;
		this.jackpotSpiel77 = jackpotSpiel77;
		this.gewinnespiel77s = gewinnespiel77s;
		this.quoten6aus49s = quoten6aus49s;
		this.gewinnesuper6s = gewinnesuper6s;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idLottoZiehung", unique = true, nullable = false)
	public Long getIdLottoZiehung() {
		return this.idLottoZiehung;
	}

	public void setIdLottoZiehung(Long idLottoZiehung) {
		this.idLottoZiehung = idLottoZiehung;
	}

	@Column(name = "ziehungsDatum", unique = true, nullable = false, length = 19)
	public Timestamp getZiehungsDatum() {
		return this.ziehungsDatum;
	}

	public void setZiehungsDatum(Timestamp ziehungsDatum) {
		this.ziehungsDatum = ziehungsDatum;
	}

	@Column(name = "gluecksSpirale", nullable = false)
	public Integer getGluecksSpirale() {
		return this.gluecksSpirale;
	}

	public void setGluecksSpirale(Integer gluecksSpirale) {
		this.gluecksSpirale = gluecksSpirale;
	}

	@Column(name = "spiel77", nullable = false)
	public Integer getSpiel77() {
		return this.spiel77;
	}

	public void setSpiel77(Integer spiel77) {
		this.spiel77 = spiel77;
	}

	@Column(name = "super6", nullable = false)
	public Integer getSuper6() {
		return this.super6;
	}

	public void setSuper6(Integer super6) {
		this.super6 = super6;
	}

	@Column(name = "superZahl", nullable = false)
	public Integer getSuperZahl() {
		return this.superZahl;
	}

	public void setSuperZahl(Integer superZahl) {
		this.superZahl = superZahl;
	}

	@Column(name = "gewinnZahlen", nullable = false)
	public Long getGewinnZahlen() {
		return this.gewinnZahlen;
	}

	public void setGewinnZahlen(Long gewinnZahlen) {
		this.gewinnZahlen = gewinnZahlen;
	}

	@Column(name = "jackpot6Aus49", nullable = false, precision = 12)
	public Double getJackpot6aus49() {
		return this.jackpot6aus49;
	}

	public void setJackpot6aus49(Double jackpot6aus49) {
		this.jackpot6aus49 = jackpot6aus49;
	}

	@Column(name = "jackpotSpiel77", nullable = false, precision = 12)
	public Double getJackpotSpiel77() {
		return this.jackpotSpiel77;
	}

	public void setJackpotSpiel77(Double jackpotSpiel77) {
		this.jackpotSpiel77 = jackpotSpiel77;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "lottoziehung")
	public Set<Gewinnespiel77> getGewinnespiel77s() {
		return this.gewinnespiel77s;
	}

	public void setGewinnespiel77s(Set<Gewinnespiel77> gewinnespiel77s) {
		this.gewinnespiel77s = gewinnespiel77s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "lottoziehung")
	public Set<Quoten6aus49> getQuoten6aus49s() {
		return this.quoten6aus49s;
	}

	public void setQuoten6aus49s(Set<Quoten6aus49> quoten6aus49s) {
		this.quoten6aus49s = quoten6aus49s;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "lottoziehung")
	public Set<Gewinnesuper6> getGewinnesuper6s() {
		return this.gewinnesuper6s;
	}

	public void setGewinnesuper6s(Set<Gewinnesuper6> gewinnesuper6s) {
		this.gewinnesuper6s = gewinnesuper6s;
	}

}