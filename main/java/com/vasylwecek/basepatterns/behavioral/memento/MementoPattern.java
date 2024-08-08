package main.java.com.vasylwecek.basepatterns.behavioral.memento;

public class MementoPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        editor.setText("Version 1 text");
        history.save(editor.save());

        editor.setText("Version 2 text");
        history.save(editor.save());

        editor.setText("Version 3 text");

        System.out.println("Actual text: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("Undo text: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("Restore text: " + editor.getText());
    }
}
