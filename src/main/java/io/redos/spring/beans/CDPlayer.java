package io.redos.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/28 17:27
 * @copyright ©2018
 */
//@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

//    @Autowired
    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }
    @Override
    public void play() {
        compactDisc.play();
    }
//
//    @Autowired
//    public void insertCompactPlay(CompactDisc cd){
//        this.compactDisc = cd;
//    }
//    @Autowired
//    public void setCompactDisc(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }
//
//    @Autowired(required=false)
//    public void setCompactDisc1(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }
//    @Inject
//    public void setCompactDisc(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }
}
