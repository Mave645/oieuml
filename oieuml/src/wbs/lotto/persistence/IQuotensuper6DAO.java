package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for Quotensuper6DAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IQuotensuper6DAO {
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
	 * IQuotensuper6DAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Quotensuper6 entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Quotensuper6 entity);

	/**
	 * Delete a persistent Quotensuper6 entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IQuotensuper6DAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Quotensuper6 entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Quotensuper6 entity);

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
	 * entity = IQuotensuper6DAO.update(entity);
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
	public Quotensuper6 update(Quotensuper6 entity);

	public Quotensuper6 findById(Long id);

	/**
	 * Find all Quotensuper6 entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Quotensuper6 property to query
	 * @param value
	 *            the property value to match
	 * @return List<Quotensuper6> found by query
	 */
	public List<Quotensuper6> findByProperty(String propertyName, Object value);

	/**
	 * Find all Quotensuper6 entities.
	 * 
	 * @return List<Quotensuper6> all Quotensuper6 entities
	 */
	public List<Quotensuper6> findAll();
}