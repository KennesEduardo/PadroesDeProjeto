public class Disponivel extends EstadoLivro {

    // Uma vez que neste exemplo os estados dos livros não vão conter
    // atributos dependentes do contexto, fazemos com que Disponivel seja um
    // Singleton
  
    private static Disponivel instancia; // Instância do Singleton Disponivel
  
    protected Disponivel() {}
  
    public static Disponivel instancia() {
      if (instancia == null)
        instancia = new Disponivel();
  
      return instancia;
    }
  
    // Métodos específicos deste estado concreto. solicitar modifica o estado
    // do livro, enquanto que devolver simplesmente o ignora.
  
    public boolean solicitar(Livro livro) {
      System.out.println("Atendendo pedido do livro " + livro);
      livro.estabelecerEstado(Emprestado.instancia());
      return true;
    }
  
    public void devolver(Livro livro) {
      System.out.println("Oba... já tenho o livro " + livro);
    }
  
    // Redefine o nome do estado...
  
    public String toString() {
      return "Disponivel";
    }
  }