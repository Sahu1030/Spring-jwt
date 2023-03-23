package io.jwt.springsecurityjwt.configandutil;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new User("foo", "foo",
                new ArrayList<>());
    }
    
//	If conncetion with DB
//	 @Autowired
//	    private CustomerRepository customerRepository;
//	 @Override
//	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//	        final CustomerEntity customer = customerRepository.findByEmail(username);
//	        if (customer == null) {
//	            throw new UsernameNotFoundException(username);
//	        }
//	        UserDetails user = User.withUsername(customer.getEmail()).password(customer.getPassword()).authorities("USER").build();
//	        return user;
//	    }
}
