import Garbage;
import PaperGarbage;
import PlasticGarbage;
import DustbinContentError;


class Dustbin {
    
    String color;
    PaperGarbage [] paperContent;
    PlasticGarbage [] plasticContent;
    Garbage [] houseWasteContent;

    public static void main(String [] args) {
        Garbage garbage = new Garbage();

        throwOutGarbage(String garbage) {
            if (garbage.instanceOf(PlasticGarbage)) {
                if(garbage.isClean == true) {
                    plasticContent.add(garbage);
                }
                else {
                    raise DustbinContentError;
                }
            }
            if(garbage.instanceOf(PaperGarbage)) {
                if(garbage.isSueezed == true) {
                    paperContent.add(garbage);
                }
                else {
                    raise DustbinContentError;
                }
             }
            if(garbage.instanceOf(Garbage) {
                houseWasteContent.add(garbage);
            }
                
            else {
                raise DustbinContentError;
            }
        }
  
    
    def empty_contents(self, paper_content = None, plastic_content = None, house_waste_content = None):
        self.paper_content = []
        self.plastic_content = []
        self.house_waste_content = []