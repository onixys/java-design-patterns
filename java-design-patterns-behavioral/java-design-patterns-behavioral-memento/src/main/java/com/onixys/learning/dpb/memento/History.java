package com.onixys.learning.dpb.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * History - The Care Taker
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state) {
        states.add(state);
    }

    public EditorState pop() {
        EditorState lastState = null;
        var lastIndex = states.size() - 1;
        if (lastIndex >= 0) {
            lastState = states.get(lastIndex);
            states.remove(lastState);
        }

        return lastState;
    }
}
