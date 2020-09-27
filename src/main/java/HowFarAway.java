import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // Declared variables
        double longitude1;
        double latitude1;
        double longitude2;
        double latitude2;

        //create a new Scanner to get info from the user
        Scanner in = new Scanner(System.in);

        //get the starting and ending longitude and latitude from the user and uses them to initialize the instance variables
        System.out.print("Enter the latitude of the starting location: ");
        latitude1 = in.nextDouble();
        System.out.print("Enter the longitude of the starting location: "); 
        longitude1 = in.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        latitude2 = in.nextDouble();
        System.out.print("Enter the longitude of the ending location: "); 
        longitude2 = in.nextDouble();

        //makes a new "Geolocation" for both the starting and ending locations
        GeoLocation startingLoc = new GeoLocation(latitude1, longitude1);
        GeoLocation endingLoc = new GeoLocation(latitude2, longitude2);

        //calculates the distance from the two geolocations and prints it
        System.out.print("The distance is " + startingLoc.distanceFrom(endingLoc) + " miles.");
    }
}