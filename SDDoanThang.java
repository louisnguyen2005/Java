package buoi3;

public class SDDoanThang {
    public static void main(String[] args) {
        Diem A = new Diem(2, 5);
        Diem B = new Diem(2, 5);
        DoanThang AB = new DoanThang(A, B);
        AB.inDoanThang();

        AB.tinhTienDiem(5, 3);
        System.out.println("Doan thang AB sau khi tinh tien la");
        AB.inDoanThang();
        System.out.println("goc cua AB voi truc tung sau khi tinh tien la:" + AB.gocTrucTung());
        Diem C = new Diem();
        Diem D = new Diem();
        DoanThang CD = new DoanThang(C, D);
        CD.nhapDoanThang();
        System.out.println("do dai cua doan thang CD la:" + CD.doDaiDoanThang());
        System.out.println("goc giua CD voi truc hoanh: " + CD.gocTrucHoanh());

    }
}
