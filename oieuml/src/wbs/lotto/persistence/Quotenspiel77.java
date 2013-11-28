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
 * Quotenspiel77 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "quotenspiel77", catalog = "lotto", uniqueConstraints = @UniqueConstraint(columnNames = "gueltigAb"))
public class Quotenspiel77 implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idQuotenSpiel77;
	private Timestamp gueltigAb;
	private Double klasse1;
	private Double klasse2;
	private Double klasse3;
	private Double klasse4;
	private Double klasse5;
	private Double klasse6;
	private Double klasse7;

	// Constructors

	/** default constructor */
	public Quotenspiel77() {
	}

	/** full constructor */
	public Quotenspiel77(Timestamp gueltigAb, Double klasse1, Double klasse2,
			Double klasse3, Double klasse4, Double klasse5, Double klasse6,
			Double klasse7) {
		this.gueltigAb = gueltigAb;
		this.klasse1 = klasse1;
		this.klasse2 = klasse2;
		this.klasse3 = klasse3;
		this.klasse4 = klasse4;
		this.klasse5 = klasse5;
		this.klasse6 = klasse6;
		this.klasse7 = klasse7;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idQuotenSpiel77", unique = true, nullable = false)
	public Long getIdQuotenSpiel77() {
		return this.idQuotenSpiel77;
	}

	public void setIdQuotenSpiel77(Long idQuotenSpiel77) {
		this.idQuotenSpiel77 = idQuotenSpiel77;
	}

	@Column(name = "gueltigAb", unique = true, nullable = false, length = 19)
	public Timestamp getGueltigAb() {
		return this.gueltigAb;
	}

	public void setGueltigAb(Timestamp gueltigAb) {
		this.gueltigAb = gueltigAb;
	}

	@Column(name = "klasse1", nullable = false, precision = 10)
	public Double getKlasse1() {
		return this.klasse1;
	}

	public void setKlasse1(Double klasse1) {
		this.klasse1 = klasse1;
	}

	@Column(name = "klasse2", nullable = false, precision = 10)
	public Double getKlasse2() {
		return this.klasse2;
	}

	public void setKlasse2(Double klasse2) {
		this.klasse2 = klasse2;
	}

	@Column(name = "klasse3", nullable = false, precision = 10)
	public Double getKlasse3() {
		return this.klasse3;
	}

	public void setKlasse3(Double klasse3) {
		this.klasse3 = klasse3;
	}

	@Column(name = "klasse4", nullable = false, precision = 10)
	public Double getKlasse4() {
		return this.klasse4;
	}

	public void setKlasse4(Double klasse4) {
		this.klasse4 = klasse4;
	}

	@Column(name = "klasse5", nullable = false, precision = 10)
	public Double getKlasse5() {
		return this.klasse5;
	}

	public void setKlasse5(Double klasse5) {
		this.klasse5 = klasse5;
	}

	@Column(name = "klasse6", nullable = false, precision = 10)
	public Double getKlasse6() {
		return this.klasse6;
	}

	public void setKlasse6(Double klasse6) {
		this.klasse6 = klasse6;
	}

	@Column(name = "klasse7", nullable = false, precision = 10)
	public Double getKlasse7() {
		return this.klasse7;
	}

	public void setKlasse7(Double klasse7) {
		this.klasse7 = klasse7;
	}

}