package com.onixys.learning.dpb.state;

/**
 * Selection Tool - The Concrete State B
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
