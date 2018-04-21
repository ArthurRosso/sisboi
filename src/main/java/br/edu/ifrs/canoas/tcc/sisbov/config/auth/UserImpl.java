package br.edu.ifrs.canoas.tcc.sisbov.config.auth;

import java.util.Collection;

import br.edu.ifrs.canoas.tcc.sisbov.domain.User;
import org.springframework.security.core.GrantedAuthority;

public class UserImpl extends org.springframework.security.core.userdetails.User{
	
	private static final long serialVersionUID = 1L;
	private User user;

    public UserImpl(String username, String password, Collection<? extends GrantedAuthority> authorities, User user) {
        super(username, password, authorities);
        this.user = user;
    }

    public UserImpl(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public UserImpl(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public User getUser() {
        return user;
    }

}
