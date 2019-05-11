package co.edu.uniajc.cajero.model;
// Generated 7/04/2019 01:08:10 PM by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Detalle generated by hbm2java
 */
@Entity
@Table(name = "Detalle")
public class Detalle implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private DetalleId id;
	private Cuenta cuenta;
	private Movimiento movimiento;
	private Tarjeta tarjeta;
	private Transaccion transaccion;
	private BigDecimal monto;

	public Detalle() {
	}

	public Detalle(DetalleId id, Cuenta cuenta, Movimiento movimiento, Transaccion transaccion) {
		this.id = id;
		this.cuenta = cuenta;
		this.movimiento = movimiento;
		this.transaccion = transaccion;
	}

	public Detalle(DetalleId id, Cuenta cuenta, Movimiento movimiento, Tarjeta tarjeta, Transaccion transaccion,
			BigDecimal monto) {
		this.id = id;
		this.cuenta = cuenta;
		this.movimiento = movimiento;
		this.tarjeta = tarjeta;
		this.transaccion = transaccion;
		this.monto = monto;
	}

	public DetalleId getId() {
		return this.id;
	}

	public void setId(DetalleId id) {
		this.id = id;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Movimiento getMovimiento() {
		return this.movimiento;
	}

	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}

	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public Transaccion getTransaccion() {
		return this.transaccion;
	}

	public void setTransaccion(Transaccion transaccion) {
		this.transaccion = transaccion;
	}

	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
