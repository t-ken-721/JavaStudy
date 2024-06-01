package Test1;

import Test2.Test2;
import Test3.Test3;

public class Test1 {
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        //アップキャスト
        //Test2が持っているメンバしかアクセスできない
        Test2 test2Sub = new Test3();

        // test3.hoge();
        // test2Sub.hoge();
        test3.printClassName();
        // test2Sub.printClassName();

        // Test2を継承して入れれば引数に入れてし

    }
}