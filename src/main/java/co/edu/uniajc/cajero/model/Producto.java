package co.edu.uniajc.cajero.model;
// Generated 7/04/2019 01:08:10 PM by Hibernate Tools 5.2.12.Final


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name = "producto")
public class Producto implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3232646099317154752L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idProducto;
	private String descripcion;
	//private Set cuentas = new HashSet(0);

	public Producto() {
	}

	public Producto(String descripcion) {
		this.descripcion = descripcion;
	}

	/*public Producto(String descripcion, Set cuentas) {
	this.descripcion = descripcion;
	this.cuentas = cuentas;
	}*/

	public Integer getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + "]";
	}

	//public Set getCuentas() {
	//	return this.cuentas;
	//}

	//public void setCuentas(Set cuentas) {
	//	this.cuentas = cuentas;
	//}

}
