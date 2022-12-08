package Prototype;

abstract class Documento implements ICloneable {

    protected Documento clone() {
    
        Object clone = null;
   
        try {
             clone = super.clone();
        } catch (CloneNotSupportedException ex) {
             ex.printStackTrace();
        }
        
        return (Documento) clone;
    }
}
    