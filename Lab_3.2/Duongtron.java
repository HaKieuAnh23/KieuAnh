package Lab_3;

import java.utill.Scanner;

public class DuongTron extends Diem{
    private int r;

    public DuongTron(int x, int y, int r){
        super(x, y);
        this.r = r;
    }

    public int getR(){
        return r;
    }

    public void setR(int r){
        this.r = r;
    }

    public void nhapDuongTron(){
        Scanner scn = new Scanner(System.in);
        System.out.print(" nhap toa do diem 0(X, Y) : ");
        setX(scn.nextInt());
        SetY(scn.nextInt());

        System.out.print(" Nhap ban kinh R : ");
        setR(Scn.nextInt());
    }

    public void inDuongTron(){
        System.out.println(" Tam cua duong tron la : "+"("+getX()+", "+getY()+") ");
        System.out.println(" Ban kinh cua duong tron la : "+r);
    }

    public void chiViDuongTron(){
        double cvdt = (2*r)*Math.PI;
    }

}