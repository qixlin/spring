package io.redos.spring.beans;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/29 14:17
 * @copyright ©2018
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:io/redos/spring/beans/spring-context.xml")
public class CDPlayerXmlTest {

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void xmlNotNull(){
        assertNotNull(cdPlayer);
        cdPlayer.play();
    }
}
