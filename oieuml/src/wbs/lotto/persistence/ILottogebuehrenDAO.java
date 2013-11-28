package wbs.lotto.persistence;

import java.util.List;

/**
 * Interface for LottogebuehrenDAO.
 * @author MyEclipse Persistence Tools
 */

public interface ILottogebuehrenDAO {
		/**
	 Perform an initial save of a previously unsaved Lottogebuehren entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   ILottogebuehrenDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Lottogebuehren entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(Lottogebuehren entity);
    /**
	 Delete a persistent Lottogebuehren entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   ILottogebuehrenDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity Lottogebuehren entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(Lottogebuehren entity);
   /**
	 Persist a previously saved Lottogebuehren entity and return it or a copy of it to the sender. 
	 A copy of the Lottogebuehren entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = ILottogebuehrenDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Lottogebuehren entity to update
	 @return Lottogebuehren the persisted Lottogebuehren entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public Lottogebuehren update(Lottogebuehren entity);
	public Lottogebuehren findById( Long id);
	 /**
	 * Find all Lottogebuehren entities with a specific property value.  
	 
	  @param propertyName the name of the Lottogebuehren property to query
	  @param value the property value to match
	  	  @return List<Lottogebuehren> found by query
	 */
	public List<Lottogebuehren> findByProperty(String propertyName, Object value
		);
	/**
	 * Find all Lottogebuehren entities.
	  	  @return List<Lottogebuehren> all Lottogebuehren entities
	 */
	public List<Lottogebuehren> findAll(
		);	
}