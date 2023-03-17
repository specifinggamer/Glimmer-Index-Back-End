package org.glimmer.Service;

import org.glimmer.service.Impl.UserDetailsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Test
    void LoadByUserNameTest() {
        UserDetails u = userDetailsService.loadUserByUsername("Anti");
        System.out.println(u);
    }
}
