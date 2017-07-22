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
import lombok.extern.slf4j.Slf4j;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ${package}.entity.${classNamePrefix}Entity;

/**
 *
 * @author Joakim Backede ( joakim.backede@outlook.com )
 */
@LocalBean
@Stateless
@Slf4j
public class ${classNamePrefix}Dao extends GenericDao<${classNamePrefix}Entity> {

    @PersistenceContext(unitName = "${classNamePrefix}PU")
    private EntityManager em;

    public ${classNamePrefix}Dao() throws DaoException {
        super(${classNamePrefix}Entity.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

}
