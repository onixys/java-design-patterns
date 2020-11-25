package com.onixys.learning.dps.adapter.player.advanced;

/**
 * VideoPlayer
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class MusicPlayer implements AdvancedPlayer {
    @Override
    public void playMusic(String name) {
        System.out.println("Playing music: " + name);
    }

    @Override
    public void playVideo(String name) {
        // do nothing
    }
}
