package enums;

public enum Color {
    RED, BLUE, YELLOW, WHITE, BLACK;
    @Override
    public String toString() {
        switch (this){
            case RED:
                return "red";
            case BLUE:
                return "blue";
            case YELLOW:
                return  "yellow";
            case WHITE:
                return "white";
            case BLACK:
                return "black";
            default:
                return null;
        }
    }
}
