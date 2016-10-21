package de.fincon.ws.rest;

public class HelloWorld {

	private final long id;
	private final String text;
	
    public HelloWorld(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public String gettext() {
        return text;
    }
}
