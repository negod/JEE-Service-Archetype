#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ${package}.control;

import com.negod.generics.persistence.GenericDao;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import ${package}.entity.DomainEntity;

/**
 *
 * @author Joakim Backede ( joakim.backede@outlook.com )
 */
@LocalBean
@Stateless
public class DomainDao extends GenericDao<DomainEntity> {
}
