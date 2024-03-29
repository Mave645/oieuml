package wbs.lotto.persistence;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 	* A data access object (DAO) providing persistence and search support for Gewinnespiel77 entities.
 	 		* Transaction control of the save(), update() and delete() operations must be handled externally by senders of these methods 
 		  or must be manually added to each of these methods for data to be persisted to the JPA datastore.	
 	 * @see wbs.lotto.persistence.Gewinnespiel77
  * @author MyEclipse Persistence Tools 
 */
public class Gewinnespiel77DAO  implements IGewinnespiel77DAO{




	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}	
	
		/**
	 Perform an initial save of a previously unsaved Gewinnespiel77 entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   Gewinnespiel77DAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Gewinnespiel77 entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(Gewinnespiel77 entity) {
    				EntityManagerHelper.log("saving Gewinnespiel77 instance", Level.INFO, null);
	        try {
            getEntityManager().persist(entity);
            			EntityManagerHelper.log("save successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("save failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Delete a persistent Gewinnespiel77 entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   Gewinnespiel77DAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity Gewinnespiel77 entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(Gewinnespiel77 entity) {
    				EntityManagerHelper.log("deleting Gewinnespiel77 instance", Level.INFO, null);
	        try {
        	entity = getEntityManager().getReference(Gewinnespiel77.class, entity.getIdGewinneSpiel77());
            getEntityManager().remove(entity);
            			EntityManagerHelper.log("delete successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("delete failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Persist a previously saved Gewinnespiel77 entity and return it or a copy of it to the sender. 
	 A copy of the Gewinnespiel77 entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = Gewinnespiel77DAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Gewinnespiel77 entity to update
	 @return Gewinnespiel77 the persisted Gewinnespiel77 entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
    public Gewinnespiel77 update(Gewinnespiel77 entity) {
    				EntityManagerHelper.log("updating Gewinnespiel77 instance", Level.INFO, null);
	        try {
            Gewinnespiel77 result = getEntityManager().merge(entity);
            			EntityManagerHelper.log("update successful", Level.INFO, null);
	            return result;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("update failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    public Gewinnespiel77 findById( Long id) {
    				EntityManagerHelper.log("finding Gewinnespiel77 instance with id: " + id, Level.INFO, null);
	        try {
            Gewinnespiel77 instance = getEntityManager().find(Gewinnespiel77.class, id);
            return instance;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("find failed", Level.SEVERE, re);
	            throw re;
        }
    }    
    

/**
	 * Find all Gewinnespiel77 entities with a specific property value.  
	 
	  @param propertyName the name of the Gewinnespiel77 property to query
	  @param value the property value to match
	  	  @return List<Gewinnespiel77> found by query
	 */
    @SuppressWarnings("unchecked")
    public List<Gewinnespiel77> findByProperty(String propertyName, final Object value
        ) {
    				EntityManagerHelper.log("finding Gewinnespiel77 instance with property: " + propertyName + ", value: " + value, Level.INFO, null);
			try {
			final String queryString = "select model from Gewinnespiel77 model where model." 
			 						+ propertyName + "= :propertyValue";
								Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
				throw re;
		}
	}			
	
	/**
	 * Find all Gewinnespiel77 entities.
	  	  @return List<Gewinnespiel77> all Gewinnespiel77 entities
	 */
	@SuppressWarnings("unchecked")
	public List<Gewinnespiel77> findAll(
		) {
					EntityManagerHelper.log("finding all Gewinnespiel77 instances", Level.INFO, null);
			try {
			final String queryString = "select model from Gewinnespiel77 model";
								Query query = getEntityManager().createQuery(queryString);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find all failed", Level.SEVERE, re);
				throw re;
		}
	}
	
}