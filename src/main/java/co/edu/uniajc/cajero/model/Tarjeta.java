package co.edu.uniajc.cajero.model;
// Generated 7/04/2019 01:08:10 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tarjeta generated by hbm2java
 */
@Entity
@Table(name = "Tarjeta")
public class Tarjeta implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 940519748274981851L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTarjeta;
	private Cuenta cuenta;
	private Estado estado;
	private String numero;
	private Date validthru;
	private int indBlock;
	private String clave;
	private Date fecCreacion;
	//private Set detalles = new HashSet(0);

	public Tarjeta() {
	}

	public Tarjeta(Cuenta cuenta, Estado estado, String numero, Date validthru, int indBlock, String clave) {
		this.cuenta = cuenta;
		this.estado = estado;
		this.numero = numero;
		this.validthru = validthru;
		this.indBlock = indBlock;
		this.clave = clave;
	}

	//public Tarjeta(Cuenta cuenta, Estado estado, String numero, Date validthru, int indBlock, String clave,
	//		Date fecCreacion, Set detalles) {
	//	this.cuenta = cuenta;
	//	this.estado = estado;
	//	this.numero = numero;
	//	this.validthru = validthru;
	///	this.indBlock = indBlock;
	///	this.clave = clave;
	//	this.fecCreacion = fecCreacion;
	///	this.detalles = detalles;
	//}

	public Integer getIdTarjeta() {
		return this.idTarjeta;
	}

	public void setIdTarjeta(Integer idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getValidthru() {
		return this.validthru;
	}

	public void setValidthru(Date validthru) {
		this.validthru = validthru;
	}

	public int getIndBlock() {
		return this.indBlock;
	}

	public void setIndBlock(int indBlock) {
		this.indBlock = indBlock;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getFecCreacion() {
		return this.fecCreacion;
	}

	public void setFecCreacion(Date fecCreacion) {
		this.fecCreacion = fecCreacion;
	}

//	public Set getDetalles() {
//		return this.detalles;
//	}

//	public void setDetalles(Set detalles) {
//		this.detalles = detalles;
//	}

}
