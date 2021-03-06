package com.onixys.learning.dpb.state;

/**
 * Main
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());

        canvas.mouseDown();
        canvas.mouseUp();
    }
}
