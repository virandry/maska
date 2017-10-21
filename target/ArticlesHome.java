// default package
// Generated Oct 21, 2017 10:46:31 AM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Articles.
 * @see .Articles
 * @author Hibernate Tools
 */
@Stateless
public class ArticlesHome {

	private static final Log log = LogFactory.getLog(ArticlesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Articles transientInstance) {
		log.debug("persisting Articles instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Articles persistentInstance) {
		log.debug("removing Articles instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Articles merge(Articles detachedInstance) {
		log.debug("merging Articles instance");
		try {
			Articles result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Articles findById(Integer id) {
		log.debug("getting Articles instance with id: " + id);
		try {
			Articles instance = entityManager.find(Articles.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
