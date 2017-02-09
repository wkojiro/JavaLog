package jp.techacademy.wakabayashi.kojiro.javalog;

/**
 * Created by wkojiro on 2017/02/09.
 */


import android.util.Log;


class Human extends Animal implements Thinkable {

     // クラス変数
    static String to_jp = "日本人";

    String hobby = "趣味";

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void introduce(){
        Log.d("javatest","これは人間クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳)" + "です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + hobby + "について考える");
    }

}

