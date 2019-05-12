package co.edu.uniajc.cajero.dao;
// Generated 7/04/2019 01:08:54 PM by Hibernate Tools 5.2.12.Final


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;
import co.edu.uniajc.cajero.model.Usuario;
import co.edu.uniajc.cajero.model.Usuario_;

/**
 * Home object for domain model class Usuario.
 * @see co.edu.uniajc.cajero.dao.Usuario
 * @author Hibernate Tools
 */
public class ImpUsuarioDao  implements UsuarioDao {

		private Session session;
	
	public  ImpUsuarioDao(Session session) {
		this.session = session;
	}		
	@Override
	public Usuario findById(int id) {
	
		Transaction tx = null;
		Usuario Usuario = null;
		try {
			tx = session.beginTransaction();
			
			// frabrica  para las piezas individuales de criteria 
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class);
			
			// Definir el tipo de entidad que retorna la consulta 
			Root<Usuario> root = criteria.from(Usuario.class);
			
			//construyendo la consulta 
			criteria.select(root);
			criteria.where(
					builder.equal(root.get(Usuario_.idUsuario), id)
					);
			
			Usuario = session.createQuery(criteria).getSingleResult();
			
			tx.commit();
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return Usuario;			
	}

	@Override
	public Usuario Update(int id,String nome,String lname,String dir,String cel, String email) {
		Transaction tx = null;
		Usuario Usuario = null;
		try {
			tx = session.beginTransaction();
			
			// frabrica  para las piezas individuales de criteria 
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class);
			
			// Definir el tipo de entidad que retorna la consulta 
			Root<Usuario> root = criteria.from(Usuario.class);
			
			//construyendo la consulta 
			criteria.select(root);
			criteria.where(
					builder.equal(root.get(Usuario_.idUsuario), id)
					);
			
			Usuario = session.createQuery(criteria).getSingleResult();
			//Update		
			Usuario.setApellido(lname);
			session.update(Usuario);
			
			
			tx.commit();
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return Usuario;			
	}	
	
	@Override
	public Usuario Delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public void save(Usuario Usuario) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			session.save(Usuario);
			
			tx.commit();
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
	}
	

	public void closeSession() {
		// TODO Auto-generated method stub
		
	}


}	



