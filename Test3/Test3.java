package Test3;

import Test2.Test2;

public class Test3 extends Test2{
    public void printClassName() {
        //super: 継承下のクラスをスーパークラス、継承先のクラスをサブクラスと言う
        //super: スーパークラスのsuper(test2のhogeが呼ばれる)
        super.hoge();

        // this: 自身を指定（Test３のhogeが呼ばれる）
        this.hoge();

        System.err.println(this.getClass().getName());
    }

    @Override public void hoge() {
        System.out.println("Test3/hoge");
    }
}