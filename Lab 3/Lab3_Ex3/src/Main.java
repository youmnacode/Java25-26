//Youmna Feroz Khan, U24100333, Lab3, Ex3

public class Main {
    public static void main(String[] args) {

        double x;
        double y;

        int count = 0;

        for(int i = 0; i < 100000; i++)
        {
            x = -1 + Math.random()*(1 - (-1) );
            y = -1 + Math.random()*(1 - (-1) );

            if((Math.pow(x,2) + Math.pow(y,2) ) <= 1)
            {
                count++;
            }
        }

        double det_ratio1 = ((double)count)/100000;

        System.out.printf("Test 1 (100000 scans) detection rate: %.3f %n", det_ratio1);

        count = 0; //reset count
        for(int i = 0; i < 1000000; i++)
        {
            x = -1 + Math.random()*(1 - (-1));
            y = -1 + Math.random()*(1 - (-1));

            if((Math.pow(x,2) + Math.pow(y,2) ) <= 1)
            {
                count++;
            }
        }

        double det_ratio2 = ((double)count)/1000000;

        System.out.printf("Test 2 (1000000 scans) detection rate: %.3f %n", det_ratio2);

        double avg = (det_ratio1 + det_ratio2)/2 * 100;

        System.out.printf("Average detection rate: %.1f", avg);
        System.out.println("%");

    }
}