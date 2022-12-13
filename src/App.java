import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu primeiro número: "));
        System.out.println("Digite seu segundo número: ");
        int num2 = scan.nextInt();
        int num3 = Integer.parseInt("1");

        if(num1 != num2){
            System.out.println("Os numeros são diferentes!");
        }else {
            System.out.println("Os numeros são iguais!");
        }

        int somados = num1 + num2;

        if(somados % 2 == 0){
            System.out.println("A soma dos dois números resulta em: " + somados + ", Que é um número par!");
        }else{
            System.out.println("A soma dos dois números resulta em: " + somados + ", Que é um número ímpar");
        }
        
        ArrayList<String> numeroEscolhido = new ArrayList<>();
        numeroEscolhido.add(Integer.toString(num1));
        numeroEscolhido.add(Integer.toString(num2));

        System.out.println("Algarismos escolhidos: " + numeroEscolhido);
    }
}
