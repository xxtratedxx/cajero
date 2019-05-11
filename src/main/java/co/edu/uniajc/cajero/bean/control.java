package co.edu.uniajc.cajero.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.application.FacesMessage;

@ManagedBean(name = "control", eager = true)
@RequestScoped
public class control {
	    // @ManagedProperty(value = "#{message}") esto se usa en objetos que contengan
		// datos
		private String message = " esto es control es ";
        
		private String name ;

		public String getMessage() {
			return message;
		}
		

		public void setMessage(String message) {
			this.message = message;
		}
	
	
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	
	

}
