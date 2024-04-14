package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums;

public enum Month {
    JANUARY("Yanvar", 31),
    FEBRUARY("Fevral", 28),
    MARCH("Mart", 31),
    APRIL("Aprel", 30),
    MAY("May", 31),
    JUNE("Iyun", 30),
    JULY("Iyul", 31),
    AUGUST("Avqust", 31),
    SEPTEMBER("Sentyabr", 30),
    OCTOBER("Oktyabr", 31),
    NOVEMBER("Noyabr", 30),
    DECEMBER("Dekabr", 31);

    private String name;
    private int daysCount;


    Month(String name, int daysCount) {
        this.name = name;
        this.daysCount = daysCount;
    }

    public static Month[] getWinterMonth() {
        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSummerMonth() {
        return new Month[]{JUNE, JULY, AUGUST};
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    public int getDaysCount() {
        return daysCount;
    }


    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", daysCount=" + daysCount +
                '}';
    }

}
