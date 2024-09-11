package Date;

import java.util.Scanner;

public class Date {
    private int d, m, y;

    public Date() {
        d = m = 1;
        y = 2024;
    }

    public Date(int d1, int m1, int y1) {
        d = d1;
        y = y1;
        m = m1;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap ngay");
            d = sc.nextInt();
            System.out.println("nhap thang");
            m = sc.nextInt();
            System.out.println("nhap nam");
            y = sc.nextInt();
        } while (hople());

    }

    public void in() {
        System.out.println("ngay: " + d + "thang: " + m + "nam: " + y);
    }

    public boolean hople() {
        boolean h = false;
        int max[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (y % 4 == 0 && y % 100 != 0)
            max[2] = 29;
        if (d > 0 && m > 0 && y > 0 && m < 13 && d < max[m])
            h = true;
        return h;
    }

    public Date sumDay() {
        Date t = new Date(d, m, y);
        t.d++;
        if (!t.hople()) {
            t.d = 1;
            t.m++;

            if (!t.hople()) {
                t.m = 1;
                t.y++;
            }
        }
        return t;
    }

    public Date sumnDay(int n) {
        Date t = new Date(d, m, y);
        for (int i = 0; i < n; i++) {
            t = t.sumDay();
        }
        return t;
    }

}
