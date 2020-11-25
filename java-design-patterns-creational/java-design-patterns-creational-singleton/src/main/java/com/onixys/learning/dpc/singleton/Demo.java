package com.onixys.learning.dpc.singleton;

/**
 * Demo
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Demo {

    public static void main(String[] args) {
        Singleton singleton = Singleton.instance();
        singleton.apply();
    }
}
