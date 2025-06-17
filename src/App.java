import controllers.ArbolBinario;

public class App {
    public static void main(String[] args) throws Exception {
        ArbolBinario tree = new ArbolBinario();

        int[] values = {50, 17, 76, 9, 23, 54, 14, 19};
        for (int value : values) {
            tree.insert(value);
        }

        tree.imprimirArbol();

    }
}
