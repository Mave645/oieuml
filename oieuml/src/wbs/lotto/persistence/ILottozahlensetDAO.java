package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for LottozahlensetDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ILottozahlensetDAO {
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
	 * ILottozahlensetDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Lottozahlenset entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Lottozahlenset entity);

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
	 * ILottozahlensetDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Lottozahlenset entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Lottozahlenset entity);

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
	 * entity = ILottozahlensetDAO.update(entity);
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
	public Lottozahlenset update(Lottozahlenset entity);

	public Lottozahlenset findById(Long id);

	/**
	 * Find all Lottozahlenset entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Lottozahlenset property to query
	 * @param value
	 *            the property value to match
	 * @return List<Lottozahlenset> found by query
	 */
	public List<Lottozahlenset> findByProperty(String propertyName, Object value);

	/**
	 * Find all Lottozahlenset entities.
	 * 
	 * @return List<Lottozahlenset> all Lottozahlenset entities
	 */
	public List<Lottozahlenset> findAll();
}