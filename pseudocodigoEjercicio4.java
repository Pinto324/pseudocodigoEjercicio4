
import java.util.Scanner;

public class pseudocodigoEjercicio4 {
    public static void main(String[] args){
        int Edad;
        int menor = 100;
        int mayor = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 20 ; i++){
        System.out.println("Ingrese la edad "+ (i+1) +":");
        Edad = sc.nextInt();
            if(Edad < menor){
                menor = Edad;
            }else if(Edad > mayor){
                mayor = Edad;
            }
        }
        System.out.println("La edad mayor es: "+mayor);
        System.out.println("La edad menor es: "+menor);
    }     
}
