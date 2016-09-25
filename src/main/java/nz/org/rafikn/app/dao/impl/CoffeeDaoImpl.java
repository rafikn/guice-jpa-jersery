package nz.org.rafikn.app.dao.impl;

import nz.org.rafikn.app.dao.CoffeeDao;
import nz.org.rafikn.app.model.Coffee;

/**
 * Created by rafik on 24/09/16.
 */
public class CoffeeDaoImpl extends AbstractDao<Coffee> implements CoffeeDao {

    public CoffeeDaoImpl() {
        super(Coffee.class);
    }

    @Override
    public Coffee get(Object id) {
        return find(id);
    }

    @Override
    public void add(Coffee coffee) {
        put(coffee);
    }
}
