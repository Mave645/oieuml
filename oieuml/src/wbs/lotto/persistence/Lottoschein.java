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

/**
 * Lottoschein entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "lottoschein", catalog = "lotto")
public class Lottoschein implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idLottoSchein;
	private Boolean super6;
	private Integer spielScheinNummer;
	private Timestamp abgabeDatum;
	private Boolean spiel77;
	private Boolean gluecksSpirale;
	private String ziehungsTage;
	private String laufZeit;
	private Set<Lottozahlenset> lottozahlensets = new HashSet<Lottozahlenset>(0);

	// Constructors

	/** default constructor */
	public Lottoschein() {
	}

	/** minimal constructor */
	public Lottoschein(Boolean super6, Integer spielScheinNummer,
			Timestamp abgabeDatum, Boolean spiel77, Boolean gluecksSpirale,
			String ziehungsTage, String laufZeit) {
		this.super6 = super6;
		this.spielScheinNummer = spielScheinNummer;
		this.abgabeDatum = abgabeDatum;
		this.spiel77 = spiel77;
		this.gluecksSpirale = gluecksSpirale;
		this.ziehungsTage = ziehungsTage;
		this.laufZeit = laufZeit;
	}

	/** full constructor */
	public Lottoschein(Boolean super6, Integer spielScheinNummer,
			Timestamp abgabeDatum, Boolean spiel77, Boolean gluecksSpirale,
			String ziehungsTage, String laufZeit,
			Set<Lottozahlenset> lottozahlensets) {
		this.super6 = super6;
		this.spielScheinNummer = spielScheinNummer;
		this.abgabeDatum = abgabeDatum;
		this.spiel77 = spiel77;
		this.gluecksSpirale = gluecksSpirale;
		this.ziehungsTage = ziehungsTage;
		this.laufZeit = laufZeit;
		this.lottozahlensets = lottozahlensets;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idLottoSchein", unique = true, nullable = false)
	public Long getIdLottoSchein() {
		return this.idLottoSchein;
	}

	public void setIdLottoSchein(Long idLottoSchein) {
		this.idLottoSchein = idLottoSchein;
	}

	@Column(name = "super6", nullable = false)
	public Boolean getSuper6() {
		return this.super6;
	}

	public void setSuper6(Boolean super6) {
		this.super6 = super6;
	}

	@Column(name = "spielScheinNummer", nullable = false)
	public Integer getSpielScheinNummer() {
		return this.spielScheinNummer;
	}

	public void setSpielScheinNummer(Integer spielScheinNummer) {
		this.spielScheinNummer = spielScheinNummer;
	}

	@Column(name = "abgabeDatum", nullable = false, length = 19)
	public Timestamp getAbgabeDatum() {
		return this.abgabeDatum;
	}

	public void setAbgabeDatum(Timestamp abgabeDatum) {
		this.abgabeDatum = abgabeDatum;
	}

	@Column(name = "spiel77", nullable = false)
	public Boolean getSpiel77() {
		return this.spiel77;
	}

	public void setSpiel77(Boolean spiel77) {
		this.spiel77 = spiel77;
	}

	@Column(name = "gluecksSpirale", nullable = false)
	public Boolean getGluecksSpirale() {
		return this.gluecksSpirale;
	}

	public void setGluecksSpirale(Boolean gluecksSpirale) {
		this.gluecksSpirale = gluecksSpirale;
	}

	@Column(name = "ziehungsTage", nullable = false, length = 16)
	public String getZiehungsTage() {
		return this.ziehungsTage;
	}

	public void setZiehungsTage(String ziehungsTage) {
		this.ziehungsTage = ziehungsTage;
	}

	@Column(name = "laufZeit", nullable = false, length = 12)
	public String getLaufZeit() {
		return this.laufZeit;
	}

	public void setLaufZeit(String laufZeit) {
		this.laufZeit = laufZeit;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "lottoschein")
	public Set<Lottozahlenset> getLottozahlensets() {
		return this.lottozahlensets;
	}

	public void setLottozahlensets(Set<Lottozahlenset> lottozahlensets) {
		this.lottozahlensets = lottozahlensets;
	}

}