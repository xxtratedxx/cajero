package co.edu.uniajc.cajero.dao;
// Generated 7/04/2019 01:08:54 PM by Hibernate Tools 5.2.12.Final


import java.util.List;
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
	public List<Usuario> findByIdall() {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
		
			// frabrica  para las piezas individuales de criteria 
			 CriteriaBuilder builder = session.getCriteriaBuilder();
			 CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class); 
				
			// Definir el tipo de entidad que retorna la consulta 
			   Root<Usuario> root = criteria.from(Usuario.class);
					
			 //construyendo la consulta 
			   criteria.select(root); 
			 //adicionar a lista la consulta
			   
			   List<Usuario> lstUsuario = session.createQuery(criteria).getResultList();
			   tx.commit();
			   
			   return lstUsuario ;
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
			
			return null;
		}		 
		
	}
	public void closeSession() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Usuario usuario) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			session.save(usuario);
			
			tx.commit();
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}	
				
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

}	



