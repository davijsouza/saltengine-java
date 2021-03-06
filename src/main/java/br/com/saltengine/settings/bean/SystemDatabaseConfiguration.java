package br.com.saltengine.settings.bean;

import br.com.saltengine.model.DatabaseMySQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.Properties;

import static br.com.saltengine.util.BeanConst.*;
import static br.com.saltengine.util.SystemPropertiesConst.*;

/**
 * Class auto-generated by archetype-spring project
 * Repository: http://californio.keynet.com.br:8089/java/archetype/archetype-spring
 */
@Configuration
public class SystemDatabaseConfiguration {

    @Bean(BEAN_SYSTEM_DATABASE)
    @Autowired
    @DependsOn({BEAN_SYSTEM_PROPERTIES})
    public DatabaseMySQL loadSystemDatabase(Properties systemProperties) {
        return new DatabaseMySQL(systemPropertiesToDbProperties(systemProperties));
    }

    private Properties systemPropertiesToDbProperties(Properties systemProperties) {
        Properties dbProperties = new Properties();
        dbProperties.put(DatabaseMySQL.PROPERTIES_KEY_URL, systemProperties.getProperty(SYSTEM_DATABASE_URL));
        dbProperties.put(DatabaseMySQL.PROPERTIES_KEY_USER, systemProperties.getProperty(SYSTEM_DATABASE_USER));
        dbProperties.put(DatabaseMySQL.PROPERTIES_KEY_PASSWORD, systemProperties.getProperty(SYSTEM_DATABASE_PASSWORD));
        return dbProperties;
    }

}
