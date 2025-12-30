public abstract class Transport {
    //variablen
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    //Join to DB
    public Transport(float _speed, int _weight, String _color, byte[] _coordinate){
        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordinate);
        //System.out.println(getValues());

    }

    public Transport(int weight, byte[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
        //System.out.println(getValues());
    }
    public abstract void moveObject(float speed);
    //Methode, bei der die Werte zu den Parametern zugehört werden
    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate){
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }


    //Methode, bei der die Werte angezeigt werden
    public String getValues(){
        String getInfo = "Speed: " + speed + " Weight: " + weight + " Color: " + color;
        String getInfoCoordinate = " Coordinates: \n";
        for(int i=0; i<coordinate.length; i++){
            getInfoCoordinate = getInfoCoordinate + coordinate[i] + " ";
        }
        return getInfo + getInfoCoordinate;
    }

    public void setColor(String color){
        this.color = color;
    }
}
