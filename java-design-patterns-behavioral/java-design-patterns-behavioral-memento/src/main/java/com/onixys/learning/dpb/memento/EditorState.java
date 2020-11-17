package com.onixys.learning.dpb.memento;

/**
 * Editor State - The Memento
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
