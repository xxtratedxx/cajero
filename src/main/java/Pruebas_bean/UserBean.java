package Pruebas_bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import co.edu.uniajc.cajero.model.Usuario;

@ManagedBean(name = "userBean", eager = true)
@RequestScoped
public class UserBean {

	private int tipoIdentificacion;
	private int identificacion;
	private String nombre;
	private String apellido;
	private String direccion;
	private int celular;
	private String email;
	
	private List<Usuario> lstUsers;
	
	public UserBean() {
		lstUsers = new ArrayList<>();
	}
	
	public void handleKeyEvent() {
        nombre = nombre.toUpperCase();
    }
	
	public void buttonAction() {
		
		addMessage("Datos de usuario enviados!! tipo identificacion: " + tipoIdentificacion + " | identificacion:  " + identificacion + " | nombre: " + nombre + " | apellido: " + apellido + " | direccion: " + direccion + " | celular: " + celular + " | email: " + email);
		
    }
	
	public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Usuario> getLstUsers() {
		return lstUsers;
	}

	public void setLstUsers(List<Usuario> lstUsers) {
		this.lstUsers = lstUsers;
	}

}
