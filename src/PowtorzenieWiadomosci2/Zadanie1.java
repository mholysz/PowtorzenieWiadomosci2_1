package PowtorzenieWiadomosci2;

public class Zadanie1 {
    private String pesel;
    private int[] calendar = new int[12];
    private int endDay = 1;
    private int endMonth = 7;
    private int endYear = 2018;


    public Zadanie1(String pesel) {
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getDaysFromPesel() {
        return Integer.parseInt(getPesel().substring(4, 6));
    }

    public int getMonthFromPesel() {
        return Integer.parseInt(getPesel().substring(2, 4));
    }

    public int getYearFromPesel() {
        return Integer.parseInt(getPesel().substring(0, 2));
    }

    private boolean isLeap(int year) {
        int checkedYear = year;
        if ((checkedYear % 4 == 0 && checkedYear % 100 != 0) || (checkedYear % 400 == 0)) {
            return true;
        } else
            return false;
    }

    private void initCalendar(int year) {
        for (int i = 0; i < 12; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11)
                calendar[i] = 31;
            else if (i == 1) {
                if (isLeap(year)) {
                    calendar[i] = 29;
                } else {
                    calendar[i] = 28;
                }
            } else
                calendar[i] = 30;
        }
    }

    private int calculateDaysTillActualDay(){
        initCalendar(endYear);
        int days = 0;
        for (int i = 0; i < endMonth-1; i++) {
            days += calendar[i];
        }
        return days+endDay;
    }

    private int calculateDaysInBirthYear(){
        int startDay = getDaysFromPesel();
        int startMonth = getMonthFromPesel();
        int startYear = getYearFromPesel() + 1900;
        initCalendar(startYear);
        int daysInYear = 0;
        for (int i = startMonth; i < calendar.length; i++) {
            daysInYear += calendar[i];
        }
        return daysInYear+(calendar[startMonth]-startDay);
    }

    private int calculateDays() {
        int days =0;
        for (int i = getYearFromPesel()+1901; i < endYear; i++) {
            if (isLeap(i)){
                days+=366;
            }
            else
                days+=365;
        }
        days+= calculateDaysInBirthYear();
        days+= calculateDaysTillActualDay();

        return days;
    }

    public int modulo(){
        return calculateDays()%2;
    }
}
