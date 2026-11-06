public class IPAddress
{
    private String part1;
    private String part2;
    private String part3;
    private String part4;

    //static variable shared by all objects of the class
    private static int count = 0;

    //default constructor
    public IPAddress()
    {
        this.setAll("0","0","0","0");

        count++;
    }

    //parameterized constructor that receives the whole IP address as one string
    public IPAddress(String ip)
    {
        this.setIPAddress(ip);
        count++;
    }


    //method to set all

    public void setAll(String part1, String part2, String part3, String part4)
    {
        this.part1 = valid(part1);
        this.part2 = valid(part2);
        this.part3 = valid(part3);
        this.part4 = valid(part4);
    }

    //method to set IP address
    public void setIPAddress(String ip)
    {
        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";

        int dotCount = 0;

        for(int i = 0; i < ip.length(); i++)
        {
            char c = ip.charAt(i);

            //when we see a dot, go to the next part
            if(c == '.')
            {
                dotCount++;
            }
            else
            {
                if(dotCount == 0)
                {
                    p1 += c;
                }
                else if(dotCount == 1)
                {
                    p2 += c;
                }
                else if(dotCount == 2)
                {
                    p3 += c;
                }
                else if(dotCount == 3)
                {
                    p4 += c;
                }
            }
        }

        //if the number of dots is not 3 then the ip add is invalid
        if(dotCount != 3)
        {
            setAll("0", "0", "0", "0");

            System.out.println("The IP Address is invalid.");
        }

        //check if each part is between 0 and 255
        //we need another method for this

        part1 = valid(p1);
        part2 = valid(p2);
        part3 = valid(p3);
        part4 = valid(p4);

    }

    public String valid(String s)
    {
        //check if the string is empty
        //if so it is invalid

        if(s.length() == 0)
        {
            return "0";
        }

        //check if all characters are digits

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if(c < '0' || c > '9')
            {
                return "0";
            }
        }

        //now that we checked that they're all digits
        //we can convert the string into integer

        int value = Integer.parseInt(s); //just a segment with no dots

        //check if the integer is within the range of 0 and 255

        if(value >= 0 && value <= 255)
        {
            return s;
        }
        else
        {
            return "0";
        }

    }

    //get methods

    public String getPart1()
    {
        return part1;
    }

    public String getPart2()
    {
        return part2;
    }

    public String getPart3()
    {
        return part3;
    }

    public String getPart4()
    {
        return part4;
    }

    //getCount has to be static
    public static int getCount()
    {
        return count;
    }


    public void printIPAddress()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "IPAddress: " +
                "\npart1='" + part1 + '\'' +
                "\npart2='" + part2 + '\'' +
                "\npart3='" + part3 + '\'' +
                "\npart4='" + part4 + '\'' +
                "\n" + part1 + "." +
                part2 + "." +
                part3 + "." +
                part4;
    }


    //compare two ip address objects

    public boolean areEqual(IPAddress address2)
    {
        boolean areEquals = false;

        if(this.toString().equals(address2.toString()))
        {
            areEquals = true;
        }

        return areEquals;
    }

}