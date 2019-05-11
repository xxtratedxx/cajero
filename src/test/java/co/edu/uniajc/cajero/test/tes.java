package co.edu.uniajc.cajero.test;


import org.hibernate.Session;
import org.junit.Test;
import co.edu.uniajc.cajero.model.TipoIdentificacion;
import co.edu.uniajc.cajero.service.TipoIdentificacionService;
import co.edu.uniajc.cajero.util.HibernateUtil;


public class tes {

	@Test
	public void test() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		TipoIdentificacionService TipoIdentificacionService = new TipoIdentificacionService(session);
		
		//TipoIdentificacionService.save(new TipoIdentificacion("cedula_997",null));
	   // TipoIdentificacionService.save(new TipoIdentificacion("Pasaporte_98",null));
	    TipoIdentificacionService.findById(1);
		TipoIdentificacionService.closeSession();
				
			
	}

}
