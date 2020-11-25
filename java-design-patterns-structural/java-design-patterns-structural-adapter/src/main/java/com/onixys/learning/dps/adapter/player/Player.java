package com.onixys.learning.dps.adapter.player;

import com.onixys.learning.dps.adapter.configuration.MediaType;
import com.onixys.learning.dps.adapter.player.media.MediaAdapter;
import com.onixys.learning.dps.adapter.player.media.MediaPlayer;

/**
 * Player
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Player implements MediaPlayer {
    MediaAdapter adapter;

    @Override
    public void play(MediaType type, String name) {
        adapter = new MediaAdapter(type);
        adapter.play(type, name);
    }
}
