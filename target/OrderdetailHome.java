// default package
// Generated Oct 21, 2017 10:46:31 AM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Orderdetail.
 * @see .Orderdetail
 * @author Hibernate Tools
 */
@Stateless
public class OrderdetailHome {

	private static final Log log = LogFactory.getLog(OrderdetailHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Orderdetail transientInstance) {
		log.debug("persisting Orderdetail instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Orderdetail persistentInstance) {
		log.debug("removing Orderdetail instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Orderdetail merge(Orderdetail detachedInstance) {
		log.debug("merging Orderdetail instance");
		try {
			Orderdetail result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Orderdetail findById(Integer id) {
		log.debug("getting Orderdetail instance with id: " + id);
		try {
			Orderdetail instance = entityManager.find(Orderdetail.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
