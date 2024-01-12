package tasks.task25_12_1;

public class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays ;
    int year = 2022;
    boolean isRainyMonth;

    public WeatherCalendar(String monthName, int monthNumberOfDays) {
        this.month = monthName;
        this.numberOfDays = monthNumberOfDays;
    }

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays++;
    }
}