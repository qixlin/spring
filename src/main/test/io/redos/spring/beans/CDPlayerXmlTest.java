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

import java.io.File;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

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

    @Test
    public void test(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp ts = new Timestamp(1524035953000L);
        System.out.println(df.format(ts));
        File file = new File(".");
        System.out.println(file.getFreeSpace()/1024/1024/1024);
        System.out.println(file.getTotalSpace()/1024/1024/1024);
    }
}
