package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for Gewinnespiel77DAO.
 * @author MyEclipse Persistence Tools
 */

public interface IGewinnespiel77DAO {
		/**
	 Perform an initial save of a previously unsaved Gewinnespiel77 entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   IGewinnespiel77DAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Gewinnespiel77 entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(Gewinnespiel77 entity);
    /**
	 Delete a persistent Gewinnespiel77 entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   IGewinnespiel77DAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity Gewinnespiel77 entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(Gewinnespiel77 entity);
   /**
	 Persist a previously saved Gewinnespiel77 entity and return it or a copy of it to the sender. 
	 A copy of the Gewinnespiel77 entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = IGewinnespiel77DAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Gewinnespiel77 entity to update
	 @return Gewinnespiel77 the persisted Gewinnespiel77 entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public Gewinnespiel77 update(Gewinnespiel77 entity);
	public Gewinnespiel77 findById( Long id);
	 /**
	 * Find all Gewinnespiel77 entities with a specific property value.  
	 
	  @param propertyName the name of the Gewinnespiel77 property to query
	  @param value the property value to match
	  	  @return List<Gewinnespiel77> found by query
	 */
	public List<Gewinnespiel77> findByProperty(String propertyName, Object value
		);
	/**
	 * Find all Gewinnespiel77 entities.
	  	  @return List<Gewinnespiel77> all Gewinnespiel77 entities
	 */
	public List<Gewinnespiel77> findAll(
		);	
}