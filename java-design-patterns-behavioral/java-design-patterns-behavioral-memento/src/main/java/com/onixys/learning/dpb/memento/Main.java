package com.onixys.learning.dpb.memento;

/**
 * Main
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
