public class Clase_Arbol {

    Nodo raiz;

    public Clase_Arbol() {
        this.raiz = null;
    }

    public Nodo CrearNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }
        if (valor < nodo.valor) {
            nodo.izquierda = CrearNodo(nodo.izquierda, valor);
        }
        else{
            nodo.derecha = CrearNodo(nodo.derecha, valor);
        }
        return nodo;
    }
    public void AgregarValor(int valor) {
        raiz = CrearNodo(raiz, valor);
    }
    
    //Recorrido en preorden
    public void Preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            Preorden(nodo.izquierda);
            Preorden(nodo.derecha);
        }
    }
    //Recorrido en inorden
    public void Inorden(Nodo nodo) {
        if (nodo != null) {
            Inorden(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            Inorden(nodo.derecha);
        }
    }
    //Recorrido en postorden
    public void Postorden(Nodo nodo) {
        if (nodo != null) {
            Postorden(nodo.izquierda);
            Postorden(nodo.derecha);
            System.out.print(nodo.valor + " ");
        }
    }
}