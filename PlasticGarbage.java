import Garbage;

class PlasticGarbage extends Garbage {
    String name;
    boolean isClean;

    cleanPlastic() {
        if(isClean == false) {
            isClean = true;
        }
    }
}