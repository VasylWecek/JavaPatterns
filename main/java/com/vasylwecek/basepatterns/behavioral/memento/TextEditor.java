package main.java.com.vasylwecek.basepatterns.behavioral.memento;

public class TextEditor {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextEditorState save(){
        return new TextEditorState(text);
    }

    public void restore(TextEditorState state){
        this.text = state.getText();
    }
}
