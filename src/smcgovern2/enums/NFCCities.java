package smcgovern2.enums;

public enum NFCCities {
    GRE("Green Bay Packers"), DAL("Dallas Cowboys"), MIN("Minnesota Vikings"), PHI("Philidelphia Eagles"), SEA("Seattle Seahawks");
    private String text;

    NFCCities(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
