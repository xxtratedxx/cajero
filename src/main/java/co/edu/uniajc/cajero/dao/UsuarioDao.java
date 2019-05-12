package co.edu.uniajc.cajero.dao;

import co.edu.uniajc.cajero.model.Usuario;

public interface UsuarioDao {	
	
	
	public void save (Usuario Usuario);
	public Usuario findById(int id);
	public Usuario Update(int id,String nome,String lname,String dir,String cel, String email);
	public Usuario Delete(int id);

}
