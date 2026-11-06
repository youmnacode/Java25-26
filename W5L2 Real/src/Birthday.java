public class Birthday {


            private int day;
            private int month;
            private int year;

            private Birthday birthday;


            public Birthday(int day, int month, int year)
        {
            this.day = day;
            this.month = month;
            this.year = year;
        }


    public String toString() {
        return "Birthday{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }


    public void setYear(int year) {
        this.year = year;
    }
}
