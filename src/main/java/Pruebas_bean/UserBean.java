package Pruebas_bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.hibernate.Session;

import co.edu.uniajc.cajero.model.TipoIdentificacion;
import co.edu.uniajc.cajero.model.Usuario;
import co.edu.uniajc.cajero.service.TipoIdentificacionService;
import co.edu.uniajc.cajero.service.UsuarioService;
import co.edu.uniajc.cajero.util.HibernateUtil;

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
	
	private List<TipoIdentificacion> lstTipoIdentificacion;
	private List<Usuario> lstUsers;
	
	public UserBean() {
		lstUsers = new ArrayList<>();
		lstTipoIdentificacion = new  ArrayList<>();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		UsuarioService usuarioService = new UsuarioService(session);
		usuarioService = new UsuarioService(session);
		lstUsers = usuarioService.findByIdall();
		usuarioService.closeSession();
		
		TipoIdentificacionService TipoIdentificacionService = new TipoIdentificacionService(session);
		TipoIdentificacionService = new TipoIdentificacionService(session);
		lstTipoIdentificacion = TipoIdentificacionService.findByIdall();
		for (TipoIdentificacion l : lstTipoIdentificacion) {
			System.out.println("Id: " + l.getIdIdentificacion() + " Descripcion: " + l.getDescripcion());
		}
		TipoIdentificacionService.closeSession();
	}
	
	public void handleKeyEvent() {
        nombre = nombre.toUpperCase();
    }
	
	public void buttonAction() throws ParseException {
		
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse("15/04/2019");
		Integer identificacion = 4;
		TipoIdentificacion tipoIdentificacion = new TipoIdentificacion(identificacion);
		
		addMessage("Datos de usuario enviados!! tipo identificacion: " + tipoIdentificacion + " | identificacion:  " + identificacion + " | nombre: " + nombre + " | apellido: " + apellido + " | direccion: " + direccion + " | celular: " + celular + " | email: " + email);
		Session session = HibernateUtil.getSessionFactory().openSession();
		UsuarioService usuarioService = new UsuarioService(session);
		usuarioService = new UsuarioService(session);
		usuarioService.save(new Usuario(tipoIdentificacion, "3837494", "prueba", "prueba", "carrera 7", "31525", "buitrago500", date1, date1));
		usuarioService.closeSession();
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

	public List<TipoIdentificacion> getLstTipoIdentificacion() {
		return lstTipoIdentificacion;
	}

	public void setLstTipoIdentificacion(List<TipoIdentificacion> lstTipoIdentificacion) {
		this.lstTipoIdentificacion = lstTipoIdentificacion;
	}

}
