public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(250.5f, 2500,"Black", new byte[]{0,0,0});
        bmw.engine.setValues(true ,5000);
        bmw.engine.info();

        Truck truck = new Truck(7800, new byte[]{20, 100, 50});
        truck.setValues(250.5f, 2500,"Black", new byte[]{10,100,40}, true);
        System.out.println(truck.getValues());
        truck.engine.setValues(false, 1500000);
        truck.engine.info();

        Car flyCar = new Car(120.0f, 500,"White", new byte[]{0,0,0}){
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);

                this.engine.isReady(true);
                System.out.println("The car flyes");
            }
        };
        flyCar.moveObject(450); 


        }
    }


