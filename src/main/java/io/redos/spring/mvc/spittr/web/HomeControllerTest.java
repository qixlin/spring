package io.redos.spring.mvc.spittr.web;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.UUID;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/31 12:38
 * @copyright ©2018
 */
public class HomeControllerTest {

    @Test
    public void testHomePage(){
        HomeController homeController = new HomeController();
        Assert.assertEquals("home",homeController.home());

        System.out.println(UUID.randomUUID().toString().replaceAll("-",""));
    }

    @Test
    public void testHomePage2() throws Exception {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.view().name("home"));
    }
}
