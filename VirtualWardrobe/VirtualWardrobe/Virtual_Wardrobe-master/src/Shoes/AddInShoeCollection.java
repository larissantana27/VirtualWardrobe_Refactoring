package Shoes;

import main.Command;
import main.InputTreatment;
import main.MySystem;

public class AddInShoeCollection implements Command
{
    public static int option;

    String shoesType;
    String shoesColor;

    boolean keepGoing = true;

    public void execute()
    {
        while (keepGoing)
        {
            System.out.println("Please complete the characteristics of the pair you're adding!");

            System.out.println("Type: ");
            shoesType = InputTreatment.readString();

            System.out.println("Color: ");
            shoesColor = InputTreatment.readString();

            Shoes newShoes = new Shoes(shoesType, shoesColor, 0);

            MySystem.MyShoes.add(newShoes);

            System.out.println("The shoe was added in your collection!");
            MySystem.totalNumberOfShoes++;

            System.out.println("Would you like to add another pair?\n");

            System.out.println("(1) Yes");
            System.out.println("(0) No");

            option = InputTreatment.twoOptions_0_1();

            if (option == 0) keepGoing = false;
        }
    }
}
