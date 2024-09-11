package checkCoordinates;

import java.util.Scanner;

public class Diem {
    private int x, y;

    public Diem() {
        x = y = 0;
    }

    public Diem(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public Diem(int x2) {
        x = x2;
        y = 0;
    }

    public void gan(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public void in() {
        System.out.println("(" + x + "," + y + ")");
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap hoanh do:");
        x = sc.nextInt();
        System.out.println("nhap tung do:");
        y = sc.nextInt();

    }

    public int layX() {
        return x;
    }

    public int layY() {
        return y;
    }

    public void tinhtien(int dx, int dy) {
        dx += x;
        dy += y;
    }

    public float distance() {
        return (float) (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public float distanceAB(Diem B) {
        return (float) (Math.sqrt(Math.pow(x - B.x, 2) + Math.pow(y - B.y, 2)));
    }
}
