package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for Quoten6aus49DAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IQuoten6aus49DAO {
	/**
	 * Perform an initial save of a previously unsaved Quoten6aus49 entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IQuoten6aus49DAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Quoten6aus49 entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Quoten6aus49 entity);

	/**
	 * Delete a persistent Quoten6aus49 entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IQuoten6aus49DAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Quoten6aus49 entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Quoten6aus49 entity);

	/**
	 * Persist a previously saved Quoten6aus49 entity and return it or a copy of
	 * it to the sender. A copy of the Quoten6aus49 entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IQuoten6aus49DAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Quoten6aus49 entity to update
	 * @return Quoten6aus49 the persisted Quoten6aus49 entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Quoten6aus49 update(Quoten6aus49 entity);

	public Quoten6aus49 findById(Long id);

	/**
	 * Find all Quoten6aus49 entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Quoten6aus49 property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Quoten6aus49> found by query
	 */
	public List<Quoten6aus49> findByProperty(String propertyName, Object value,
			int... rowStartIdxAndCount);

	public List<Quoten6aus49> findByGewinnKlasse(Object gewinnKlasse,
			int... rowStartIdxAndCount);

	public List<Quoten6aus49> findByGewinne(Object gewinne,
			int... rowStartIdxAndCount);

	public List<Quoten6aus49> findByQuoten(Object quoten,
			int... rowStartIdxAndCount);

	/**
	 * Find all Quoten6aus49 entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Quoten6aus49> all Quoten6aus49 entities
	 */
	public List<Quoten6aus49> findAll(int... rowStartIdxAndCount);
}