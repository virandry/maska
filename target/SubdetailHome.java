// default package
// Generated Oct 21, 2017 10:46:31 AM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Subdetail.
 * @see .Subdetail
 * @author Hibernate Tools
 */
@Stateless
public class SubdetailHome {

	private static final Log log = LogFactory.getLog(SubdetailHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Subdetail transientInstance) {
		log.debug("persisting Subdetail instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Subdetail persistentInstance) {
		log.debug("removing Subdetail instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Subdetail merge(Subdetail detachedInstance) {
		log.debug("merging Subdetail instance");
		try {
			Subdetail result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Subdetail findById(String id) {
		log.debug("getting Subdetail instance with id: " + id);
		try {
			Subdetail instance = entityManager.find(Subdetail.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
