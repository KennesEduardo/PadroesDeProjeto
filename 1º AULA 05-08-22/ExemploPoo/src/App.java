public class App {
    public static void main(String[] args) {
        
        Gato g1 = new Gato("Manda chuva", 'M', 2, 9.0, "laranjinha");
        System.out.println(g1.getNome());
        g1.setNome("Batatinha");
        System.out.println(g1.getNome());


    }
}
