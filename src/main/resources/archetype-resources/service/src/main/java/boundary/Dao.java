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
import ${package}.entity.ServiceEntity;

/**
 *
 * @author Joakim Johansson ( joakimjohansson@outlook.com )
 */
@LocalBean
@Stateless
public class Dao extends GenericDao<ServiceEntity> {

    Logger log = LoggerFactory.getLogger(Dao.class);

    public Dao() throws DaoException {
        super(ServiceEntity.class);
    }

}
