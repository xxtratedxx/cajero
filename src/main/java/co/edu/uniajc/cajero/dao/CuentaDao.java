package co.edu.uniajc.cajero.dao;

import java.util.List;

import co.edu.uniajc.cajero.model.Cuenta;


public interface CuentaDao {
	
	public void save(Cuenta Cuenta);
	public Cuenta findById(int id) ;
	public List<Cuenta> findByIdall();
	public Cuenta Update(Cuenta c);
	public Cuenta Delete(int id);
	
	
	

}
