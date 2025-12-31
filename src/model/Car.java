package model;

public class Car extends Transport implements ILights{

    private boolean isOn;
    public Engine engine = new Engine();

    public Car(float _speed, int _weight, String _color, byte[] _coordinate){
        super(_speed, _weight, _color, _coordinate);
    }
    public Car(){

    }
    @Override
    public void moveObject(float speed) {
        System.out.println("Our object moves with speed " + speed);
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("We blink the light");
    }
}
