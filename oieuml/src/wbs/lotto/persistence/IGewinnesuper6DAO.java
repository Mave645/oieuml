package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for Gewinnesuper6DAO.
 * @author MyEclipse Persistence Tools
 */

public interface IGewinnesuper6DAO {
		/**
	 Perform an initial save of a previously unsaved Gewinnesuper6 entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   IGewinnesuper6DAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Gewinnesuper6 entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(Gewinnesuper6 entity);
    /**
	 Delete a persistent Gewinnesuper6 entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   IGewinnesuper6DAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity Gewinnesuper6 entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(Gewinnesuper6 entity);
   /**
	 Persist a previously saved Gewinnesuper6 entity and return it or a copy of it to the sender. 
	 A copy of the Gewinnesuper6 entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = IGewinnesuper6DAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Gewinnesuper6 entity to update
	 @return Gewinnesuper6 the persisted Gewinnesuper6 entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public Gewinnesuper6 update(Gewinnesuper6 entity);
	public Gewinnesuper6 findById( Long id);
	 /**
	 * Find all Gewinnesuper6 entities with a specific property value.  
	 
	  @param propertyName the name of the Gewinnesuper6 property to query
	  @param value the property value to match
	  	  @return List<Gewinnesuper6> found by query
	 */
	public List<Gewinnesuper6> findByProperty(String propertyName, Object value
		);
	/**
	 * Find all Gewinnesuper6 entities.
	  	  @return List<Gewinnesuper6> all Gewinnesuper6 entities
	 */
	public List<Gewinnesuper6> findAll(
		);	
}