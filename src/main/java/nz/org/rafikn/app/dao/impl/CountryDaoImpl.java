package nz.org.rafikn.app.dao.impl;

import nz.org.rafikn.app.dao.CountryDao;
import nz.org.rafikn.app.model.Country;

/**
 * Created by rafik on 25/09/16.
 */
public class CountryDaoImpl extends AbstractDao<Country> implements CountryDao {

    public CountryDaoImpl() {
        super(Country.class);
    }

    @Override
    public Country get(int id) {
        return find(id);
    }

    @Override
    public void add(Country country) {
        put(country);
    }

}
