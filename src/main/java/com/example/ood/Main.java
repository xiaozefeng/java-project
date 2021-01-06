package com.example.ood;

public class Main {

    private Reader reader = new KeyboardReader();
    private Writer writer = new Printer();

    private static final int EOF = -1;

    public void copy() {
        int c;
        while ((c = reader.read()) != EOF) {
            writer.write();
        }
    }



    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

}

