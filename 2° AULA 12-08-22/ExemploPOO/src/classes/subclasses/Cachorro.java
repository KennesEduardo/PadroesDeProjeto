package classes.subclasses;
import classes.superclasse.Animal;

public class Cachorro  extends Animal{

    private Humano melhorAmigo;
    private String raca;

    public Cachorro(){}

    public Cachorro(String nome, char genero, Integer idade, Double peso, String cor, Humano melhorAmigo, String raca) {
        super(nome, genero, idade, peso, cor);
        this.melhorAmigo = melhorAmigo;
        this.raca = raca;
    }

    public void latir(){
        System.out.println("Au Auuuuuuuu Au Au");
    }

    public Humano getMelhorAmigo() {
        return melhorAmigo;
    }

    public void setMelhorAmigo(Humano melhorAmigo) {
        this.melhorAmigo = melhorAmigo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }    
        
    @Override
    public void emitirSom() {
       latir();
        
    }

}
