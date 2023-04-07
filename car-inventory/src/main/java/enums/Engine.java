package enums;

public enum Engine {

    GASOLINE, DIESEL, GAS, ELECTRIC, HYBRID;

    @Override
    public String toString() {
        switch (this){
            case GASOLINE:
                return "ICE-gasoline";
            case DIESEL:
                return "ICE-diesel";
            case GAS:
                return  "gas";
            case ELECTRIC:
                return "electric";
            case HYBRID:
                return "hybrid";
            default:
                return null;
        }
    }
}
