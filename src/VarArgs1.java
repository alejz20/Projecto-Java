
public class VarArgs1 {

    public  static void main(String[] args) {

        System.out.println(sumar(4,5,6,7,8));
    }
static int sumar(int ... numeros){
        int suma=0;
        for (int num : numeros){
            suma += num;
        }
        return suma;

}

}
