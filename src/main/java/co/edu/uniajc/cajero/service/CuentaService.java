package co.edu.uniajc.cajero.service;



import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import co.edu.uniajc.cajero.dao.ImpCuentaDao;
import co.edu.uniajc.cajero.model.Cuenta;


public class CuentaService implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImpCuentaDao CuentaDao;
	
	public CuentaService(Session session) {
		
		CuentaDao = new ImpCuentaDao(session);
	
	}
	
	public Cuenta findById(int id){
		return CuentaDao.findById(id);
	}
	
	public List<Cuenta> findByIdall() {
		return CuentaDao.findByIdall();
	}
	
	public void save(Cuenta Cuenta) {
		CuentaDao.save(Cuenta);
	}
	
	public Cuenta Update(Cuenta c){
		return CuentaDao.Update(c);
	}
	
	public Cuenta Delete(int id){
		return CuentaDao.Delete(id);
	}
	public void closeSession(){
		CuentaDao.closeSession();
	}


	
}

