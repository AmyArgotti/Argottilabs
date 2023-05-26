package enums;

public enum Type {
    SEDAN, HATCHBACK, STATION, WAGON, COUPE, MINIVAN;

    @Override
    public String toString() {
        switch (this){
            case SEDAN:
                return "sedan";
            case HATCHBACK:
                return "hatchback";
            case STATION:
                return  "station";
            case WAGON:
                return "wagon";
            case COUPE:
                return "coupe";
            case MINIVAN:
                return "minivan";
            default:
                return null;
        }
    }
}
