package com.baeldung.auth;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.baeldung.auth.AuthorizationServerApp;

@SpringBootTest(classes = { AuthorizationServerApp.class })
public class ContextIntegrationTest {

    @Test
    public void whenLoadApplication_thenSuccess() {
        // pass
    }

}