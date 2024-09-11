package Date;

public class SDDate {
    public static void main(String[] args) {
        Date t = new Date(9, 11, 2024);
        t.in();
        Date t1 = new Date();
        System.out.println("nhap ngay thang nam do:");
        t1.nhap();
        t1.in();
        t1 = t1.sumDay();
        t1.in();
        t = t.sumnDay(20);
        t.in();
    }
}
