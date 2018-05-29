package io.redos.spring.beans;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/28 16:40
 * @copyright ©2018
 */
import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc compa;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compa);
    }

    @Test
    public void cdShouldEquals() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CompactDisc sc = (CompactDisc) configApplicationContext.getBean("lonelyHeartClub");
        CompactDisc compactDisc = configApplicationContext.getBean(CompactDisc.class);
        SgtPeppers sgtPeppers = configApplicationContext.getBean(SgtPeppers.class);
        SgtPeppers sgtPeppers2 = (SgtPeppers) configApplicationContext.getBean(CompactDisc.class);
        sc.play();
        compactDisc.play();
        assertEquals(sc,compactDisc);
        assertEquals(sc,sgtPeppers);
        assertEquals(sc,sgtPeppers2);
        configApplicationContext.close();
    }

    @Rule
    public final SystemOutRule log = new SystemOutRule();


    @Autowired
    private MediaPlayer mediaPlayer;
    @Test
    public void play(){
        log.enableLog();
        mediaPlayer.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band. by the Beatles\r\n",log.getLog());
    }

    @Test
    public void te(){
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band. by the Beatles","Playing Sgt. Pepper's Lonely Hearts Club Band. by the Beatles");
    }

}
