import java.util.*;
import Garbage;
import PaperGarbage;
import PlasticGarbage;


class Dustbin {
    
    public String color;
    public ArrayList [] paperContent; // or ArrayList<Object> = ...
    public ArrayList [] plasticContent;
    public ArrayList [] houseWasteContent;

    public Dustbin(String color) {
        
        String color = color;
        paperContent = new ArrayList[5];
        plasticContent = new ArrayList[5];
        houseWasteContent = new ArrayList[5];
        System.out.println("A new dustbin, which color is: " + color);
    }


    public void throwOutGarbage(Garbage garbage) {
        
        if (garbage instanceOf PlasticGarbage) {
            if(garbage.isClean == true) {
                plasticContent.add(garbage);
                System.out.println(garbage.name + " added to the plastic container.");
            }
            else {
                System.out.println(garbage.name + " is not clean.");
            }
        }
        
        else if(garbage instanceOf PaperGarbage) {
            if(garbage.isSqueezed == true) {
                paperContent.add(garbage);
                System.out.println(garbage.name + " added to the paper container.");
            }
            else {
                System.out.println(garbage.name + " is not squeezed.");
            }
            }
        
        else if(garbage instanceOf Garbage &&
                garbage instanceOf PlasticGarbage == false &&
                garbage instanceOf PaperGarbage == false) {
            
            houseWasteContent.add(garbage);
            System.out.println(garbage.name + " added to the house waste container");
        }
        else {
            System.out.println(garbage.name + " is not a garbage");
        }
    }
  
    
    public void emptyContents() {

        paperContent = null;
        plasticContent = null;
        houseWasteContent = null;
        System.out.println("Dustbin empty");
    }
}