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
 * Lottogebuehren entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="lottogebuehren"
    ,catalog="lotto"
, uniqueConstraints = @UniqueConstraint(columnNames="gueltigAb")
)

public class Lottogebuehren  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idLottoGebuehren;
     private Timestamp gueltigAb;
     private Double gebuehr;


    // Constructors

    /** default constructor */
    public Lottogebuehren() {
    }

    
    /** full constructor */
    public Lottogebuehren(Timestamp gueltigAb, Double gebuehr) {
        this.gueltigAb = gueltigAb;
        this.gebuehr = gebuehr;
    }

   
    // Property accessors
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idLottoGebuehren", unique=true, nullable=false)

    public Long getIdLottoGebuehren() {
        return this.idLottoGebuehren;
    }
    
    public void setIdLottoGebuehren(Long idLottoGebuehren) {
        this.idLottoGebuehren = idLottoGebuehren;
    }
    
    @Column(name="gueltigAb", unique=true, nullable=false, length=19)

    public Timestamp getGueltigAb() {
        return this.gueltigAb;
    }
    
    public void setGueltigAb(Timestamp gueltigAb) {
        this.gueltigAb = gueltigAb;
    }
    
    @Column(name="gebuehr", nullable=false, precision=6)

    public Double getGebuehr() {
        return this.gebuehr;
    }
    
    public void setGebuehr(Double gebuehr) {
        this.gebuehr = gebuehr;
    }
   








}