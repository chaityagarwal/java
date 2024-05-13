interface Sales {
    double calculateSalesFigure();
}

class Item {
    String title;
    double price;

    Item(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void printItemDetails() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class HardwareItem extends Item implements Sales {
    int id;
    String manufacturer;

    HardwareItem(String title, double price, int id, String manufacturer) {
        super(title, price);
        this.id = id;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double calculateSalesFigure() {
        return 0;
    }

    public void printHardwareItemDetails() {
        System.out.println("ID: " + id);
        System.out.println("Manufacturer: " + manufacturer);
        printItemDetails();
    }
}

class SoftwareItem extends Item implements Sales {
    int id;
    String operatingSystem;

    SoftwareItem(String title, double price, int id, String operatingSystem) {
        super(title, price);
        this.id = id;
        this.operatingSystem = operatingSystem;
    }

   
    public int getId() {
        return id;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double calculateSalesFigure() {
        return 0;
    }

    public void printSoftwareItemDetails() {
        System.out.println("ID: " + id);
        System.out.println("Operating System: " + operatingSystem);
        printItemDetails();
    }
}

class CompanySells {
    public static void main(String[] args) {
       
        HardwareItem hardwareItem = new HardwareItem("Computer", 10000, 1, "Dell");
        SoftwareItem softwareItem = new SoftwareItem("Windows 10", 5000, 2, "Windows");

        hardwareItem.printHardwareItemDetails();

        softwareItem.printSoftwareItemDetails();
    }
}