interface ParkingCharge {
    void calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    int vehicleNumber;
    String vehicleType;
    int hours;

    VehicleParking(int no, String type, int h) {
        vehicleNumber = no;
        vehicleType = type;
        hours = h;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {
    int charge;

    TwoWheeler(int no, int h) {
        super(no, "Two Wheeler", h);
    }

    public void calculateCharge() {
        if (hours <= 2)
            charge = hours * 20;
        else
            charge = 40 + (hours - 2) * 10;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + hours);
        System.out.println("Parking Charge: Rs." + charge);
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {
    int charge;

    FourWheeler(int no, int h) {
        super(no, "Four Wheeler", h);
    }

    public void calculateCharge() {
        if (hours <= 2)
            charge = hours * 50;
        else
            charge = 100 + (hours - 2) * 30;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + hours);
        System.out.println("Parking Charge: Rs." + charge);
    }
}

public class Main {
    public static void main(String[] args) {

        ParkingCharge p;

        p = new TwoWheeler(101, 4);
        p.calculateCharge();
        p.displayParkingDetails();

        System.out.println();

        p = new FourWheeler(202, 3);
        p.calculateCharge();
        p.displayParkingDetails();
    }
}
