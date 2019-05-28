package co.edu.uniajc.cajero.dao;



import java.util.List;

import co.edu.uniajc.cajero.model.Detalle;




public interface DetalleDao {	
	
public List<Detalle> findByIdall();
public Detalle findById(int id);

}
