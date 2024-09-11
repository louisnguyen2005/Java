package checkCoordinates;

import java.util.Scanner;

public class DiemDs {
    public static void main(String[] args) {
        Diem ds[];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chiu dai cua danh sach:");
        int n = sc.nextInt();
        ds = new Diem[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new Diem();
        }
        System.out.println("Nhap danh sach phan tu ");
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + (i + 1) + ":");
            ds[i].nhap();
        }
        System.out.println("Danh sach vua nhap ");
        for (int i = 0; i < n; i++) {
            System.out.println("phan tu thu " + (i + 1) + ": ");
            ds[i].in();
        }
    }

}
