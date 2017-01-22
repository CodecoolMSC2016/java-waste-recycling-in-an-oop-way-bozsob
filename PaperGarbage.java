import Garbage;

public class PaperGarbage extends Garbage {
    
    
    public Boolean isSqueezed;


    public PaperGarbage(String name, Boolean isSqueezed) {
        super(name); // or String name = name;

        Boolean isSqueezed = isSqueezed;
        System.out.println("A new paper garbage: " + name);
    }
    

    public void squeezePaper() {
       this.isSqueezed = true;
       System.out.println(this.name + " is squeezed");
    }
}