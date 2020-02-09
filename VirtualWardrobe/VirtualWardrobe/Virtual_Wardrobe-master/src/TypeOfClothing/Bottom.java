package TypeOfClothing;

import Outfit.WardrobeLists;
import main.InputTreatment;
import Outfit.TempleteOutfitClass;
import java.util.ArrayList;

public class Bottom extends Clothing
{
	public Bottom(String color, String appropriateClimate, String appropriateOccasion,
				  												int howManyTimesThePeaceWasUsed, String bottomSize)
	{
		super(color, appropriateClimate, appropriateOccasion, howManyTimesThePeaceWasUsed, bottomSize);
	}

	@Override
	public String toString()
	{
		return String.format
		("\nColor: %s;\nAppropriate Climate: %s;\nAppropriate Occasion: %s;\nHow many times the piece was used: %d;\nSize: %s;\n",
				super.getColor(), super.getAppropriateClimate(), super.getAppropriateOccasion(),
				super.getHowManyTimesThePieceWasUsed(), super.getSize());
	}

	public void putInOutfit(ArrayList<TempleteOutfitClass> MyBottons, ArrayList<TempleteOutfitClass> outfits, WardrobeLists wardrobeLists)
	{
		String color;
		String appropriateClimate;
		String appropriateOccasion;
		String bottomSize;
		boolean keepGoing = true;
		boolean exists = false;

		//WardrobeLists wardrobeLists = new WardrobeLists();

		while (keepGoing)
		{
			System.out.println("Choose your bottom characteristics");

			System.out.println("Color: ");
			color = InputTreatment.readString();

			System.out.println("Appropriate Climate: ");
			appropriateClimate = InputTreatment.readString();

			System.out.println("Appropriate Occasion: ");
			appropriateOccasion = InputTreatment.readString();

			System.out.println("Size: ");
			bottomSize = InputTreatment.readString();

			//System.out.println("in need of repair list" + wardrobeLists.getInNeedOfRepair());

			boolean available = true;

			for (Clothing OutfitTop : wardrobeLists.getInNeedOfRepair())
			{
				if (OutfitTop.getColor().equalsIgnoreCase(color)
						&& OutfitTop.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
						&& OutfitTop.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
						&& OutfitTop.getSize().equalsIgnoreCase(bottomSize))
				{
					System.out.println("This piece is currently unavailable because it is in the inNeedOfRepair list!");
					available = false;
					keepGoing = true;
					break;
				}
			}

			if (available)
			{
				for (TempleteOutfitClass OutfitBottom : MyBottons)
				{

					Bottom bottom = (Bottom) OutfitBottom;

					if (bottom.getColor().equalsIgnoreCase(color)
							&& bottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
							&& bottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
							&& bottom.getSize().equalsIgnoreCase(bottomSize))
					{
						outfits.add(bottom);
						exists = true;
						keepGoing = false;
						break;
					}
				}
				if (!exists)
				{
					System.out.println("There is not a piece with this characteristics in your wardrobe.");
				}
			}
		}
	}

	public  void replaceInOutfit(ArrayList<TempleteOutfitClass> MyBottons, ArrayList<TempleteOutfitClass> outfits, int index)
	{
		String color;
		String appropriateClimate;
		String appropriateOccasion;
		String bottomSize;
		boolean keepGoing = true;
		boolean exists = false;

		while (keepGoing)
		{
			System.out.println("Choose your bottom characteristics");

			System.out.println("Color: ");
			color = InputTreatment.readString();

			System.out.println("Appropriate Climate: ");
			appropriateClimate = InputTreatment.readString();

			System.out.println("Appropriate Occasion: ");
			appropriateOccasion = InputTreatment.readString();

			System.out.println("Size: ");
			bottomSize = InputTreatment.readString();

			for (TempleteOutfitClass OutfitBottom: MyBottons)
			{
				Bottom bottom = (Bottom) OutfitBottom;

				if (bottom.getColor().equalsIgnoreCase(color)
						&& bottom.getAppropriateClimate().equalsIgnoreCase(appropriateClimate)
						&& bottom.getAppropriateOccasion().equalsIgnoreCase(appropriateOccasion)
						&& bottom.getSize().equalsIgnoreCase(bottomSize))
				{
					outfits.set(index, OutfitBottom);
					exists = true;
					keepGoing = false;
					break;
				}
			}
			if (!exists)
			{
				System.out.println("There is not a piece with this characteristics in your wardrobe.");
			}
		}
	}
}
