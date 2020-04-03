package demo.project.springangular.service;

import demo.project.springangular.model.User;
import demo.project.springangular.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = userRepository.findByUserName(username).orElseThrow(() ->
//                        new UsernameNotFoundException("User not found !" + username));
        User user = userRepository.findByEmail(email).orElseThrow(() ->
                new UsernameNotFoundException("User with " + email + " is not found !"));
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
                user.getPassword(), true, true, true, true,
                getAuthorities("ROLE_USER"));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(String role_user) {
        return Collections.singletonList(new SimpleGrantedAuthority(role_user));
    }
}
