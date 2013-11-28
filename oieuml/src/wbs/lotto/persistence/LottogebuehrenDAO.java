package wbs.lotto.persistence;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 	* A data access object (DAO) providing persistence and search support for Lottogebuehren entities.
 	 		* Transaction control of the save(), update() and delete() operations must be handled externally by senders of these methods 
 		  or must be manually added to each of these methods for data to be persisted to the JPA datastore.	
 	 * @see wbs.lotto.persistence.Lottogebuehren
  * @author MyEclipse Persistence Tools 
 */
public class LottogebuehrenDAO  implements ILottogebuehrenDAO{




	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}	
	
		/**
	 Perform an initial save of a previously unsaved Lottogebuehren entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   LottogebuehrenDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Lottogebuehren entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(Lottogebuehren entity) {
    				EntityManagerHelper.log("saving Lottogebuehren instance", Level.INFO, null);
	        try {
            getEntityManager().persist(entity);
            			EntityManagerHelper.log("save successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("save failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Delete a persistent Lottogebuehren entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   LottogebuehrenDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity Lottogebuehren entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(Lottogebuehren entity) {
    				EntityManagerHelper.log("deleting Lottogebuehren instance", Level.INFO, null);
	        try {
        	entity = getEntityManager().getReference(Lottogebuehren.class, entity.getIdLottoGebuehren());
            getEntityManager().remove(entity);
            			EntityManagerHelper.log("delete successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("delete failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Persist a previously saved Lottogebuehren entity and return it or a copy of it to the sender. 
	 A copy of the Lottogebuehren entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = LottogebuehrenDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity Lottogebuehren entity to update
	 @return Lottogebuehren the persisted Lottogebuehren entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
    public Lottogebuehren update(Lottogebuehren entity) {
    				EntityManagerHelper.log("updating Lottogebuehren instance", Level.INFO, null);
	        try {
            Lottogebuehren result = getEntityManager().merge(entity);
            			EntityManagerHelper.log("update successful", Level.INFO, null);
	            return result;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("update failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    public Lottogebuehren findById( Long id) {
    				EntityManagerHelper.log("finding Lottogebuehren instance with id: " + id, Level.INFO, null);
	        try {
            Lottogebuehren instance = getEntityManager().find(Lottogebuehren.class, id);
            return instance;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("find failed", Level.SEVERE, re);
	            throw re;
        }
    }    
    

/**
	 * Find all Lottogebuehren entities with a specific property value.  
	 
	  @param propertyName the name of the Lottogebuehren property to query
	  @param value the property value to match
	  	  @return List<Lottogebuehren> found by query
	 */
    @SuppressWarnings("unchecked")
    public List<Lottogebuehren> findByProperty(String propertyName, final Object value
        ) {
    				EntityManagerHelper.log("finding Lottogebuehren instance with property: " + propertyName + ", value: " + value, Level.INFO, null);
			try {
			final String queryString = "select model from Lottogebuehren model where model." 
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
	 * Find all Lottogebuehren entities.
	  	  @return List<Lottogebuehren> all Lottogebuehren entities
	 */
	@SuppressWarnings("unchecked")
	public List<Lottogebuehren> findAll(
		) {
					EntityManagerHelper.log("finding all Lottogebuehren instances", Level.INFO, null);
			try {
			final String queryString = "select model from Lottogebuehren model";
								Query query = getEntityManager().createQuery(queryString);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find all failed", Level.SEVERE, re);
				throw re;
		}
	}
	
}