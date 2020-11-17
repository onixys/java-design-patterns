package com.onixys.learning.dpb.state;

/**
 * Brush Tool - The Concrete State A
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class BrushTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
