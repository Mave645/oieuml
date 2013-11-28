package wbs.lotto.persistence;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * Lottoschein entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see wbs.lotto.persistence.Lottoschein
 * @author MyEclipse Persistence Tools
 */
public class LottoscheinDAO implements ILottoscheinDAO {

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved Lottoschein entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LottoscheinDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoschein entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Lottoschein entity) {
		EntityManagerHelper
				.log("saving Lottoschein instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent Lottoschein entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LottoscheinDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoschein entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Lottoschein entity) {
		EntityManagerHelper.log("deleting Lottoschein instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(Lottoschein.class,
					entity.getIdLottoSchein());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved Lottoschein entity and return it or a copy of
	 * it to the sender. A copy of the Lottoschein entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = LottoscheinDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoschein entity to update
	 * @return Lottoschein the persisted Lottoschein entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Lottoschein update(Lottoschein entity) {
		EntityManagerHelper.log("updating Lottoschein instance", Level.INFO,
				null);
		try {
			Lottoschein result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Lottoschein findById(Long id) {
		EntityManagerHelper.log("finding Lottoschein instance with id: " + id,
				Level.INFO, null);
		try {
			Lottoschein instance = getEntityManager().find(Lottoschein.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all Lottoschein entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Lottoschein property to query
	 * @param value
	 *            the property value to match
	 * @return List<Lottoschein> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<Lottoschein> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log("finding Lottoschein instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from Lottoschein model where model."
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
	 * Find all Lottoschein entities.
	 * 
	 * @return List<Lottoschein> all Lottoschein entities
	 */
	@SuppressWarnings("unchecked")
	public List<Lottoschein> findAll() {
		EntityManagerHelper.log("finding all Lottoschein instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from Lottoschein model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}