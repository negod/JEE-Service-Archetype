#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ${package}.security;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import se.backede.web${artifactId}.security.AuthorizationDao;
import se.backede.web${artifactId}.security.AuthorizationException;
import se.backede.web${artifactId}.security.Credentials;

/**
 *
 * @author Joakim Backede ( joakim.backede@outlook.com )
 */
@LocalBean
@Stateless
public class AuthDao implements AuthorizationDao {

    @Override
    public Boolean authorize(Credentials creds) throws AuthorizationException {
        return true;
    }

}
