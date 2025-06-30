package aula;

public class App {
    public static void main(String[] args) {
        int num = 10;
        int result = 10;
        System.out.println("valor original " + result);
        result = num++;
        System.out.println("o valor de num após incremento " + num);
        System.out.println("o valor do result após o incremeto " + result);
        result = 10;
        num = 10;
        result = ++num; 
        System.out.println("o valor de num após incremento " + num);
        System.out.println("resultado de result após incremento " + result);
        
    }
}
    