public class VarArgs1 {

    public static void main(String[] args) {

        System.out.println(sumar( "Alexr FDF"  , 4,5, 6, 7, 8));
    }

    static int sumar(String nombre, int... numeros) {
        System.out.println("La nombre:" + nombre);
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;

    }
}
