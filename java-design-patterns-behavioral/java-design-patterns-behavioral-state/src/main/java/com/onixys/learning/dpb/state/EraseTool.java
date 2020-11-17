package com.onixys.learning.dpb.state;

/**
 * Erase Tool - The Concrete State c
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class EraseTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Erase icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }
}
