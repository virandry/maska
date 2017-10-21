// default package
// Generated Oct 21, 2017 10:46:31 AM by Hibernate Tools 5.2.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Userauth.
 * @see .Userauth
 * @author Hibernate Tools
 */
@Stateless
public class UserauthHome {

	private static final Log log = LogFactory.getLog(UserauthHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Userauth transientInstance) {
		log.debug("persisting Userauth instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Userauth persistentInstance) {
		log.debug("removing Userauth instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Userauth merge(Userauth detachedInstance) {
		log.debug("merging Userauth instance");
		try {
			Userauth result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Userauth findById(int id) {
		log.debug("getting Userauth instance with id: " + id);
		try {
			Userauth instance = entityManager.find(Userauth.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
