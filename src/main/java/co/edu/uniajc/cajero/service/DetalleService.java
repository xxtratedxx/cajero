package co.edu.uniajc.cajero.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import co.edu.uniajc.cajero.dao.ImpDetalleDao;
import co.edu.uniajc.cajero.model.Detalle;




public class DetalleService implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6769638076649557598L;
	private ImpDetalleDao DetalleDao;
	
	public DetalleService (Session session) {
		
		DetalleDao = new ImpDetalleDao(session);
	}
	
	public List<Detalle> findByIdall() {
		return DetalleDao.findByIdall();
	}
    
	public Detalle findById(int id){
		return DetalleDao.findById(id);
	}
	
	public void closeSession(){
		DetalleDao.closeSession();
	}		

}
