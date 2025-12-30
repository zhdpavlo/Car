public class Main {
    public static void main(String[] args) {
//        Car bmw = new Car(250.5f, 2500,"Black", new byte[]{0,0,0});

        Truck truck = new Truck(7800, new byte[]{20, 100, 50});
        truck.setValues(250.5f, 2500,"Black", new byte[]{10,100,40}, true);
       // truck.getLoaded();
        System.out.println(truck.getValues());
    }
}
