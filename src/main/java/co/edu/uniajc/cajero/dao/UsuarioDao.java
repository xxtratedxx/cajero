package co.edu.uniajc.cajero.dao;

import java.util.List;


import co.edu.uniajc.cajero.model.Usuario;

public interface UsuarioDao {	
	
	public void save(Usuario usuario);
	public List<Usuario> findByIdall();
	public Usuario findById(int id);

}
