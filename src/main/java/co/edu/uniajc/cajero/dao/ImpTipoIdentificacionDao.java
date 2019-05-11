package co.edu.uniajc.cajero.dao;
// Generated 7/04/2019 01:08:54 PM by Hibernate Tools 5.2.12.Final


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import org.hibernate.Transaction;


import co.edu.uniajc.cajero.model.TipoIdentificacion;
import co.edu.uniajc.cajero.model.TipoIdentificacion_;

/**
 * Home object for domain model class TipoIdentificacion.
 * @see co.edu.uniajc.cajero.dao.TipoIdentificacion
 * @author Hibernate Tools
 */
public class ImpTipoIdentificacionDao implements TipoIdentificacionDao   {

	private Session session;
	

	public ImpTipoIdentificacionDao(Session session) {
		this.session = session;
	}
	


	@Override
	public void save(TipoIdentificacion TipoIdentificacion) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			session.save(TipoIdentificacion);
			
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
	public TipoIdentificacion findById(int id) {
		Transaction tx = null;
		TipoIdentificacion inmueble = null;
		try {
			tx = session.beginTransaction();
			
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<TipoIdentificacion> criteria = builder.createQuery(TipoIdentificacion.class);
			Root<TipoIdentificacion> root = criteria.from(TipoIdentificacion.class);
			
			criteria.where(
					builder.equal(root.get(TipoIdentificacion_.idIdentificacion), id)
					);
			
			inmueble = session.createQuery(criteria).getSingleResult();
			
			tx.commit();
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return inmueble;
	}



	public void closeSession() {
		// TODO Auto-generated method stub
		
	}	

}
