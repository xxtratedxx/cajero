package co.edu.uniajc.cajero.model;
// Generated 7/04/2019 01:08:10 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TipoIdentificacion generated by hbm2java
 */
@Entity
@Table(name = "TipoIdentificacion")
public class TipoIdentificacion implements java.io.Serializable {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idIdentificacion;
	private String descripcion;
	//private Set usuarios = new HashSet(0);

	public TipoIdentificacion() {
	}

	public TipoIdentificacion(String descripcion, Set usuarios) {
		this.descripcion = descripcion;
	//	this.usuarios = usuarios;
	}

	public Integer getIdIdentificacion() {
		return this.idIdentificacion;
	}

	public void setIdIdentificacion(Integer idIdentificacion) {
		this.idIdentificacion = idIdentificacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoIdentificacion [id_Identificacion=" + idIdentificacion + ", descripcion=" + descripcion + "]";
	}

	
	
	
//	public Set getUsuarios() {
	//	return this.usuarios;
	//}

//	public void setUsuarios(Set usuarios) {
//	this.usuarios = usuarios;
	//}

}
