package com.onixys.learning.dps.adapter.player.advanced;

/**
 * VideoPlayer
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class VideoPlayer implements AdvancedPlayer {
    @Override
    public void playMusic(String name) {
        // do nothing
    }

    @Override
    public void playVideo(String name) {
        System.out.println("Playing video: " + name);
    }
}
