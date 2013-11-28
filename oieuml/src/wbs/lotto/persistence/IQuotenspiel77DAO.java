package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for Quotenspiel77DAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IQuotenspiel77DAO {
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
	 * IQuotenspiel77DAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Quotenspiel77 entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Quotenspiel77 entity);

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
	 * IQuotenspiel77DAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Quotenspiel77 entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Quotenspiel77 entity);

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
	 * entity = IQuotenspiel77DAO.update(entity);
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
	public Quotenspiel77 update(Quotenspiel77 entity);

	public Quotenspiel77 findById(Long id);

	/**
	 * Find all Quotenspiel77 entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Quotenspiel77 property to query
	 * @param value
	 *            the property value to match
	 * @return List<Quotenspiel77> found by query
	 */
	public List<Quotenspiel77> findByProperty(String propertyName, Object value);

	/**
	 * Find all Quotenspiel77 entities.
	 * 
	 * @return List<Quotenspiel77> all Quotenspiel77 entities
	 */
	public List<Quotenspiel77> findAll();
}