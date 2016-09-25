package nz.org.rafikn.app.guice;

import com.google.inject.Module;
import com.google.inject.persist.PersistService;
import com.squarespace.jersey2.guice.JerseyGuiceServletContextListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContextEvent;
import java.util.*;

/**
 * Created by rafik on 25/09/16.
 */
public class AppListener extends JerseyGuiceServletContextListener {

    private static final Logger logger = LogManager.getLogger(AppListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("Context initialized. Starting Persistence Unit");
        getInjector().getInstance(PersistService.class).start();
        logger.info("Persistence Unit started");
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("Context destroyed. Stopping Persistence Unit");
        getInjector().getInstance(PersistService.class).start();
        logger.info("Persistence Unit stopped");
    }

    @Override
    protected List<? extends Module> modules() {
        return Collections.singletonList(new AppModule(getPersistenceUnit(), getHibernateProperties()));
    }


    //TODO: read from config file
    private Map<String, String> getHibernateProperties() {
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("hibernate.connection.driver_class", "org.postgresql.Driver");
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL92Dialect");
        properties.put("hibernate.connection.url", "jdbc:postgresql://vm:5432/sample");
        properties.put("hibernate.connection.username", "postgres");
        properties.put("hibernate.connection.password", "xxx");
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.listeners.envers.autoRegister", "false");
        properties.put("hibernate.default_batch_fetch_size", "8");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.max_fetch_depth", "3");
        properties.put("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
        properties.put("hibernate.max_fetch_depth", "3");
        properties.put("hibernate.id.new_generator_mappings", "true");
        return properties;
    }

    //TODO: read from config file
    private String getPersistenceUnit() {
        return "nz.org.rafikn.app";
    }

}