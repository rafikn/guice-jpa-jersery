package nz.org.rafikn.app.dao.impl;

import com.google.inject.persist.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * Created by rafik on 24/09/16.
 */
public abstract class AbstractDao<T> {

    @Inject
    protected EntityManager em;

    protected Class<T> entityClass;

    protected EntityManager getEntityManager() {
        return this.em;
    }

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public T find(Object id) {
        return em.find(entityClass, id);
    }

    @Transactional
    public void put(T entity) {
        getEntityManager().persist(entity);
    }

    @Transactional
    public void update(T entity) {
        getEntityManager().merge(entity);
    }

    @Transactional
    public void delete(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    @Transactional
    public void deleteById(Object id) {
        T entity = find(id);

        if (entity != null)
            delete(entity);
    }

}