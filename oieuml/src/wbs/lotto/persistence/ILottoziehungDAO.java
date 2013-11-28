package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for LottoziehungDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ILottoziehungDAO {
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
	 * ILottoziehungDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoziehung entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Lottoziehung entity);

	/**
	 * Delete a persistent Lottoziehung entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ILottoziehungDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoziehung entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Lottoziehung entity);

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
	 * entity = ILottoziehungDAO.update(entity);
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
	public Lottoziehung update(Lottoziehung entity);

	public Lottoziehung findById(Long id);

	/**
	 * Find all Lottoziehung entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Lottoziehung property to query
	 * @param value
	 *            the property value to match
	 * @return List<Lottoziehung> found by query
	 */
	public List<Lottoziehung> findByProperty(String propertyName, Object value);

	/**
	 * Find all Lottoziehung entities.
	 * 
	 * @return List<Lottoziehung> all Lottoziehung entities
	 */
	public List<Lottoziehung> findAll();
}