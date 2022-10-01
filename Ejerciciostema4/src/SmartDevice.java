public class SmartDevice {
    String brand;
    String model;
    Double inch;
    Integer weight;

    public SmartDevice(){
    }

    public SmartDevice(String brand, String model, Double inch, Integer weight) {
        this.brand = brand;
        this.model = model;
        this.inch = inch;
        this.weight = weight;
    }
}

public static class SmartPhone extends SmartDevice{
    boolean nfc;

    public SmartPhone(){
        super();
    }

    public SmartPhone(String brand, String model, Double inch, Integer weight, boolean nfc) {
        super(brand, model, inch, weight);
        this.nfc = nfc;
    }

    @Override
    public String toString() {
        return "El smartphone es" +
                " Marca: " + brand +
                ", Modelo: " + model +
                ", Pulgadas: " + inch +
                ", Peso: " + weight + "gr" +
                ", NFC: " + nfc +
                ' ';
    }
}


public static class SmartWatch extends SmartDevice{
    boolean tactile;

    public SmartWatch(){
        super();
    }

    public SmartWatch(String brand, String model, Double inch, Integer weight, boolean tactile) {
        super(brand, model, inch, weight);
        this.tactile = tactile;
    }

    @Override
    public String toString() {
        return "El smartwatch es" +
                " Marca: " + brand +
                ", Modelo: " + model +
                ", Pulgadas: " + inch +
                ", Peso: " + weight + "gr" +
                ", Tactil: " + tactile +
                ' ';
    }
}

