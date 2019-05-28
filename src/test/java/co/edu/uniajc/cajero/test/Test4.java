package co.edu.uniajc.cajero.test;


import java.text.ParseException;
import org.hibernate.Session;
import org.junit.Test;
import co.edu.uniajc.cajero.service.CuentaService;
import co.edu.uniajc.cajero.util.HibernateUtil;


public class Test4 {

	@Test
	public void test() throws ParseException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		// test for user
	    CuentaService CuentaService = new CuentaService(session);

	     System.out.println(CuentaService.findByIdall());
	    CuentaService.closeSession();
		 
	
			
	}

}
