package demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Lamp lampe1 = new Lamp();
	Lamp lampe2 = new Lamp();
	Lamp lampe3 = new Lamp();
	Lamp lampe4 = new Lamp();
	Lamp lampe5 = new Lamp();
	Lamp selectedLamp = null;

	int switchState = 0;

	while (switchState != 6) {
        System.out.println("Lampe 1: " + lampe1.getOnOffState() + "\n" +
                "Lampe 2: " + lampe2.getOnOffState() + "\n" +
                "Lampe 3: " + lampe3.getOnOffState() + "\n" +
                "Lampe 4: " + lampe4.getOnOffState() + "\n" +
                "Lampe 5: " + lampe5.getOnOffState());

        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Input the number of the lamp you want to switch on/off: ");
        switchState = input.nextInt();

        switch (switchState) {
            case 1:
                selectedLamp = lampe1;
                selectedLamp.pressOnSwitch();
                break;
            case 2:
                selectedLamp = lampe2;
                selectedLamp.pressOnSwitch();
                break;
            case 3:
                selectedLamp = lampe3;
                selectedLamp.pressOnSwitch();
                break;
            case 4:
                selectedLamp = lampe4;
                selectedLamp.pressOnSwitch();
                break;

            case 5:
                selectedLamp = lampe5;
                selectedLamp.pressOnSwitch();
                break;

        }
    }
    }
}
