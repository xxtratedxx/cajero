package co.edu.uniajc.cajero.service;

import org.hibernate.Session;

import co.edu.uniajc.cajero.dao.ImpUsuarioDao;
import co.edu.uniajc.cajero.model.Usuario;
public class UsuarioService {
	
	private ImpUsuarioDao usuarioDao;
	
	public UsuarioService (Session session) {
		
		usuarioDao = new ImpUsuarioDao(session);
	}
		
	public Usuario findById(int id){
		return usuarioDao.findById(id);
	}
	
	public  void save(Usuario Usuario) {
		usuarioDao.save(Usuario);
	}
	
//	public void saveUser(int tipoIdentificacion, String identificacion, String nombre, String apellido, String direccion, String celular, String email) {
//		
//	}
	
	public Usuario Update(int id,String nome,String lname,String dir,String cel, String email){
		return usuarioDao.Update(id,nome,lname,dir,cel,email);
	}
	public Usuario Delete(int id){
		return usuarioDao.Delete(id);
	}
	public void closeSession(){
		usuarioDao.closeSession();
	}	
	
	

}
