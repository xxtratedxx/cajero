package co.edu.uniajc.cajero.test;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import org.hibernate.Session;
import org.junit.Test;
import co.edu.uniajc.cajero.service.DetalleService;
import co.edu.uniajc.cajero.util.HibernateUtil;


public class Test3 {

	@Test
	public void test() throws ParseException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		// test for user
	    DetalleService DetalleService = new DetalleService(session);

	    
	    
	     System.out.println(DetalleService.findByIdall());

	     DetalleService.closeSession();
		 
	
	}

}
