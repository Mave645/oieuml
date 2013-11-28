package wbs.lotto.persistence;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * Lottoeinsatz entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see wbs.lotto.persistence.Lottoeinsatz
 * @author MyEclipse Persistence Tools
 */
public class LottoeinsatzDAO implements ILottoeinsatzDAO {

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved Lottoeinsatz entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LottoeinsatzDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoeinsatz entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Lottoeinsatz entity) {
		EntityManagerHelper.log("saving Lottoeinsatz instance", Level.INFO,
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
	 * Delete a persistent Lottoeinsatz entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LottoeinsatzDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoeinsatz entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Lottoeinsatz entity) {
		EntityManagerHelper.log("deleting Lottoeinsatz instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(Lottoeinsatz.class,
					entity.getIdLottoEinsatz());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Lottoeinsatz entity and return it or a copy of
	 * it to the sender. A copy of the Lottoeinsatz entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = LottoeinsatzDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoeinsatz entity to update
	 * @return Lottoeinsatz the persisted Lottoeinsatz entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Lottoeinsatz update(Lottoeinsatz entity) {
		EntityManagerHelper.log("updating Lottoeinsatz instance", Level.INFO,
				null);
		try {
			Lottoeinsatz result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Lottoeinsatz findById(Long id) {
		EntityManagerHelper.log("finding Lottoeinsatz instance with id: " + id,
				Level.INFO, null);
		try {
			Lottoeinsatz instance = getEntityManager().find(Lottoeinsatz.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Lottoeinsatz entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Lottoeinsatz property to query
	 * @param value
	 *            the property value to match
	 * @return List<Lottoeinsatz> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Lottoeinsatz> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log("finding Lottoeinsatz instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Lottoeinsatz model where model."
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
	 * Find all Lottoeinsatz entities.
	 * 
	 * @return List<Lottoeinsatz> all Lottoeinsatz entities
	 */
	@SuppressWarnings("unchecked")
	public List<Lottoeinsatz> findAll() {
		EntityManagerHelper.log("finding all Lottoeinsatz instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from Lottoeinsatz model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}