package Session4;
public class Exercise1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int suma = sumaElementosArray(array);

        System.out.println("La suma de los elementos del array es: " + suma);
    }
    public static int sumaElementosArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
}
