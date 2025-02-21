package org.example;
import org.springframework.stereotype.Component;

@Component
public class Instrument {
    public String play(){
        return "Playing the instrument!";
    }
    public String stop(){
        return "Stopping the instrument!";
    }
}
