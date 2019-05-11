package co.edu.uniajc.cajero.service;

import java.util.List;

import org.hibernate.Session;



import co.edu.uniajc.cajero.dao.ImpTipoIdentificacionDao;
import co.edu.uniajc.cajero.model.TipoIdentificacion;

public class TipoIdentificacionService {
	
	private ImpTipoIdentificacionDao tipoIdentificacionDao;
	
	public TipoIdentificacionService(Session session) {
		
		tipoIdentificacionDao = new ImpTipoIdentificacionDao(session);
	
	}
	
	public TipoIdentificacion findById(int id){
		return tipoIdentificacionDao.findById(id);
	}
	
	public void save(TipoIdentificacion TipoIdentificacion) {
		tipoIdentificacionDao.save(TipoIdentificacion);
	}
	

	public void closeSession(){
		tipoIdentificacionDao.closeSession();
	}
}

