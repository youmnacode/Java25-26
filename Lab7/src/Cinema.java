public class Cinema {

    public Cinema() {
    }

    // Method to display seating layout
    public void displaySeats(boolean[][] seats) {

        System.out.println("Cinema Seating Plan (O = Available, X = Booked)");

        //print a 2d array using nested for loops

        for(int i = 0; i < seats.length; i++)
        {
            for(int j = 0; j < seats[i].length; j++)
            {
                if(seats[i][j] == false)    //available seat
                {
                    System.out.print("O" + "\t");
                }
                else
                {
                    System.out.print("X" + "\t");
                }
            }
            System.out.println();
        }
    }

    // Method to book a seat
    public void bookSeat(boolean[][] seats, int row, int col) {

        if (row >= 0 && row < seats.length &&
                col >= 0 && col < seats[row].length)
        {
            if(seats[row][col] == true)
            {
                System.out.println("Seat already booked!");
                return;
            }
            else
            {
                seats[row][col] = true;
                System.out.println("Seat booked successfully at Row " + row + ", Column " + col);
                return;
            }
        }
        else
        {
            System.out.println("Invalid seat position!");
            return;
        }
    }

    // Method to calculate occupancy rate using enhanced for-loop
    public double getOccupancyRate(boolean[][] seats) {

        int totalSeats = 0;
        int bookedSeats = 0;

        //count total number of seats

//        for(int i = 0; i < seats.length; i++)
//        {
//            for(int j = 0; j < seats[i].length; j++)
//            {
//                totalSeats++;
//            }
//        }

        //USING ENHANCED FOR LOOPS
        for(boolean[] row: seats)
        {
            for(boolean seat: row)
            {
                totalSeats++;
            }
        }

        //count number of booked seats

//        for(int i = 0; i < seats.length; i++)
//        {
//            for(int j = 0; j < seats[i].length; j++)
//            {
//                if(seats[i][j] == true)
//                {
//                    bookedSeats++;
//                }
//            }
//        }

        for(boolean[] row: seats)
        {
            for(boolean seat: row)
            {
                if(seat == true)
                {
                    bookedSeats++;
                }
            }
        }

        //occupancy rate

        double rate = ((double)bookedSeats/(double)totalSeats)*100;

        return rate;
    }
}