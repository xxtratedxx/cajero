package co.edu.uniajc.cajero.dao;
// Generated 7/04/2019 01:08:54 PM by Hibernate Tools 5.2.12.Final


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.Transaction;

import co.edu.uniajc.cajero.model.Detalle;
import co.edu.uniajc.cajero.model.Detalle_;
import co.edu.uniajc.cajero.model.TipoIdentificacion;



/**
 * Home object for domain model class Detalle.
 * @see co.edu.uniajc.cajero.dao.Detalle
 * @author Hibernate Tools
 */
public class ImpDetalleDao implements DetalleDao {

	
	private Session session;
	
	public  ImpDetalleDao(Session session) {
		this.session = session;
	}
	@Override
	public Detalle findById(int id) {
		Transaction tx = null;
		Detalle Detalle = null;
		try {
			tx = session.beginTransaction();
			
			// frabrica  para las piezas individuales de criteria 
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Detalle> criteria = builder.createQuery(Detalle.class);
			
			// Definir el tipo de entidad que retorna la consulta 
			Root<Detalle> root = criteria.from(Detalle.class);
			
			//construyendo la consulta 
			criteria.select(root);
			criteria.where(
					builder.equal(root.get(Detalle_.idDetalle), id)
					);
			
			Detalle = session.createQuery(criteria).getSingleResult();
			    
			
			tx.commit();
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return Detalle;
	}

	public List<Detalle> findByIdall() {
		Transaction tx = null;
		//TipoIdentificacion Tipoidentificacion = null;
		try {
			tx = session.beginTransaction();
			
			// frabrica  para las piezas individuales de criteria 
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Detalle> criteria = builder.createQuery(Detalle.class);
			
			// Definir el tipo de entidad que retorna la consulta 
			Root<Detalle> root = criteria.from(Detalle.class);
			
			//construyendo la consulta 
			criteria.select(root);
	
			List<Detalle> lstDetalle = session.createQuery(criteria).getResultList();
					
			//Tipoidentificacion = session.createQuery(criteria).getSingleResult();
			
			tx.commit();
			
			return lstDetalle;
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

	
}
