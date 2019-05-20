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
import org.primefaces.event.RowEditEvent;

import co.edu.uniajc.cajero.model.TipoIdentificacion;
import co.edu.uniajc.cajero.model.Usuario;
import co.edu.uniajc.cajero.service.TipoIdentificacionService;
import co.edu.uniajc.cajero.service.UsuarioService;
import co.edu.uniajc.cajero.util.HibernateUtil;

/**
 * 
 * @author Steven Ordo�ez
 *
 */
@ManagedBean(name = "userBean", eager = true)
@RequestScoped
public class UserBean {

	private int tipoIdentificacion;
	private String identificacion;
	private String nombre;
	private String apellido;
	private String direccion;
	private String celular;
	private String email;
	
	private List<TipoIdentificacion> lstTipoIdentificacion;
	private List<Usuario> lstUsers;
	
	private Usuario userSelected;
	
	
	// Constructor
	public UserBean() {	
		lstUsers = new ArrayList<Usuario>();
		lstTipoIdentificacion = new  ArrayList<TipoIdentificacion>();
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	
		this.getLstTipoIdentificacion(session);
		this.getLstUsers(session);	
	}
	
	public void handleKeyEvent() {
        nombre = nombre.toUpperCase();
    }
	
	// Metodo que consulta los registros de la tabla tipo identificacion
	public void getLstTipoIdentificacion(Session session) {
		try {
			
			TipoIdentificacionService TipoIdentificacionService = new TipoIdentificacionService(session);
			TipoIdentificacionService = new TipoIdentificacionService(session);
			lstTipoIdentificacion = TipoIdentificacionService.findByIdall();
			for (TipoIdentificacion l : lstTipoIdentificacion) {
				System.out.println("Id: " + l.getIdIdentificacion() + " Descripcion: " + l.getDescripcion());
			}
			TipoIdentificacionService.closeSession();
			
		} catch (Exception e) {
			System.out.println("Error getLstTipoIdentificacion(): " + e.toString());
		}
	}
	
	
	// Metodo que consulta los registros de la tabla usuario
	public void getLstUsers(Session session) {
		try {
			
			UsuarioService usuarioService = new UsuarioService(session);
			usuarioService = new UsuarioService(session);
			lstUsers = usuarioService.findByIdall();
			usuarioService.closeSession();
			
		} catch (Exception e) {
			System.out.println("Error getLstUsers(): " + e.toString());
		}
	}
	
	
	// Metodo que env�a los datos del usuario a crear
	public void buttonAction() throws ParseException {
		this.createUser();
		addMessage("Datos de usuario enviados!! tipo identificacion: " + tipoIdentificacion + " | identificacion:  " + identificacion + " | nombre: " + nombre + " | apellido: " + apellido + " | direccion: " + direccion + " | celular: " + celular + " | email: " + email);
    }
	
	
	// Metodo que se conecta al servicio de crear usuario
	public void createUser() {
		try {
			
			TipoIdentificacion tipoId = new TipoIdentificacion(tipoIdentificacion); // Se obtiene el id del tipo de identificacion que se seleccion� en el formulario
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			UsuarioService usuarioService = new UsuarioService(session);
			usuarioService = new UsuarioService(session);
			usuarioService.save(new Usuario(tipoId, identificacion, nombre, apellido, direccion, celular, email, new Date(), new Date()));
			usuarioService.closeSession();
		} catch (Exception e) {
			System.out.println("Error createUser(): " + e.toString());
		}
	}
	
	
	public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Usuario Editado", ((Usuario) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Usuario cancelado", ((Usuario) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	
	// Metodo que modifica un usuario
	public void updateUser(Usuario u) {
		System.out.println("Usuario a modificar");
		System.out.println("Identificacion: " + u.getIdentificacion() + " Nombre: " + u.getNombre());
	}
	
	
	// Metodo que elimina un usuario
	public void deleteUserSelected() {
		lstUsers.remove(userSelected);
	}
	
	public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
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

	public Usuario getUserSelected() {
		return userSelected;
	}

	public void setUserSelected(Usuario userSelected) {
		this.userSelected = userSelected;
	}

}
