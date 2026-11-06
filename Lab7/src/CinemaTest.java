public class CinemaTest {

    public static void main(String[] args) {

        // Initialization: rows x cols cinema seating grid
        boolean[][] theaterSeats = new boolean[5][5];

        // Create Cinema object
        Cinema c1 = new Cinema();

        // Display initial seating
        c1.displaySeats(theaterSeats);

        System.out.println("\nBooking some seats...\n");

        // Booking seats:
        c1.bookSeat(theaterSeats, 5, 6);  // seat 5,6
        c1.bookSeat(theaterSeats, 1, 2);  // seat 1,2
        c1.bookSeat(theaterSeats, 3, 4);  // seat 3,4
        c1.bookSeat(theaterSeats, 0, 0);  // seat 0,0
        c1.bookSeat(theaterSeats, 1, 2);  // seat 1,2

        System.out.println("\nUpdated Seating Plan:\n");

        c1.displaySeats(theaterSeats);

        // Display occupancy rate
        double occupancy = c1.getOccupancyRate(theaterSeats);

        System.out.printf("\nOccupancy Rate: %.2f%%\n", occupancy);
    }
}