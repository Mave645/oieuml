package wbs.lotto.persistence;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * Lottozahlenset entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see wbs.lotto.persistence.Lottozahlenset
 * @author MyEclipse Persistence Tools
 */
public class LottozahlensetDAO implements ILottozahlensetDAO {

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved Lottozahlenset entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LottozahlensetDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottozahlenset entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Lottozahlenset entity) {
		EntityManagerHelper.log("saving Lottozahlenset instance", Level.INFO,
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
	 * Delete a persistent Lottozahlenset entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LottozahlensetDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Lottozahlenset entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Lottozahlenset entity) {
		EntityManagerHelper.log("deleting Lottozahlenset instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(Lottozahlenset.class,
					entity.getIdLottoZahlenSet());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Lottozahlenset entity and return it or a copy
	 * of it to the sender. A copy of the Lottozahlenset entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = LottozahlensetDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottozahlenset entity to update
	 * @return Lottozahlenset the persisted Lottozahlenset entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Lottozahlenset update(Lottozahlenset entity) {
		EntityManagerHelper.log("updating Lottozahlenset instance", Level.INFO,
				null);
		try {
			Lottozahlenset result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Lottozahlenset findById(Long id) {
		EntityManagerHelper.log("finding Lottozahlenset instance with id: "
				+ id, Level.INFO, null);
		try {
			Lottozahlenset instance = getEntityManager().find(
					Lottozahlenset.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Lottozahlenset entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Lottozahlenset property to query
	 * @param value
	 *            the property value to match
	 * @return List<Lottozahlenset> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Lottozahlenset> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding Lottozahlenset instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Lottozahlenset model where model."
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
	 * Find all Lottozahlenset entities.
	 * 
	 * @return List<Lottozahlenset> all Lottozahlenset entities
	 */
	@SuppressWarnings("unchecked")
	public List<Lottozahlenset> findAll() {
		EntityManagerHelper.log("finding all Lottozahlenset instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from Lottozahlenset model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}