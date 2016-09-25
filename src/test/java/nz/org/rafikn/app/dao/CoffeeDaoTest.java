package nz.org.rafikn.app.dao;

import nz.org.rafikn.app.utils.TestUtils;

/**
 * Created by rafik on 25/09/16.
 */
public class CoffeeDaoTest {

    private CoffeeDao coffeeDao;

    public CoffeeDaoTest() {
        coffeeDao = TestUtils.getInjector().getInstance(CoffeeDao.class);
    }



}
