package Shoes;

import Outfit.WardrobeLists;
import main.InputTreatment;
import Outfit.TempleteOutfitClass;
import java.util.ArrayList;

public class Shoes extends TempleteOutfitClass
{
	private String type;
	private String color;
	private int howManyTimesThePairWasUsed;

	public Shoes (String type, String color, int howManyTimesThePairWasUsed)
	{
		this.type = type;
		this.color = color;
		this.howManyTimesThePairWasUsed = howManyTimesThePairWasUsed;
	}

	public String getType()
	{
		return type;
	}

	public String getColor()
	{
		return color;
	}

	public int getHowManyTimesThePairWasUsed()
	{
		return howManyTimesThePairWasUsed;
	}

	public void setHowManyTimesThePairWasUsed ()
	{
		this.howManyTimesThePairWasUsed++;
	}

	@Override
	public String toString()
	{
		return String.format
				("\nType: %s;\nColor: %s;\nHow many times the pair was used: %d;\n",
						this.getType(), this.getColor(), this.getHowManyTimesThePairWasUsed());
	}

	public void putInOutfit(ArrayList<TempleteOutfitClass> MyShoes, ArrayList<TempleteOutfitClass> outfits, WardrobeLists wardrobeLists)
	{
		String shoesType;
		String shoesColor;
		boolean keepGoing = true;
		boolean exists = false;

		while (keepGoing)
		{
			System.out.println("Choose your shoes characteristics");

			System.out.println("Type: ");
			shoesType = InputTreatment.readString();

			System.out.println("Color: ");
			shoesColor = InputTreatment.readString();

			for (TempleteOutfitClass OutfitShoes: MyShoes)
			{
				Shoes shoes = (Shoes) OutfitShoes;

				if (shoes.getType().equalsIgnoreCase(shoesType)
						&& shoes.getColor().equalsIgnoreCase(shoesColor))
				{
					outfits.add(OutfitShoes);
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

	public void replaceInOutfit(ArrayList<TempleteOutfitClass> MyShoes, ArrayList<TempleteOutfitClass> outfits, int index)
	{
		String shoesType;
		String shoesColor;
		boolean keepGoing = true;
		boolean exists = false;

		while (keepGoing)
		{
			System.out.println("Choose your shoes characteristics");

			System.out.println("Type: ");
			shoesType = InputTreatment.readString();

			System.out.println("Color: ");
			shoesColor = InputTreatment.readString();

			for (TempleteOutfitClass OutfitShoes: MyShoes)
			{
				Shoes shoes = (Shoes) OutfitShoes;

				if (shoes.getType().equals(shoesType) && shoes.getColor().equals(shoesColor))
				{
					outfits.set(index, OutfitShoes);
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
