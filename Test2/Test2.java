package Test2;

public class Test2 {
    public void hoge() {
        System.out.println("Test2/hoge");
    }


    //private: 同一クラスからのみ利用可能
    // private void hoge2() {
    // }

    //同一パッケージ　or 継承したサブクラスから利用可能
    protected void hoge3() {
        System.out.println("Test2/hoge3");
    }

    //どういつパッケージ内からのみ利用可能
    void hoge4() {
        System.out.println("Test2/hoge4");
    }


}
