import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {

        double a, e, d, m, p, v, b, n, t, u, total;

        a = 2.14;
        e = 3.67;
        d = 1.11;
        m = 0.95;
        p = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("kaç kilo armut? ;");
        v = input.nextDouble();

        System.out.print("kaç kilo elma? :");
        b = input.nextDouble();

        System.out.print("kaç kilo domates? : ");
        n = input.nextDouble();

        System.out.print("kaç kilo muz? :");
        t = input.nextDouble();

        System.out.print("kaç kilo patlıcan? :");
        u = input.nextDouble();

        total = (a * v) + (e * b) + (d * n) + (m * t) + (p * u);

        System.out.print("toplam tutar : " + total);
        total = input.nextDouble();







    }
}
