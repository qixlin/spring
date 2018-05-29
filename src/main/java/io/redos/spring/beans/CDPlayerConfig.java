package io.redos.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/28 16:35
 * @copyright ©2018
 */
//@Configuration
//@ComponentScan
//@ComponentScan(basePackages = {"io.redos.spring.beans"})
//@ComponentScan(basePackageClasses = {SgtPeppers.class})
public class CDPlayerConfig {


    @Bean(name = "lonelyHeartsClubBand")
    public CompactDisc compactDisc(){
        System.out.println(1);
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer mediaPlayer(){
        System.out.println(2);
        return new CDPlayer(compactDisc());
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
