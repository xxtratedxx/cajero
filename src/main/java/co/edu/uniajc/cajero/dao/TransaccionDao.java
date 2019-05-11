package co.edu.uniajc.cajero.dao;
// Generated 7/04/2019 01:08:54 PM by Hibernate Tools 5.2.12.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import co.edu.uniajc.cajero.model.Transaccion;

/**
 * Home object for domain model class Transaccion.
 * @see co.edu.uniajc.cajero.dao.Transaccion
 * @author Hibernate Tools
 */
public class TransaccionDao {

	private static final Log log = LogFactory.getLog(TransaccionDao.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Transaccion transientInstance) {
		log.debug("persisting Transaccion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Transaccion instance) {
		log.debug("attaching dirty Transaccion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Transaccion instance) {
		log.debug("attaching clean Transaccion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Transaccion persistentInstance) {
		log.debug("deleting Transaccion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Transaccion merge(Transaccion detachedInstance) {
		log.debug("merging Transaccion instance");
		try {
			Transaccion result = (Transaccion) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Transaccion findById(java.lang.Integer id) {
		log.debug("getting Transaccion instance with id: " + id);
		try {
			Transaccion instance = (Transaccion) sessionFactory.getCurrentSession()
					.get("co.edu.uniajc.cajero.dao.Transaccion", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Transaccion instance) {
		log.debug("finding Transaccion instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("co.edu.uniajc.cajero.dao.Transaccion")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
