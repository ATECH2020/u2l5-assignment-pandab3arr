import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        double taxRate;
        int numBoards;
        int numWindows;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales tax rate: ");
        taxRate = scanner.nextDouble();
        System.out.print("How many boards do you need? ");
        numBoards = scanner.nextInt();
        System.out.print("How many windows do you need? ");
        numWindows = scanner.nextInt();

        Construction myProject = new Construction(8.0,11.0, taxRate);

        total = myProject.lumberCost(numBoards) + myProject.windowCost(numWindows);
        System.out.println("Total: "+ total);
        System.out.print("Grand total: " + myProject.grandTotal(total));
        

    }
}
