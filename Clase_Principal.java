import java.util.Scanner;

public class Clase_Principal {

    public static void main(String[] args) {
        Clase_Arbol arbol = new Clase_Arbol();

        Scanner teclado = new Scanner(System.in);
        int cantidad, valor;

        System.out.println("Ingrese la cantidad de nodos que desea agregar al árbol:");
        cantidad = teclado.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el valor del nodo " + (i + 1) + ":");
            valor = teclado.nextInt();
            arbol.AgregarValor(valor);
        }
        System.out.println("\n Recorrido en preorden:");
        arbol.Preorden(arbol.raiz);
        
        System.out.println("\nRecorrido en inorden:");
        arbol.Inorden(arbol.raiz);
        
        System.out.println("\nRecorrido en postorden:");
        arbol.Postorden(arbol.raiz);
        
        teclado.close();
    }
}