// default package
// Generated Oct 21, 2017 10:46:31 AM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Subcategory.
 * @see .Subcategory
 * @author Hibernate Tools
 */
@Stateless
public class SubcategoryHome {

	private static final Log log = LogFactory.getLog(SubcategoryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Subcategory transientInstance) {
		log.debug("persisting Subcategory instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Subcategory persistentInstance) {
		log.debug("removing Subcategory instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Subcategory merge(Subcategory detachedInstance) {
		log.debug("merging Subcategory instance");
		try {
			Subcategory result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Subcategory findById(String id) {
		log.debug("getting Subcategory instance with id: " + id);
		try {
			Subcategory instance = entityManager.find(Subcategory.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
