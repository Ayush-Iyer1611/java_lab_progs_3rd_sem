import java.util.Scanner;

abstract class EnergySource {
    int sourceID;
    String sourceName;
    double energyGenerated;

    EnergySource(int id, String name, double energy) {
        sourceID = id;
        sourceName = name;
        energyGenerated = energy;
    }

    abstract double calculateEfficiency();

    void display() {
        System.out.println("Source ID: " + sourceID);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
    }
}

class SolarEnergy extends EnergySource {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergySource {
    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EnergySource e;

        System.out.println("--- Enter Solar Energy Details ---");

        System.out.print("Enter Source ID: ");
        int solarID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Source Name: ");
        String solarName = sc.nextLine();

        System.out.print("Enter Energy Generated (kWh): ");
        double solarEnergy = sc.nextDouble();

        e = new SolarEnergy(solarID, solarName, solarEnergy);

        System.out.println("\n--- Solar Energy Details ---");
        e.display();

        System.out.println("\n--- Enter Wind Energy Details ---");

        System.out.print("Enter Source ID: ");
        int windID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Source Name: ");
        String windName = sc.nextLine();

        System.out.print("Enter Energy Generated (kWh): ");
        double windEnergy = sc.nextDouble();

        e = new WindEnergy(windID, windName, windEnergy);

        System.out.println("\n--- Wind Energy Details ---");
        e.display();

        sc.close();
    }
}


// Program 6 - abstraction and inheritance
// javac Program6.java
// java Program6