// default package
// Generated Oct 21, 2017 10:46:31 AM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Shipping.
 * @see .Shipping
 * @author Hibernate Tools
 */
@Stateless
public class ShippingHome {

	private static final Log log = LogFactory.getLog(ShippingHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Shipping transientInstance) {
		log.debug("persisting Shipping instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Shipping persistentInstance) {
		log.debug("removing Shipping instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Shipping merge(Shipping detachedInstance) {
		log.debug("merging Shipping instance");
		try {
			Shipping result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Shipping findById(Integer id) {
		log.debug("getting Shipping instance with id: " + id);
		try {
			Shipping instance = entityManager.find(Shipping.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
