package wbs.lotto.persistence;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * Verteilungsschluessel6aus49 entities. Transaction control of the save(),
 * update() and delete() operations must be handled externally by senders of
 * these methods or must be manually added to each of these methods for data to
 * be persisted to the JPA datastore.
 * 
 * @see wbs.lotto.persistence.Verteilungsschluessel6aus49
 * @author MyEclipse Persistence Tools
 */
public class Verteilungsschluessel6aus49DAO implements
		IVerteilungsschluessel6aus49DAO {

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved
	 * Verteilungsschluessel6aus49 entity. All subsequent persist actions of
	 * this entity should use the #update() method. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * Verteilungsschluessel6aus49DAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Verteilungsschluessel6aus49 entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Verteilungsschluessel6aus49 entity) {
		EntityManagerHelper.log("saving Verteilungsschluessel6aus49 instance",
				Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Verteilungsschluessel6aus49 entity. This operation
	 * must be performed within the a database transaction context for the
	 * entity's data to be permanently deleted from the persistence store, i.e.,
	 * database. This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * Verteilungsschluessel6aus49DAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Verteilungsschluessel6aus49 entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Verteilungsschluessel6aus49 entity) {
		EntityManagerHelper.log(
				"deleting Verteilungsschluessel6aus49 instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(
					Verteilungsschluessel6aus49.class,
					entity.getIdVerteilungsSchluessel6aus49());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Verteilungsschluessel6aus49 entity and return
	 * it or a copy of it to the sender. A copy of the
	 * Verteilungsschluessel6aus49 entity parameter is returned when the JPA
	 * persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = Verteilungsschluessel6aus49DAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Verteilungsschluessel6aus49 entity to update
	 * @return Verteilungsschluessel6aus49 the persisted
	 *         Verteilungsschluessel6aus49 entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Verteilungsschluessel6aus49 update(Verteilungsschluessel6aus49 entity) {
		EntityManagerHelper.log(
				"updating Verteilungsschluessel6aus49 instance", Level.INFO,
				null);
		try {
			Verteilungsschluessel6aus49 result = getEntityManager().merge(
					entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Verteilungsschluessel6aus49 findById(Long id) {
		EntityManagerHelper.log(
				"finding Verteilungsschluessel6aus49 instance with id: " + id,
				Level.INFO, null);
		try {
			Verteilungsschluessel6aus49 instance = getEntityManager().find(
					Verteilungsschluessel6aus49.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Verteilungsschluessel6aus49 entities with a specific property
	 * value.
	 * 
	 * @param propertyName
	 *            the name of the Verteilungsschluessel6aus49 property to query
	 * @param value
	 *            the property value to match
	 * @return List<Verteilungsschluessel6aus49> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Verteilungsschluessel6aus49> findByProperty(
			String propertyName, final Object value) {
		EntityManagerHelper.log(
				"finding Verteilungsschluessel6aus49 instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Verteilungsschluessel6aus49 model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Verteilungsschluessel6aus49 entities.
	 * 
	 * @return List<Verteilungsschluessel6aus49> all Verteilungsschluessel6aus49
	 *         entities
	 */
	@SuppressWarnings("unchecked")
	public List<Verteilungsschluessel6aus49> findAll() {
		EntityManagerHelper.log(
				"finding all Verteilungsschluessel6aus49 instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from Verteilungsschluessel6aus49 model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}