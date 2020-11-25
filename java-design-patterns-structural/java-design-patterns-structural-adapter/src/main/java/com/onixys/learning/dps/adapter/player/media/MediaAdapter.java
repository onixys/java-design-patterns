package com.onixys.learning.dps.adapter.player.media;

import com.onixys.learning.dps.adapter.configuration.MediaType;
import com.onixys.learning.dps.adapter.player.advanced.AdvancedPlayer;
import com.onixys.learning.dps.adapter.player.advanced.MusicPlayer;
import com.onixys.learning.dps.adapter.player.advanced.VideoPlayer;

/**
 * Media Adapter
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedPlayer advancedPlayer;

    public MediaAdapter(MediaType type) {
        if (type.equals(MediaType.MUSIC)) advancedPlayer = new MusicPlayer();
        else if (type.equals(MediaType.VIDEO)) advancedPlayer = new VideoPlayer();
    }

    @Override
    public void play(MediaType type, String name) {
        if (type.equals(MediaType.MUSIC)) advancedPlayer.playMusic(name);
        else if (type.equals(MediaType.VIDEO)) advancedPlayer.playVideo(name);
    }
}
