public class Truck extends Transport{

    private boolean isLoaded;

    public Truck(int weight, byte[] coordinate, boolean isLoaded){
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }

    public Truck(int weight, byte[] coordinate){
        super(weight, coordinate);
        setColor("green");
        //System.out.println(getValues());

    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Our object moves with speed" + speed);
    }


    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate, boolean isLoaded){
    super.setValues(_speed,_weight,_color,_coordinate);
    this.isLoaded = isLoaded;
        System.out.println("second Method");
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded){
        isLoaded = loaded;
    }

    public String getLoaded(){
        if(isLoaded == true){
            return "The truck is loaded";
        }else{
            return "The truck isn't loaded";

        }
    }

}
