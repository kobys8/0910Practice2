/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0910practice2;

/**
 *
 * @author kms080
 */
import javax.swing.JOptionPane;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        passengerTrain passTrain = new passengerTrain();
        passengerTrain passTrain1 = new passengerTrain(5,5);
        passTrain.displayTrainInfo();
        passTrain1.displayTrainInfo();
    }
}

class passengerTrain {
    private int numberOfCars, numberOfPassengers;
    public passengerTrain() {
        numberOfCars = 5;
        numberOfPassengers = 0;
    }
    public passengerTrain(int numCars, int numPass) {
        numberOfCars = numCars;
        numberOfPassengers = numPass;
    }
    void pickUp(int passengers) {
        numberOfPassengers += passengers;
    }
    void displayTrainInfo() {
        String display = "There are " + Integer.toString(numberOfPassengers) + " on " + Integer.toString(numberOfCars) + ".";
        JOptionPane.showMessageDialog(null, display);
    }
}