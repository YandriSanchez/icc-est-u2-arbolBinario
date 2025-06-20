import controllers.ArbolBinario;

public class App {
    public static void main(String[] args) throws Exception {
        ArbolBinario tree = new ArbolBinario();

        int[] values = {50, 17, 76, 9, 23, 54, 14, 19};
        for (int value : values) {
            tree.insert(value);
        }

        System.out.println("Inorden");
        tree.imprimirArbolInorden();

        System.out.println("");
        System.out.println("Preorden");
        tree.imprimirArbolPreorden();

        System.out.println("");
        System.out.println("Postorden");
        tree.imprimirArbolPosorden();

        System.out.println("");
        System.out.println("Se encontro el 23?..."+tree.buscar(23));
        System.out.println("Se encontro el 77?..."+tree.buscar(77));
    }
}
