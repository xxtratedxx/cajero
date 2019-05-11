package co.edu.uniajc.cajero.dao;


import co.edu.uniajc.cajero.model.TipoIdentificacion;


public interface TipoIdentificacionDao {
	
	public void save(TipoIdentificacion TipoIdentificacion);
	//public void delete(TipoIdentificacion TipoIdentificacion);
	public TipoIdentificacion findById(int id);
	
	

}
