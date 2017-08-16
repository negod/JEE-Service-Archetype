#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.boundary;

import com.negod.generics.persistence.GenericDao;
import io.swagger.annotations.Api;
import ${package}.control.${classNamePrefix}Dao;
import ${package}.entity.${classNamePrefix}Entity;
import javax.ejb.EJB;
import javax.ws.rs.Path;
import se.backede.webservice.service.RestService;

/**
 *
 * @author Joakim Backede ( joakim.backede@outlook.com )
 */
@Api
@Path("/${parentArtifactId}")
public class ${classNamePrefix} implements RestService<${classNamePrefix}Entity> {

    @EJB
    ${classNamePrefix}Dao dao;

    @Override
    public GenericDao getDao() {
        return dao;
    }

}
