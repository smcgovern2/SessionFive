package smcgovern2.enums;

public enum NFCTeams {
    PAC("Green Bay Packers"), COW("Dallas Cowboys"), VIK("Minnesota Vikings"), EAG("Philidelphia Eagles"), SEA("Seattle Seahawks");
    private String text;

    NFCTeams(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
