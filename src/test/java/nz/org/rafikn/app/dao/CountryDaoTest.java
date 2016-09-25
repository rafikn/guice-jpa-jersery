package nz.org.rafikn.app.dao;

import com.google.inject.Injector;
import com.google.inject.persist.PersistService;
import nz.org.rafikn.app.model.Country;
import nz.org.rafikn.app.utils.TestUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * Created by rafik on 25/09/16.
 */
public class CountryDaoTest {

    private static Injector injector = TestUtils.getInjector();

    private CountryDao countryDao;

    public CountryDaoTest() {
        countryDao = injector.getInstance(CountryDao.class);
    }

    @BeforeClass
    public static void setupBeforeClass() {
        PersistService persistService = injector.getInstance(PersistService.class);
        persistService.start();
    }

    @Test
    public void testAddThenFind() {
        Country country = new Country();
        country.setName("New Zealand");

        countryDao.add(country);
        Country dbCountry = countryDao.get(1);
        assertNotNull("Country must not be null", dbCountry);
        assertEquals("Country name must be \"New Zealand\"", dbCountry.getName(), "New Zealand");
    }


    @AfterClass
    public static void tearDownBeforeClass() {
        PersistService persistService = injector.getInstance(PersistService.class);
        persistService.stop();
    }
}
