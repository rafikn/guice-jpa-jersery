package nz.org.rafikn.app.utils;


import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import nz.org.rafikn.app.guice.AppModule;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rafik on 25/09/16.
 */
public class TestUtils {

    private static final String TEST_PERSISTENCE_UNIT_NAME = "nz.org.rafikn.app.test";
    private static final Map<String, String> HIBERNATE_PROPERTIES;

    static {
        HIBERNATE_PROPERTIES = new HashMap<String, String>();
        HIBERNATE_PROPERTIES.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        HIBERNATE_PROPERTIES.put("hibernate.connection.driver_class", "org.h2.Driver");
        HIBERNATE_PROPERTIES.put("hibernate.connection.url", "jdbc:h2:mem:test;create=true");
        HIBERNATE_PROPERTIES.put("hibernate.hbm2ddl.auto", "create");
        HIBERNATE_PROPERTIES.put("hibernate.connection.username", "sa");
        HIBERNATE_PROPERTIES.put("hibernate.connection.password", "1");
        HIBERNATE_PROPERTIES.put("hibernate.show_sql", "true");
    }

    public static Injector getInjector() {
        return Guice.createInjector(Stage.DEVELOPMENT,
                new AppModule(TEST_PERSISTENCE_UNIT_NAME, HIBERNATE_PROPERTIES));
    }

}
