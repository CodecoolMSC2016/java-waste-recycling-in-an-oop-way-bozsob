import Garbage;
import PaperGarbage;
import PlasticGarbage;
import Dustbin;


public class DustbinTest {

    public static void main(String [] args) {
        Dustbin dustbin = new Dustbin("fehér");
        PaperGarbage paper1 = new PaperGarbage("papírgalacsin", true);
        PaperGarbage paper2 = new PaperGarbage("müzlis doboz", false);
        PlasticGarbage plastic1 = new PlasticGarbage("PET palack", true);
        PlasticGarbage plastic2 = new PlasticGarbage("másik PET palack", false);
        Garbage garbage1 = new Garbage("megrágott szendvics");
        Garbage garbage2 = new Garbage("kinder tojás játék");

        System.out.println("You have to throw out the " + paper1.name);
        dustbin.throwOutGarbage(paper1);
        
        System.out.println("You have to throw out the " + paper2.name);
        dustbin.throwOutGarbage(paper2);
        System.out.println("Squeeze it first!");
        paper2.squeezePaper();
        dustbin.throwOutGarbage(paper2);

        System.out.println("You have to throw out the " + plastic1.name);
        dustbin.throwOutGarbage(plastic1);
        
        System.out.println("You have to throw out the " + plastic2.name);
        dustbin.throwOutGarbage(plastic2);
        System.out.println("Clean it first!");
        plastic2.cleanPlastic();
        dustbin.throwOutGarbage(plastic2);

        System.out.println("You have to throw out the " + garbage1.name);
        dustbin.throwOutGarbage(garbage1);

        System.out.println("You have to throw out the " + garbage2.name);
        dustbin.throwOutGarbage(garbage2);

        System.out.println("Dustbin is full, now empty it!");
        dustbin.emptyContents();
    }
}


