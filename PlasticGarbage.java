import Garbage;

class PlasticGarbage extends Garbage {
    
    
    public Boolean isClean;


    public PlasticGarbage(String name, Boolean isClean) {
        super(name); // or String name = name;

        Boolean isClean = isClean;
        System.out.println("A new plastic garbage: " + name);
    }
    

    public void cleanPlastic() {
       this.isClean = true;
       System.out.println(this.name + " is clean");
    }
}