package wbs.lotto.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Quoten6aus49 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "quoten6aus49", catalog = "lotto", uniqueConstraints = @UniqueConstraint(columnNames = {
		"gewinnKlasse", "idLottoZiehung" }))
public class Quoten6aus49 implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idQuoten6aus49;
	private Lottoziehung lottoziehung;
	private Integer gewinnKlasse;
	private Integer gewinne;
	private Double quoten;

	// Constructors

	/** default constructor */
	public Quoten6aus49() {
	}

	/** full constructor */
	public Quoten6aus49(Lottoziehung lottoziehung, Integer gewinnKlasse,
			Integer gewinne, Double quoten) {
		this.lottoziehung = lottoziehung;
		this.gewinnKlasse = gewinnKlasse;
		this.gewinne = gewinne;
		this.quoten = quoten;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idQuoten6Aus49", unique = true, nullable = false)
	public Long getIdQuoten6aus49() {
		return this.idQuoten6aus49;
	}

	public void setIdQuoten6aus49(Long idQuoten6aus49) {
		this.idQuoten6aus49 = idQuoten6aus49;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLottoZiehung", nullable = false)
	public Lottoziehung getLottoziehung() {
		return this.lottoziehung;
	}

	public void setLottoziehung(Lottoziehung lottoziehung) {
		this.lottoziehung = lottoziehung;
	}

	@Column(name = "gewinnKlasse", nullable = false)
	public Integer getGewinnKlasse() {
		return this.gewinnKlasse;
	}

	public void setGewinnKlasse(Integer gewinnKlasse) {
		this.gewinnKlasse = gewinnKlasse;
	}

	@Column(name = "gewinne", nullable = false)
	public Integer getGewinne() {
		return this.gewinne;
	}

	public void setGewinne(Integer gewinne) {
		this.gewinne = gewinne;
	}

	@Column(name = "quoten", nullable = false)
	public Double getQuoten() {
		return this.quoten;
	}

	public void setQuoten(Double quoten) {
		this.quoten = quoten;
	}

}