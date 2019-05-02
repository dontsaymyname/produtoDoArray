import java.util.ArrayList;

public class produtoArrays {
    public static void main(String[] args) {

        ArrayList array = new ArrayList();
        int resultado = 1;
        for (int i = 0; i <= array.length; i++){
            resultado = resultado * array[i];
        }System.out.println(resultado);
    }
}
