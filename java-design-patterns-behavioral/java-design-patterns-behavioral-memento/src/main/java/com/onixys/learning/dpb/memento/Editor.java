package com.onixys.learning.dpb.memento;

/**
 * Editor - The Originator
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state == null ? null : state.getContent();
    }
}
