package Lessons;

public enum Size {
    BIG("L"), AVERAGE("M"),
    SMALL("S"), VERY_SMALL("Xs"),
    VERY_BIG("XL"), UNSIZE("");

    Size(String abbeviatura) {
        this.abbreviatura = abbeviatura;
    }

    private String abbreviatura;

    public String getAbbreviatura() {
        return abbreviatura;
    }
}
