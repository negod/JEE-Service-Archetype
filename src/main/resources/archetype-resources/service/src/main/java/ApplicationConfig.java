#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.Set;
import javax.ejb.Singleton;
import javax.ws.rs.core.Application;

/**
 *
 * @author Joakim Johansson ( joakimjohansson@outlook.com )
 */
@Singleton
@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(${package}.CorsFilter.class);
        resources.add(${package}.boundary.Domain.class);
        resources.add(${package}.boundary.${classNamePrefix}.class);
        resources.add(${package}.boundary.Swagger.class);
        resources.add(${package}.boundary.User.class);
        resources.add(${package}.security.Auth.class);
        resources.add(se.backede.web${artifactId}.security.AuthenticationFilter.class);
    }

}
