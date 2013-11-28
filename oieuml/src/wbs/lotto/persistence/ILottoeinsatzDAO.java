package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for LottoeinsatzDAO.
 * @author MyEclipse Persistence Tools
 */

public interface ILottoeinsatzDAO {
		/**
	 Perform an initial save of a previously unsaved Lottoeinsatz entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   ILottoeinsatzDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Lottoeinsatz entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(Lottoeinsatz entity);
    /**
	 Delete a persistent Lottoeinsatz entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   ILottoeinsatzDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity Lottoeinsatz entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(Lottoeinsatz entity);
   /**
	 Persist a previously saved Lottoeinsatz entity and return it or a copy of it to the sender. 
	 A copy of the Lottoeinsatz entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = ILottoeinsatzDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Lottoeinsatz entity to update
	 @return Lottoeinsatz the persisted Lottoeinsatz entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public Lottoeinsatz update(Lottoeinsatz entity);
	public Lottoeinsatz findById( Long id);
	 /**
	 * Find all Lottoeinsatz entities with a specific property value.  
	 
	  @param propertyName the name of the Lottoeinsatz property to query
	  @param value the property value to match
	  	  @return List<Lottoeinsatz> found by query
	 */
	public List<Lottoeinsatz> findByProperty(String propertyName, Object value
		);
	/**
	 * Find all Lottoeinsatz entities.
	  	  @return List<Lottoeinsatz> all Lottoeinsatz entities
	 */
	public List<Lottoeinsatz> findAll(
		);	
}