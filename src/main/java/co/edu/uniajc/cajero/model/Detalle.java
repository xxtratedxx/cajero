package co.edu.uniajc.cajero.model;
// Generated 7/04/2019 01:08:10 PM by Hibernate Tools 5.2.12.Final



import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Detalle generated by hbm2java
 */

@Entity
@Table(name = "Detalle")
public class Detalle implements java.io.Serializable  {

	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDetalle;
	
	@ManyToOne
	@JoinColumn(name="idCuenta")
	private Cuenta idcuenta;
	
	@ManyToOne
	@JoinColumn(name="id_Movimiento")
	private Movimiento id_movimiento;
	@ManyToOne
	@JoinColumn(name="id_Tarjeta")
	private Tarjeta id_tarjeta;
	@ManyToOne
	@JoinColumn(name="id_Transaccion")
	private Transaccion id_transaccion;	
	
	private BigDecimal monto;
	

	public int getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}


	public Cuenta getIdcuenta() {
		return idcuenta;
	}


	public void setIdcuenta(Cuenta idcuenta) {
		this.idcuenta = idcuenta;
	}


	public Movimiento getId_movimiento() {
		return id_movimiento;
	}


	public void setId_movimiento(Movimiento id_movimiento) {
		this.id_movimiento = id_movimiento;
	}


	public Tarjeta getId_tarjeta() {
		return id_tarjeta;
	}


	public void setId_tarjeta(Tarjeta id_tarjeta) {
		this.id_tarjeta = id_tarjeta;
	}


	public Transaccion getId_transaccion() {
		return id_transaccion;
	}


	public void setId_transaccion(Transaccion id_transaccion) {
		this.id_transaccion = id_transaccion;
	}


	public BigDecimal getMonto() {
		return monto;
	}


	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}


	public Detalle() {
	}


	@Override
	public String toString() {
		return "Detalle [idDetalle=" + idDetalle + ", idcuenta=" + idcuenta + ", id_movimiento=" + id_movimiento
				+ ", id_tarjeta=" + id_tarjeta + ", id_transaccion=" + id_transaccion + ", monto=" + monto + "]";
	}

}
