package Outfit;

import java.util.ArrayList;

public abstract class TempleteOutfitClass
{
    public abstract void putInOutfit(ArrayList<TempleteOutfitClass> listClothing, ArrayList<TempleteOutfitClass> outfits, WardrobeLists wardrobeLists);
    public abstract void replaceInOutfit(ArrayList<TempleteOutfitClass> listClothing, ArrayList<TempleteOutfitClass> outfits, int index);

}
