import java.util.Scanner;

public class Num {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.println("Ця програма генерує числа Фибоначчи");
        System.out.print("Введіть перше число: ");
        a = scan.nextInt();
        System.out.print("Введіть друге число: ");
        b = scan.nextInt();
        System.out.print("Кількість пар чисел: ");
        c = scan.nextInt();

        for(int i = 0; i < c;i++){
            System.out.print(a);
            a += b;
            System.out.print(" ");
            System.out.print(b);
            b += a;
            System.out.print(" ");
        }

    }
}
