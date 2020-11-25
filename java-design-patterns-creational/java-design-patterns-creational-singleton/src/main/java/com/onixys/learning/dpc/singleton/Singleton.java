package com.onixys.learning.dpc.singleton;

/**
 * Singleton
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Singleton {
    private static Singleton instance;

    public static Singleton instance() {
        if (instance == null) instance = new Singleton();

        return instance;
    }
}
