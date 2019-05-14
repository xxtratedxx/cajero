package co.edu.uniajc.cajero.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

import co.edu.uniajc.cajero.dao.ImpUsuarioDao;
import co.edu.uniajc.cajero.model.Usuario;

public class UsuarioService implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -783299566294239418L;
	private ImpUsuarioDao usuarioDao;
	
	public UsuarioService (Session session) {
		
		usuarioDao = new ImpUsuarioDao(session);
	}
	
	public List<Usuario> findByIdall() {
		return usuarioDao.findByIdall();
	}
	
	public void closeSession(){
		usuarioDao.closeSession();
	}	
	
	

}
