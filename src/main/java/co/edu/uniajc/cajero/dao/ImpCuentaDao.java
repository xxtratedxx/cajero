package co.edu.uniajc.cajero.dao;
// Generated 7/04/2019 01:08:54 PM by Hibernate Tools 5.2.12.Final

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import co.edu.uniajc.cajero.model.Cuenta;
import co.edu.uniajc.cajero.model.Cuenta_;



/**
 * Home object for domain model class Cuenta.
 * @see co.edu.uniajc.cajero.dao.Cuenta
 * @author Hibernate Tools
 */
public class ImpCuentaDao implements CuentaDao {
	
	private Session session;
	
   public  ImpCuentaDao(Session session) {
	this.session = session;
}		


	@Override
	public void save(Cuenta Cuenta) {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			session.save(Cuenta);
			
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
	public Cuenta findById(int id) {
		Transaction tx = null;
		Cuenta Cuenta = null;
		try {
			tx = session.beginTransaction();
			
			// frabrica  para las piezas individuales de criteria 
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Cuenta> criteria = builder.createQuery(Cuenta.class);
			
			// Definir el tipo de entidad que retorna la consulta 
			Root<Cuenta> root = criteria.from(Cuenta.class);
			
			//construyendo la consulta 
			criteria.select(root);
			criteria.where(
					builder.equal(root.get(Cuenta_.idCuenta), id)
					);
			
			Cuenta = session.createQuery(criteria).getSingleResult();
			
			tx.commit();
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return Cuenta;
	}

	@Override
	public List<Cuenta> findByIdall() {
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
		
			// frabrica  para las piezas individuales de criteria 
			 CriteriaBuilder builder = session.getCriteriaBuilder();
			 CriteriaQuery<Cuenta> criteria = builder.createQuery(Cuenta.class); 
				
			// Definir el tipo de entidad que retorna la consulta 
			   Root<Cuenta> root = criteria.from(Cuenta.class);
					
			 //construyendo la consulta 
			   criteria.select(root); 
			 //adicionar a lista la consulta
			   
			   List<Cuenta> lstCuenta = session.createQuery(criteria).getResultList();
			   tx.commit();
			   
			   return lstCuenta ;
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
			
			return null;
		}		 
	}

	@Override
	public Cuenta Update(Cuenta c) {
		Transaction tx = null;
		Cuenta Cuenta = null;
		try {
			tx = session.beginTransaction();
			
			// frabrica  para las piezas individuales de criteria 
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Cuenta> criteria = builder.createQuery(Cuenta.class);
			
			// Definir el tipo de entidad que retorna la consulta 
			Root<Cuenta> root = criteria.from(Cuenta.class);
			
			//construyendo la consulta 
			criteria.select(root);
			criteria.where(
					builder.equal(root.get(Cuenta_.idCuenta), c.getIdCuenta())
					);
			
			Cuenta = session.createQuery(criteria).getSingleResult();
			
			//Update		
			Cuenta.setBanco(c.getBanco());
			Cuenta.setClave(c.getClave());
			Cuenta.setEstado(c.getEstado());
			Cuenta.setNumero(c.getNumero());
			Cuenta.setProducto(c.getProducto());
			Cuenta.setSaldo(c.getSaldo());
			Cuenta.setIdCuenta(c.getIdCuenta());
			
			session.update(Cuenta);
			
			tx.commit();
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return Cuenta;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Cuenta Delete(int id) {
		Transaction tx = null;
		Cuenta Cuenta = null;
		try {
			tx = session.beginTransaction();
			
			// frabrica  para las piezas individuales de criteria 
//			CriteriaBuilder builder = session.getCriteriaBuilder();
//			CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class);
//			
			// Definir el tipo de entidad que retorna la consulta 
//			Root<Usuario> root = criteria.from(Usuario.class);
//			
//			//construyendo la consulta 
//			criteria.select(root);
//			criteria.where(
//					builder.equal(root.get(Usuario_.idUsuario), id)
//					);
//			
//			Usuario = session.createQuery(criteria).getSingleResult();
			
//			Usuario u = (Usuario ) session.createCriteria(Usuario.class)
//                    .add(Restrictions.eq("Usuario_.idUsuario", Usuario_.idUsuario)).uniqueResult();
//			session.delete(u);
			  
			Cuenta u = (Cuenta ) session.createCriteria(Cuenta.class)
                    .add(Restrictions.eq("idCuenta", id)).uniqueResult();
			session.delete(u);
			
			
			tx.commit();
		} 
		catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		}
		return Cuenta;
	}


	public void closeSession() {
		// TODO Auto-generated method stub
		
	}

	
}
