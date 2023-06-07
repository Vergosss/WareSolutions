public class Date {

    // Class attributes
    private int day;
    private int month;
    private int year;

    // Constructor

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    // The beginning of getters / setters:
    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Sequence diagram 13 and Use Case 13
    public boolean checkDateValidity() {
        if (year < 0 || month < 1 || month > 12 || day < 1 || day > getMaxDaysInMonth()) {
            return false;
        }
        return true;
    }

    // Sequence diagram 13 and Use Case 13
    public void deleteDates() {
        day = 0;
        month = 0;
        year = 0;
        System.out.println("Return to home statistics view page.");
    }

    // Private helper method to get the maximum number of days in a month
    private int getMaxDaysInMonth() {
        if (month == 2) {
            return isLeapYear() ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    // Private helper method to check if it's a leap year
    private boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
