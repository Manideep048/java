//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

class p1 {
    p1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        if (l < 0) {
            System.out.println("rectangle is not formed");
        } else if (w < 0) {
            System.out.println("rectangle not formed");
        } else {
            rec rec1 = new rec();
            rec1.set((double)l, (double)w);
            System.out.println("area=" + rec1.area());
            System.out.println("perimeter" + rec1.perimeter());
        }

    }
}
