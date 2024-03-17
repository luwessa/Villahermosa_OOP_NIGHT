package main;

import java.util.Stack;

class AdvancedTextEditor extends TextEditor {
    private Stack<String> history = new Stack<>();

    public AdvancedTextEditor(String initialText) {
        super(initialText);
        history.push(initialText);
    }

    public void undo() {
        if (history.size() > 1) {
            history.pop();
            setText(history.peek());
        }
    }

    @Override
    public void append(String newText) {
        super.append(newText);
        history.push(getText());
    }

    @Override
    public void delete(int n) {
        super.delete(n);
        history.push(getText());
    }
}
