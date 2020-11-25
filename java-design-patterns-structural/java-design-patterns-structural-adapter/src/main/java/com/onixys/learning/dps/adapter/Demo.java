package com.onixys.learning.dps.adapter;

import com.onixys.learning.dps.adapter.configuration.MediaType;
import com.onixys.learning.dps.adapter.player.Player;

/**
 * Demo
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(MediaType.MUSIC, "beyond the horizon.mp3");
        player.play(MediaType.VIDEO, "mind me.avi");
    }
}
