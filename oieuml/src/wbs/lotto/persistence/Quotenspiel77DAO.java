package wbs.lotto.persistence;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * Quotenspiel77 entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see wbs.lotto.persistence.Quotenspiel77
 * @author MyEclipse Persistence Tools
 */
public class Quotenspiel77DAO implements IQuotenspiel77DAO {

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved Quotenspiel77 entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * Quotenspiel77DAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Quotenspiel77 entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Quotenspiel77 entity) {
		EntityManagerHelper.log("saving Quotenspiel77 instance", Level.INFO,
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
	 * Delete a persistent Quotenspiel77 entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * Quotenspiel77DAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Quotenspiel77 entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Quotenspiel77 entity) {
		EntityManagerHelper.log("deleting Quotenspiel77 instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(Quotenspiel77.class,
					entity.getIdQuotenSpiel77());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Quotenspiel77 entity and return it or a copy
	 * of it to the sender. A copy of the Quotenspiel77 entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = Quotenspiel77DAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Quotenspiel77 entity to update
	 * @return Quotenspiel77 the persisted Quotenspiel77 entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Quotenspiel77 update(Quotenspiel77 entity) {
		EntityManagerHelper.log("updating Quotenspiel77 instance", Level.INFO,
				null);
		try {
			Quotenspiel77 result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Quotenspiel77 findById(Long id) {
		EntityManagerHelper.log(
				"finding Quotenspiel77 instance with id: " + id, Level.INFO,
				null);
		try {
			Quotenspiel77 instance = getEntityManager().find(
					Quotenspiel77.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Quotenspiel77 entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Quotenspiel77 property to query
	 * @param value
	 *            the property value to match
	 * @return List<Quotenspiel77> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Quotenspiel77> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding Quotenspiel77 instance with property: " + propertyName
						+ ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Quotenspiel77 model where model."
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
	 * Find all Quotenspiel77 entities.
	 * 
	 * @return List<Quotenspiel77> all Quotenspiel77 entities
	 */
	@SuppressWarnings("unchecked")
	public List<Quotenspiel77> findAll() {
		EntityManagerHelper.log("finding all Quotenspiel77 instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from Quotenspiel77 model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}