package com.inti.core.springcore.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest(MainController.class)
class MainControllerTest {

   @Autowired
   MockMvc mockMvc;

   @Test
   public void main_controller_test() throws Exception {
      mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("test")))
            .andDo(print());
   }

}