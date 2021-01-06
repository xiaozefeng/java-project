package com.example.openclose;

public class Dialer {

    private Screen screen;
    private Speaker speaker;
    private Radio radio;

    public Dialer(Screen screen, Speaker speaker,
                  Radio radio) {
        this.screen = screen;
        this.speaker = speaker;
        this.radio = radio;
    }

    public void enterDigit(int digit) {
        screen.display(digit);
        speaker.beep(digit);
    }

    public void dial() {
        screen.display("dialing...");
        radio.connect();
    }
}
