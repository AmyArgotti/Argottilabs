package enums;

public enum Transmission {

    AUTOMATIC, TRANSMISSION, MANUAL_TRANSMISSION;

    @Override
    public String toString() {
        switch (this){
            case AUTOMATIC:
                return "automatic";
            case TRANSMISSION:
                return "transmission";
            case MANUAL_TRANSMISSION:
                return  "automatic transmission";
            default:
                return null;
        }
    }
}
