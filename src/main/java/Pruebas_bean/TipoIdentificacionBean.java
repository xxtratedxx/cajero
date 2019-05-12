package Pruebas_bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.hibernate.Session;

import co.edu.uniajc.cajero.model.TipoIdentificacion;
import co.edu.uniajc.cajero.service.TipoIdentificacionService;
import co.edu.uniajc.cajero.util.HibernateUtil;

@ManagedBean(name = "tipoIdentificacionBean", eager = true)
@RequestScoped
public class TipoIdentificacionBean {

	private int id;
	private String descripcion;
	
	private TipoIdentificacionService tipoIdentificacionService;
	
	public TipoIdentificacionBean() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		TipoIdentificacionService TipoIdentificacionService = new TipoIdentificacionService(session);
		tipoIdentificacionService = new TipoIdentificacionService(session);
		TipoIdentificacionService.closeSession();
	}

	public void buttonAction() {
		
		tipoIdentificacionService.save(new TipoIdentificacion(descripcion,null));
		addMessage("Datos de usuario enviados!! Descripcion: " + descripcion);
	}
	
	public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
