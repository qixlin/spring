package io.redos.spring.beans;

import org.springframework.stereotype.Component;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/28 16:33
 * @copyright ©2018
 */
@Component("lonelyHeartClub")
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt. Pepper's Lonely Hearts Club Band.";
    private String artist = "the Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
