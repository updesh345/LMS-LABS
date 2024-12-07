// Superclass: HillStations
class HillStations {
    public void location() {
        System.out.println("Location of the hill station is not specified.");
    }

    public void famousFor() {
        System.out.println("Famous attractions are not specified.");
    }
}

// Subclass: Manali
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is located in Himachal Pradesh.");
    }

    @Override
    public void famousFor() {
        System.out.println("Manali is famous for its scenic beauty and adventure sports.");
    }
}

// Subclass: Mussoorie
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its colonial heritage and picturesque views.");
    }
}

// Subclass: Gulmarg
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for its skiing and beautiful meadows.");
    }
}

// Main class
public class HillStationDemo {
    public static void main(String[] args) {
        // Base class reference and method override at runtime
        HillStations hill1 = new Manali();
        hill1.location();
        hill1.famousFor();

        HillStations hill2 = new Mussoorie();
        hill2.location();
        hill2.famousFor();

        HillStations hill3 = new Gulmarg();
        hill3.location();
        hill3.famousFor();

        // Subclass-specific method calls
        System.out.println("\nDirect subclass calls:");
        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}
