package nz.org.rafikn.app.guice;

import com.google.inject.AbstractModule;
import com.google.inject.persist.jpa.JpaPersistModule;
import nz.org.rafikn.app.dao.CoffeeDao;
import nz.org.rafikn.app.dao.CountryDao;
import nz.org.rafikn.app.dao.impl.CoffeeDaoImpl;
import nz.org.rafikn.app.dao.impl.CountryDaoImpl;
import nz.org.rafikn.app.services.CoffeeService;
import nz.org.rafikn.app.services.impl.CoffeeServiceImpl;

import java.util.Map;

/**
 * Created by rafik on 24/09/16.
 */
public class AppModule extends AbstractModule {

    private final String persistanceUnit;
    private final Map<?,?> persistanceProperties;

    public AppModule(String persistanceUnit, Map<?,?> persistanceProperties) {
        this.persistanceUnit = persistanceUnit;
        this.persistanceProperties = persistanceProperties;
    }

    @Override
    protected void configure() {
        JpaPersistModule jpaModule = new JpaPersistModule(persistanceUnit);
        jpaModule.properties(persistanceProperties);

        install(jpaModule);

        bindDaos();
        bindServices();
    }

    private void bindDaos() {
        bind(CoffeeDao.class).to(CoffeeDaoImpl.class);
        bind(CountryDao.class).to(CountryDaoImpl.class);
    }

    private void bindServices() {
        bind(CoffeeService.class).to(CoffeeServiceImpl.class);
    }
}
