package main.java.com.vasylwecek.basepatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class TextEditorHistory {
    private List<TextEditorState> history = new ArrayList<>();
    
    public void save(TextEditorState state){
        history.add(state);
    }

    public TextEditorState undo(){
        if (!history.isEmpty()){
            return history.remove(history.size()-1);
        }
        return null;
    }
}
