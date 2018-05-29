package io.redos.spring.beans;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/28 16:33
 * @copyright ©2018
 */
//@Component("lonelyHeartClub")
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt. Pepper's Lonely Hearts Club Band.";
    private String artist = "the Beatles";
    private List<String> tracks;

    public SgtPeppers(){

    }

    public SgtPeppers(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public SgtPeppers(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        if (tracks != null) {
            for (String track:tracks) {
                System.out.println("-tracks: " + track);
            }
        }
    }
}
