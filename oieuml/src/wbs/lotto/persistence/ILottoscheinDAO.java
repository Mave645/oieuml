package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for LottoscheinDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ILottoscheinDAO {
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
	 * ILottoscheinDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoschein entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Lottoschein entity);

	/**
	 * Delete a persistent Lottoschein entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ILottoscheinDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Lottoschein entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Lottoschein entity);

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
	 * entity = ILottoscheinDAO.update(entity);
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
	public Lottoschein update(Lottoschein entity);

	public Lottoschein findById(Long id);

	/**
	 * Find all Lottoschein entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Lottoschein property to query
	 * @param value
	 *            the property value to match
	 * @return List<Lottoschein> found by query
	 */
	public List<Lottoschein> findByProperty(String propertyName, Object value);

	/**
	 * Find all Lottoschein entities.
	 * 
	 * @return List<Lottoschein> all Lottoschein entities
	 */
	public List<Lottoschein> findAll();
}