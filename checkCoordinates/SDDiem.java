package checkCoordinates;

public class SDDiem {
    public static void main(String[] args) {
        Diem A = new Diem(5, 7);
        System.out.println("toa do cua A la:");
        A.in();
        Diem B = new Diem();
        B.nhap();
        B.in();
        Diem C = new Diem(10);
        Diem D = new Diem(-B.layX(), -B.layY());
        System.out.println("Diem doi xung cua D la:");
        D.in();
        System.out.println("khoang cach tu B den O:" + B.distance());
    }
}
