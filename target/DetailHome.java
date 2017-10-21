// default package
// Generated Oct 21, 2017 10:46:31 AM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Detail.
 * @see .Detail
 * @author Hibernate Tools
 */
@Stateless
public class DetailHome {

	private static final Log log = LogFactory.getLog(DetailHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Detail transientInstance) {
		log.debug("persisting Detail instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Detail persistentInstance) {
		log.debug("removing Detail instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Detail merge(Detail detachedInstance) {
		log.debug("merging Detail instance");
		try {
			Detail result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Detail findById(String id) {
		log.debug("getting Detail instance with id: " + id);
		try {
			Detail instance = entityManager.find(Detail.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
