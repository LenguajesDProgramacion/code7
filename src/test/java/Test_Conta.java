import java.util.Scanner;

public class Test_Conta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Utilizar el constructor por defecto

        Contador contador1 = new Contador();

        int n;
        System.out.println("Introduce valor para inicializar el contador: ");
        n = sc.nextInt();

        //asignar un valor al contador
        contador1.setCont(n);

        //incrementar el contador

        contador1.incrementar();
        //mostrar el valor actual

        System.out.println(contador1.getCont());



        //restar 1 al valor del contador
        contador1.decrementar();

        //mostrar el valor actual
        System.out.println(contador1.getCont());


        Contador contador2 = new Contador(n);


        contador2.incrementar();
        contador2.incrementar();
        System.out.println(contador2.getCont());
        contador2.decrementar();
        System.out.println(contador2.getCont());


        Contador contador3 = new Contador(contador2);
        contador3.incrementar();
        contador3.incrementar();


        System.out.println(contador3.getCont());
    }



}
