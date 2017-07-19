package it.pkg.boundary;

import com.negod.generics.persistence.GenericDao;
import com.negod.generics.persistence.exception.DaoException;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import it.pkg.entity.basicEntity;

/**
 *
 * @author Joakim Backede ( joakim.backede@outlook.com )
 */
@LocalBean
@Stateless
public class basicDao extends GenericDao<basicEntity> {

    Logger log = LoggerFactory.getLogger(basicDao.class);

    public basicDao() throws DaoException {
        super(basicEntity.class);
    }

}
