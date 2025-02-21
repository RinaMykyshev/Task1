package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Musician {
    private final Instrument instrument;
    @Autowired
    public Musician(Instrument instrument) {this.instrument = instrument;}
    public void perform() {System.out.println("Musician is performing: "+instrument.play());}
}
