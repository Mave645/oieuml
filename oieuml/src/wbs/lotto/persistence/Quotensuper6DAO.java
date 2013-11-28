package wbs.lotto.persistence;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * Quotensuper6 entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see wbs.lotto.persistence.Quotensuper6
 * @author MyEclipse Persistence Tools
 */
public class Quotensuper6DAO implements IQuotensuper6DAO {

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved Quotensuper6 entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * Quotensuper6DAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Quotensuper6 entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Quotensuper6 entity) {
		EntityManagerHelper.log("saving Quotensuper6 instance", Level.INFO,
				null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Quotensuper6 entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * Quotensuper6DAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Quotensuper6 entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Quotensuper6 entity) {
		EntityManagerHelper.log("deleting Quotensuper6 instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(Quotensuper6.class,
					entity.getIdQuotenSuper6());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Quotensuper6 entity and return it or a copy of
	 * it to the sender. A copy of the Quotensuper6 entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = Quotensuper6DAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Quotensuper6 entity to update
	 * @return Quotensuper6 the persisted Quotensuper6 entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Quotensuper6 update(Quotensuper6 entity) {
		EntityManagerHelper.log("updating Quotensuper6 instance", Level.INFO,
				null);
		try {
			Quotensuper6 result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Quotensuper6 findById(Long id) {
		EntityManagerHelper.log("finding Quotensuper6 instance with id: " + id,
				Level.INFO, null);
		try {
			Quotensuper6 instance = getEntityManager().find(Quotensuper6.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Quotensuper6 entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Quotensuper6 property to query
	 * @param value
	 *            the property value to match
	 * @return List<Quotensuper6> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Quotensuper6> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log("finding Quotensuper6 instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Quotensuper6 model where model."
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
	 * Find all Quotensuper6 entities.
	 * 
	 * @return List<Quotensuper6> all Quotensuper6 entities
	 */
	@SuppressWarnings("unchecked")
	public List<Quotensuper6> findAll() {
		EntityManagerHelper.log("finding all Quotensuper6 instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from Quotensuper6 model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}