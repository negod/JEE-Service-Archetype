#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.boundary;

import com.negod.generics.persistence.GenericDao;
import com.negod.generics.persistence.exception.DaoException;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ${package}.entity.${classNamePrefix}Entity;

/**
 *
 * @author Joakim Backede ( joakim.backede@outlook.com )
 */
@LocalBean
@Stateless
public class ${classNamePrefix}Dao extends GenericDao<${classNamePrefix}Entity> {

    Logger log = LoggerFactory.getLogger(${classNamePrefix}Dao.class);

    public ${classNamePrefix}Dao() throws DaoException {
        super(${classNamePrefix}Entity.class);
    }

}
