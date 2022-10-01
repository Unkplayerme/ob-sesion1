public class Main {
    public static void main(String[] args) {

        SmartPhone miPhone = new SmartPhone("Xiaomi", "Redmi", 6.7, 250, true);
        System.out.println(miPhone);
        miPhone.brand = "Samsung";
        miPhone.model = "Galaxy";
        System.out.println(miPhone);

        SmartWatch miWatch = new SmartWatch("Xiaomi", "Mi Band", 1.5, 186, false);
        System.out.println(miWatch);
        miWatch.brand = "Aple";
        miWatch.tactile = true;
        System.out.println(miWatch);
        System.out.println(miWatch.inch = 2.1);
        
    }
}
