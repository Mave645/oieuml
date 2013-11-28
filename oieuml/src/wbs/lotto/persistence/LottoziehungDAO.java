package wbs.lotto.persistence;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * Lottoziehung entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see wbs.lotto.persistence.Lottoziehung
 * @author MyEclipse Persistence Tools
 */
public class LottoziehungDAO implements ILottoziehungDAO {

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved Lottoziehung entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LottoziehungDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoziehung entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Lottoziehung entity) {
		EntityManagerHelper.log("saving Lottoziehung instance", Level.INFO,
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
	 * Delete a persistent Lottoziehung entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LottoziehungDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoziehung entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Lottoziehung entity) {
		EntityManagerHelper.log("deleting Lottoziehung instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(Lottoziehung.class,
					entity.getIdLottoZiehung());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Lottoziehung entity and return it or a copy of
	 * it to the sender. A copy of the Lottoziehung entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = LottoziehungDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoziehung entity to update
	 * @return Lottoziehung the persisted Lottoziehung entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Lottoziehung update(Lottoziehung entity) {
		EntityManagerHelper.log("updating Lottoziehung instance", Level.INFO,
				null);
		try {
			Lottoziehung result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Lottoziehung findById(Long id) {
		EntityManagerHelper.log("finding Lottoziehung instance with id: " + id,
				Level.INFO, null);
		try {
			Lottoziehung instance = getEntityManager().find(Lottoziehung.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Lottoziehung entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Lottoziehung property to query
	 * @param value
	 *            the property value to match
	 * @return List<Lottoziehung> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Lottoziehung> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log("finding Lottoziehung instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Lottoziehung model where model."
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
	 * Find all Lottoziehung entities.
	 * 
	 * @return List<Lottoziehung> all Lottoziehung entities
	 */
	@SuppressWarnings("unchecked")
	public List<Lottoziehung> findAll() {
		EntityManagerHelper.log("finding all Lottoziehung instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from Lottoziehung model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}