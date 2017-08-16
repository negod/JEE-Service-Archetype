#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.control;

import com.negod.generics.persistence.GenericDao;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import ${package}.entity.${classNamePrefix}Entity;

/**
 *
 * @author Joakim Backede ( joakim.backede@outlook.com )
 */
@LocalBean
@Stateless
public class ${classNamePrefix}Dao extends GenericDao<${classNamePrefix}Entity> {
}
