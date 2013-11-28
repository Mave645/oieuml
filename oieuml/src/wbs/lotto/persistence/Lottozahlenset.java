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

/**
 * Lottozahlenset entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "lottozahlenset", catalog = "lotto")
public class Lottozahlenset implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idLottoZahlenSet;
	private Lottoschein lottoschein;
	private Long lottoZahlen;

	// Constructors

	/** default constructor */
	public Lottozahlenset() {
	}

	/** full constructor */
	public Lottozahlenset(Lottoschein lottoschein, Long lottoZahlen) {
		this.lottoschein = lottoschein;
		this.lottoZahlen = lottoZahlen;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idLottoZahlenSet", unique = true, nullable = false)
	public Long getIdLottoZahlenSet() {
		return this.idLottoZahlenSet;
	}

	public void setIdLottoZahlenSet(Long idLottoZahlenSet) {
		this.idLottoZahlenSet = idLottoZahlenSet;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLottoSchein", nullable = false)
	public Lottoschein getLottoschein() {
		return this.lottoschein;
	}

	public void setLottoschein(Lottoschein lottoschein) {
		this.lottoschein = lottoschein;
	}

	@Column(name = "lottoZahlen", nullable = false)
	public Long getLottoZahlen() {
		return this.lottoZahlen;
	}

	public void setLottoZahlen(Long lottoZahlen) {
		this.lottoZahlen = lottoZahlen;
	}

}