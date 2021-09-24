package demo;

public class Lamp {
    private boolean onOffState;

    public Lamp() {
        onOffState = false;
    }

    public void pressOnSwitch() {
            onOffState =! onOffState;


    }
    public String getOnOffState() {
        if (onOffState == false) {
            return "The lamp is turned off.";
        } else {
            return "The lamp is turned on.";
        }
    }

}
