package com.example.openclose;

import java.util.LinkedList;
import java.util.List;

public class Button {
    private final List<ButtonListener> listeners;

    public Button() {
        this.listeners = new LinkedList<>();
    }

    public void addListener(ButtonListener listener) {
        assert listener != null;
        listeners.add(listener);
    }

    public void press() {
        for (ButtonListener listener : listeners) {
            listener.buttonPressed();
        }
    }
}
