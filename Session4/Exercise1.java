package Session4;
public class Exercise1 {
        static int[] array = {1, 2, 3, 4, 5};
        
    public static int sumaElementosArray() {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
}
