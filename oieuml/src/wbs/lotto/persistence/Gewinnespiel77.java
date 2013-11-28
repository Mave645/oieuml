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
 * Gewinnespiel77 entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="gewinnespiel77"
    ,catalog="lotto"
)

public class Gewinnespiel77  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idGewinneSpiel77;
     private Lottoziehung lottoziehung;
     private Integer klasse1gewinne;
     private Integer klasse2gewinne;
     private Integer klasse3gewinne;
     private Integer klasse4gewinne;
     private Integer klasse5gewinne;
     private Integer klasse6gewinne;
     private Integer klasse7gewinne;


    // Constructors

    /** default constructor */
    public Gewinnespiel77() {
    }

    
    /** full constructor */
    public Gewinnespiel77(Lottoziehung lottoziehung, Integer klasse1gewinne, Integer klasse2gewinne, Integer klasse3gewinne, Integer klasse4gewinne, Integer klasse5gewinne, Integer klasse6gewinne, Integer klasse7gewinne) {
        this.lottoziehung = lottoziehung;
        this.klasse1gewinne = klasse1gewinne;
        this.klasse2gewinne = klasse2gewinne;
        this.klasse3gewinne = klasse3gewinne;
        this.klasse4gewinne = klasse4gewinne;
        this.klasse5gewinne = klasse5gewinne;
        this.klasse6gewinne = klasse6gewinne;
        this.klasse7gewinne = klasse7gewinne;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idGewinneSpiel77", unique=true, nullable=false)

    public Long getIdGewinneSpiel77() {
        return this.idGewinneSpiel77;
    }
    
    public void setIdGewinneSpiel77(Long idGewinneSpiel77) {
        this.idGewinneSpiel77 = idGewinneSpiel77;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="idLottoZiehung", nullable=false)

    public Lottoziehung getLottoziehung() {
        return this.lottoziehung;
    }
    
    public void setLottoziehung(Lottoziehung lottoziehung) {
        this.lottoziehung = lottoziehung;
    }
    
    @Column(name="klasse1Gewinne", nullable=false)

    public Integer getKlasse1gewinne() {
        return this.klasse1gewinne;
    }
    
    public void setKlasse1gewinne(Integer klasse1gewinne) {
        this.klasse1gewinne = klasse1gewinne;
    }
    
    @Column(name="klasse2Gewinne", nullable=false)

    public Integer getKlasse2gewinne() {
        return this.klasse2gewinne;
    }
    
    public void setKlasse2gewinne(Integer klasse2gewinne) {
        this.klasse2gewinne = klasse2gewinne;
    }
    
    @Column(name="klasse3Gewinne", nullable=false)

    public Integer getKlasse3gewinne() {
        return this.klasse3gewinne;
    }
    
    public void setKlasse3gewinne(Integer klasse3gewinne) {
        this.klasse3gewinne = klasse3gewinne;
    }
    
    @Column(name="klasse4Gewinne", nullable=false)

    public Integer getKlasse4gewinne() {
        return this.klasse4gewinne;
    }
    
    public void setKlasse4gewinne(Integer klasse4gewinne) {
        this.klasse4gewinne = klasse4gewinne;
    }
    
    @Column(name="klasse5Gewinne", nullable=false)

    public Integer getKlasse5gewinne() {
        return this.klasse5gewinne;
    }
    
    public void setKlasse5gewinne(Integer klasse5gewinne) {
        this.klasse5gewinne = klasse5gewinne;
    }
    
    @Column(name="klasse6Gewinne", nullable=false)

    public Integer getKlasse6gewinne() {
        return this.klasse6gewinne;
    }
    
    public void setKlasse6gewinne(Integer klasse6gewinne) {
        this.klasse6gewinne = klasse6gewinne;
    }
    
    @Column(name="klasse7Gewinne", nullable=false)

    public Integer getKlasse7gewinne() {
        return this.klasse7gewinne;
    }
    
    public void setKlasse7gewinne(Integer klasse7gewinne) {
        this.klasse7gewinne = klasse7gewinne;
    }
   








}