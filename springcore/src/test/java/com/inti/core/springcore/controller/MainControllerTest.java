package com.inti.core.springcore.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MainControllerTest {

   @LocalServerPort
   int port;

   @Autowired
   private TestRestTemplate testRestTemplate;

   @Test
   public void main_controller_test() throws Exception {
      ResponseEntity<String> response = testRestTemplate.getForEntity("http://localhost:" + port, String.class);

      assertThat(response.getBody()).isEqualTo("test");
   }

}