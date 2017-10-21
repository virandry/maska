// default package
// Generated Oct 21, 2017 10:46:31 AM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Orderstatus.
 * @see .Orderstatus
 * @author Hibernate Tools
 */
@Stateless
public class OrderstatusHome {

	private static final Log log = LogFactory.getLog(OrderstatusHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Orderstatus transientInstance) {
		log.debug("persisting Orderstatus instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Orderstatus persistentInstance) {
		log.debug("removing Orderstatus instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Orderstatus merge(Orderstatus detachedInstance) {
		log.debug("merging Orderstatus instance");
		try {
			Orderstatus result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Orderstatus findById(Integer id) {
		log.debug("getting Orderstatus instance with id: " + id);
		try {
			Orderstatus instance = entityManager.find(Orderstatus.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
