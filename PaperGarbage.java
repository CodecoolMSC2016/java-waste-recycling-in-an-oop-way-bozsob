import Garbage;

class PaperGarbage extends Garbage {
    String name;
    boolean isSqueezed;

    squeezePaper() {
        if(isSqueezed == false) {
            isSqueezed = true;
        }
    }
}