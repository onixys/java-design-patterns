package com.onixys.learning.dps.adapter.player.media;

import com.onixys.learning.dps.adapter.configuration.MediaType;

/**
 * Media Player
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public interface MediaPlayer {
    void play(MediaType type, String name);
}
