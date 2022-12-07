public class Livro {

    private EstadoLivro estado;    
  
    private String titulo;
  
    public Livro(String titulo) {
      this.titulo = titulo;
      this.estado = Disponivel.instancia();
    }
  
    public String toString() {
      return (this.titulo + " (" + this.estado + ")" );
    }
  

    void estabelecerEstado(EstadoLivro estado) {
      System.out.println("Transitando de " + this.estado + " a " + estado);
      this.estado = estado;
    }
  
    public void devolver() {
      this.estado.devolver(this);
    }
  
    public boolean solicitar(Livro l1) {
      return this.estado.solicitar(this);
    }

    public void devolver(Livro l1) {
    }
  }
