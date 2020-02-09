package TypeOfClothing;

import main.Command;
import main.InputTreatment;
import main.MySystem;

public class AddInWardrobe implements Command
{
    public static int option;

    String color;
    String appropriateClimate;
    String appropriateOccasion;
    String bottomSize;
    String topSize;
    String onePieceSetType;
    String onePieceSetLenght;
    String coveringType;

    boolean keepGoing = true;
    boolean exists = false;

    public void execute()
    {
        while (keepGoing)
        {
            System.out.println("Witch of theses four types of clothing are ");

            System.out.println("(1) Bottom!");
            System.out.println("(2) Top!");
            System.out.println("(3) One peace set!");
            System.out.println("(4) Covering!");

            option = InputTreatment.fourOptions();

            System.out.println("Please complete the characteristics of the peace you're adding!");

            switch(option)
            {
                case 1:

                    System.out.println("Color: ");

                    color = InputTreatment.readString();

                    System.out.println("Appropriate Climate: ");
                    appropriateClimate = InputTreatment.readString();

                    System.out.println("Appropriate Occasion: ");
                    appropriateOccasion = InputTreatment.readString();

                    System.out.println("Size: ");
                    bottomSize = InputTreatment.readString();

                    exists = false;

                    for (Clothing OutfitBottom: MySystem.wardrobeLists.getWishToPurchase())
                    {
                        if (OutfitBottom.getColor().equalsIgnoreCase(color)
                                && OutfitBottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitBottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitBottom.getSize().equalsIgnoreCase(bottomSize))
                        {
                            MySystem.MyBottons.add(OutfitBottom);
                            MySystem.wardrobeLists.getWishToPurchase().remove(OutfitBottom);
                            System.out.println("This item was in your wish to purchase list.");
                            System.out.println("It was automatically removed!");
                            exists = true;
                            break;
                        }
                    }

                    if (!exists)
                    {
                        Bottom newBottom = new Bottom(color, appropriateClimate, appropriateOccasion, 0, bottomSize);
                        MySystem.MyBottons.add(newBottom);
                        System.out.println("This are your bottons in the moment:\n" + MySystem.MyBottons);
                    }

                    break;

                case 2:

                    System.out.println("Color: ");
                    color = InputTreatment.readString();

                    System.out.println("Appropriate Climate: ");
                    appropriateClimate = InputTreatment.readString();

                    System.out.println("Appropriate Occasion: ");
                    appropriateOccasion = InputTreatment.readString();

                    System.out.println("Size: ");
                    topSize = InputTreatment.readString();

                    exists = false;

                    for (Clothing OutfitTop: MySystem.wardrobeLists.getWishToPurchase())
                    {
                        if (OutfitTop.getColor().equalsIgnoreCase(color)
                                && OutfitTop.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && OutfitTop.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && OutfitTop.getSize().equalsIgnoreCase(topSize))
                        {
                            MySystem.MyBottons.add(OutfitTop);
                            MySystem.wardrobeLists.getWishToPurchase().remove(OutfitTop);
                            System.out.println("This item was in your wish to purchase list.");
                            System.out.println("It was automatically removed!");
                            exists = true;
                            break;
                        }
                    }

                    if (!exists)
                    {
                        Top newTop = new Top(color, appropriateClimate, appropriateOccasion, 0, topSize);
                        MySystem.MyTops.add(newTop);
                        System.out.println("This are your Tops in the moment:\n" + MySystem.MyTops);
                    }

                    break;

                case 3:

                    System.out.println("Color: ");
                    color = InputTreatment.readString();

                    System.out.println("Appropriate Climate: ");
                    appropriateClimate = InputTreatment.readString();

                    System.out.println("Appropriate Occasion: ");
                    appropriateOccasion = InputTreatment.readString();

                    System.out.println("One peace set type: ");
                    onePieceSetType = InputTreatment.readString();

                    System.out.println("Size: ");
                    onePieceSetLenght = InputTreatment.readString();

                    for (Clothing OutfitOnePieceSet: MySystem.wardrobeLists.getWishToPurchase())
                    {
                        OnePieceSet onePieceSet = (OnePieceSet) OutfitOnePieceSet;

                        if (onePieceSet.getColor().equalsIgnoreCase(color)
                                && onePieceSet.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && onePieceSet.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && onePieceSet.getOnePieceSetType().equalsIgnoreCase(onePieceSetType)
                                && onePieceSet.getOnePieceSetLenght().equalsIgnoreCase(onePieceSetLenght))
                        {
                            MySystem.MyBottons.add(onePieceSet);
                            MySystem.wardrobeLists.getWishToPurchase().remove(OutfitOnePieceSet);
                            System.out.println("This item was in your wish to purchase list.");
                            System.out.println("It was automatically removed!");
                            exists = true;
                            break;
                        }
                    }
                    if (!exists)
                    {
                        OnePieceSet newOnePieceSet = new OnePieceSet(color, appropriateClimate, appropriateOccasion,
                                0, onePieceSetType, onePieceSetLenght);
                        MySystem.MyOnePieceSets.add(newOnePieceSet);
                        System.out.println("This are your One Piece Sets in the moment:\n" + MySystem.MyOnePieceSets);
                    }

                    break;

                case 4:

                    System.out.println("Color: ");
                    color = InputTreatment.readString();

                    System.out.println("Appropriate Climate: ");
                    appropriateClimate = InputTreatment.readString();

                    System.out.println("Appropriate Occasion: ");
                    appropriateOccasion = InputTreatment.readString();

                    System.out.println("Type: ");
                    coveringType = InputTreatment.readString();

                    for (Clothing OutfitCovering: MySystem.wardrobeLists.getWishToPurchase())
                    {
                        Covering covering = (Covering)OutfitCovering;

                        if (covering.getColor().equalsIgnoreCase(color)
                                && covering.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
                                && covering.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
                                && covering.getCoveringType().equalsIgnoreCase(coveringType))
                        {
                            MySystem.MyBottons.add(covering);
                            MySystem.wardrobeLists.getWishToPurchase().remove(OutfitCovering);
                            System.out.println("This item was in your wish to purchase list.");
                            System.out.println("It was automatically removed!");
                            exists = true;
                            break;
                        }
                    }
                    if (!exists)
                    {
                        Covering newCovering = new Covering(color, appropriateClimate, appropriateOccasion,
                                0, coveringType);
                        MySystem.MyCoverings.add(newCovering);
                        System.out.println("This are your Coverings in the moment:\n" + MySystem.MyCoverings);
                    }

                    break;
            }

            System.out.println("The peace was added in your wardrobe!");
            MySystem.totalNumberOfPieces++;

            System.out.println("Would you like to add another peace?\n");

            System.out.println("(1) Yes");
            System.out.println("(0) No");

            option = InputTreatment.twoOptions_0_1();

            if (option == 0) keepGoing = false;
        }
    }
}
