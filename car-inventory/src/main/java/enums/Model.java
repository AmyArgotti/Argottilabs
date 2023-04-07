package enums;

public enum Model {

    BMW, AUDI, FIAT, RAM, GMC;

    @Override
    public String toString() {
        switch (this){
            case BMW:
                return "BMW";
            case AUDI:
                return "AUDI";
            case FIAT:
                return  "FIAT";
            case RAM:
                return "RAM";
            case GMC:
                return "GMC";
            default:
                return null;
        }
    }
}

