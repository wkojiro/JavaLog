package jp.techacademy.wakabayashi.kojiro.javalog;

/**
 * Created by wkojiro on 2017/02/09.
 */

import android.util.Log;

class Dog extends Animal implements Movable{ //アクセスコントロールは省略可能で、その場合にはこのレッスンのアクセスコントロールの項目で見たように「同じパッケージ内からしかアクセスできない」となります。


    //クラス変数
    static String to_jp = "犬";



    /*
    //コンストラクタ コンストラクタとはクラスからインスタンスが生成されるときに呼び出される初期化のためのメソッド
    public Dog() {
        name = "";
        age = 0;
    }
    */

    //引数とメンバ変数の名前が同じ場合はメンバ変数の前にthis.と付けて区別する必要があります。
    // 引数付きのコンストラクた
     public Dog(String name, int age){
      this.name = name;
     this.age = age;
     }

    /*

    //メソッド
    public void say(){

        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }
*/

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }


    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");
    }


}
