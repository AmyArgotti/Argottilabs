import enums.*;

public class Lada extends Car{
    private String ladaStyle;

    public Lada(String ladaStyle, Color color, Engine engine, Model model, Transmission transmission, Type type, Double price) {
        super(color, engine, model, transmission, type, price);
        this.ladaStyle = ladaStyle;
    }

    public String getLadaStyle() {
        return ladaStyle;
    }

    public void setLadaStyle(String ladaStyle) {
        this.ladaStyle = ladaStyle;
    }
}
