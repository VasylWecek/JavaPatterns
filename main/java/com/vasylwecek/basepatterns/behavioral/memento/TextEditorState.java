package main.java.com.vasylwecek.basepatterns.behavioral.memento;

public class TextEditorState {
    private final String text;

    public TextEditorState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
