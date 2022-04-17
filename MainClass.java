/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

public class MainClass {
    public static void main (String[] args) {
        System.out.println("NAMA   : FIKRIYA RACHMA DEWI");
        System.out.println("NIM    : 215150600111008");
        
        CarRider rossi = new CarRider("Valentino Rossi", 27, "0815673829");
        CarRider lorenzo = new CarRider("Jorge Lorenzo", 24, "08527648555");
        CarRider rins = new CarRider("Alex Rins", 26, "081257764333");
        CarRider marquez = new CarRider("Jac Marquez", 22, "080133389922");
        
        CarData data = new CarData();
        data.addCar("SEDAN", "N 1211 AB", "Toyota");
        data.addCar("MPV", "N 2322 AB", "Mitsubishi");
        data.addCar("LIMOSIN", "N 3433 AB", "Hyundai");
        data.addCar("JEEP", "N 4544 AB", "Wrangler");
        
        data.listOfCar();
        
        RentArchive arsip = new RentArchive();
        arsip.Rent(rossi, data.carList.get(1), 7);
        arsip.Rent(lorenzo, data.carList.get(0), 3);
        arsip.Rent(rins, data.carList.get(1), 1);
        arsip.Rent(marquez, data.carList.get(2), 5);
   
        System.out.println("");
        arsip.info();
    }
}
