package co.edu.uniajc.cajero.test;


import org.hibernate.Session;
import org.junit.Test;
import co.edu.uniajc.cajero.service.UsuarioService;
import co.edu.uniajc.cajero.util.HibernateUtil;


public class Test2 {

	@Test
	public void test() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	    UsuarioService UsuarioService = new UsuarioService(session);

		 System.out.println(UsuarioService.findByIdall());
				 

		 UsuarioService.closeSession();
				
			
	}

}
