public class Main {
    public static void main(String[] args) {

        // Crear una pila con capacidad para 5 elementos
        ArrayStack pila = new ArrayStack(5);

        // Agregar elementos
        pila.push("A");
        pila.push("B");
        pila.push("C");

        // Mostrar la pila
        System.out.println("Pila: " + pila);

        // Mostrar el tamaño
        System.out.println("Tamaño: " + pila.size());

        // Ver el elemento de arriba sin eliminarlo
        System.out.println("Elemento superior: " + pila.peek());

        // Buscar un elemento
        System.out.println("¿Está B en la pila?: " + pila.search("B"));
        System.out.println("¿Está Z en la pila?: " + pila.search("Z"));

        // Sacar un elemento
        System.out.println("Elemento eliminado: " + pila.pop());

        // Mostrar nuevamente la pila
        System.out.println("Pila después de pop: " + pila);

        // Mostrar el nuevo tamaño
        System.out.println("Tamaño después de pop: " + pila.size());

        // Limpiar la pila
        pila.clear();

        System.out.println("Pila después de clear: " + pila);
        System.out.println("¿Está vacía?: " + pila.isEmpty());
    }
}