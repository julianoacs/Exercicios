public class Main {
    public static void main(String[] args) {
        int contador = 30;
        while (contador >= 0){
            if (contador % 4 == 0){
                System.out.println("[" + contador + "]");
            } else{
                System.out.println(contador);
            }
            contador--;
        }
        System.out.println("Acabou!");
    }
}