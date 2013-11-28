package wbs.lotto.persistence;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Lottoeinsatz entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "lottoeinsatz", catalog = "lotto", uniqueConstraints = @UniqueConstraint(columnNames = "gueltigAb"))
public class Lottoeinsatz implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idLottoEinsatz;
	private Timestamp gueltigAb;
	private Double einsatzProKaestchen;
	private Double einsatzSuper6;
	private Double einsatzSpiel77;
	private Double einsatzGluecksSpirale;

	// Constructors

	/** default constructor */
	public Lottoeinsatz() {
	}

	/** full constructor */
	public Lottoeinsatz(Timestamp gueltigAb, Double einsatzProKaestchen,
			Double einsatzSuper6, Double einsatzSpiel77,
			Double einsatzGluecksSpirale) {
		this.gueltigAb = gueltigAb;
		this.einsatzProKaestchen = einsatzProKaestchen;
		this.einsatzSuper6 = einsatzSuper6;
		this.einsatzSpiel77 = einsatzSpiel77;
		this.einsatzGluecksSpirale = einsatzGluecksSpirale;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idLottoEinsatz", unique = true, nullable = false)
	public Long getIdLottoEinsatz() {
		return this.idLottoEinsatz;
	}

	public void setIdLottoEinsatz(Long idLottoEinsatz) {
		this.idLottoEinsatz = idLottoEinsatz;
	}

	@Column(name = "gueltigAb", unique = true, nullable = false, length = 19)
	public Timestamp getGueltigAb() {
		return this.gueltigAb;
	}

	public void setGueltigAb(Timestamp gueltigAb) {
		this.gueltigAb = gueltigAb;
	}

	@Column(name = "einsatzProKaestchen", nullable = false, precision = 6)
	public Double getEinsatzProKaestchen() {
		return this.einsatzProKaestchen;
	}

	public void setEinsatzProKaestchen(Double einsatzProKaestchen) {
		this.einsatzProKaestchen = einsatzProKaestchen;
	}

	@Column(name = "einsatzSuper6", nullable = false, precision = 6)
	public Double getEinsatzSuper6() {
		return this.einsatzSuper6;
	}

	public void setEinsatzSuper6(Double einsatzSuper6) {
		this.einsatzSuper6 = einsatzSuper6;
	}

	@Column(name = "einsatzSpiel77", nullable = false, precision = 6)
	public Double getEinsatzSpiel77() {
		return this.einsatzSpiel77;
	}

	public void setEinsatzSpiel77(Double einsatzSpiel77) {
		this.einsatzSpiel77 = einsatzSpiel77;
	}

	@Column(name = "einsatzGluecksSpirale", nullable = false, precision = 6)
	public Double getEinsatzGluecksSpirale() {
		return this.einsatzGluecksSpirale;
	}

	public void setEinsatzGluecksSpirale(Double einsatzGluecksSpirale) {
		this.einsatzGluecksSpirale = einsatzGluecksSpirale;
	}

}