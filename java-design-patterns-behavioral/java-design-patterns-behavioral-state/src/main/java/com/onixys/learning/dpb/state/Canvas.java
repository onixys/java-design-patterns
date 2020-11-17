package com.onixys.learning.dpb.state;

/**
 * Canvas - The Context
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Canvas {
    private Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return this.currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
