package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for Verteilungsschluessel6aus49DAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IVerteilungsschluessel6aus49DAO {
	/**
	 * Perform an initial save of a previously unsaved
	 * Verteilungsschluessel6aus49 entity. All subsequent persist actions of
	 * this entity should use the #update() method. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IVerteilungsschluessel6aus49DAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Verteilungsschluessel6aus49 entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Verteilungsschluessel6aus49 entity);

	/**
	 * Delete a persistent Verteilungsschluessel6aus49 entity. This operation
	 * must be performed within the a database transaction context for the
	 * entity's data to be permanently deleted from the persistence store, i.e.,
	 * database. This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IVerteilungsschluessel6aus49DAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Verteilungsschluessel6aus49 entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Verteilungsschluessel6aus49 entity);

	/**
	 * Persist a previously saved Verteilungsschluessel6aus49 entity and return
	 * it or a copy of it to the sender. A copy of the
	 * Verteilungsschluessel6aus49 entity parameter is returned when the JPA
	 * persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IVerteilungsschluessel6aus49DAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Verteilungsschluessel6aus49 entity to update
	 * @return Verteilungsschluessel6aus49 the persisted
	 *         Verteilungsschluessel6aus49 entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Verteilungsschluessel6aus49 update(Verteilungsschluessel6aus49 entity);

	public Verteilungsschluessel6aus49 findById(Long id);

	/**
	 * Find all Verteilungsschluessel6aus49 entities with a specific property
	 * value.
	 * 
	 * @param propertyName
	 *            the name of the Verteilungsschluessel6aus49 property to query
	 * @param value
	 *            the property value to match
	 * @return List<Verteilungsschluessel6aus49> found by query
	 */
	public List<Verteilungsschluessel6aus49> findByProperty(
			String propertyName, Object value);

	/**
	 * Find all Verteilungsschluessel6aus49 entities.
	 * 
	 * @return List<Verteilungsschluessel6aus49> all Verteilungsschluessel6aus49
	 *         entities
	 */
	public List<Verteilungsschluessel6aus49> findAll();
}