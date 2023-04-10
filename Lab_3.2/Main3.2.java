package Lab_3;

public class Main{
    public static void main(String[] args){
        TamGiac tg = new TamGiac(0, 0);
        tg.nhapTamGiac();
        tg.inTamGiac();

        tg.Ktra();
        tg.tinhChuVi();
        tg.tinhDienTich();

        Duongtron dt = new DuongTron(0,0,0);
        dt.nhapDuongTron();
        dt.inDuongTron();
        dt.chuViDuongTron();
        dt.dienTichDuongTron();
    }
}
