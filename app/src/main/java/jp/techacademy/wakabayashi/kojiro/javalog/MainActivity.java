package jp.techacademy.wakabayashi.kojiro.javalog; //Package は、そのファイルのクラスがどのパッケージに属しているかを示すためのもの

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;      //ここを追加

public class MainActivity extends AppCompatActivity {   //public どこからでもアクセスできる。外向けに公開する関数はpublicを指定する。

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //protected	同じパッケージか、そのサブクラスからしかアクセスできない。
        // 関数の定義はprotected void onCreate(Bundle savedInstanceState) {...}のようにアクセスコントロール 戻り値の型（値を返さない場合はvoid ) 関数名(引数) {...}というルールで記述します。アクセスコントロールはクラスと同じになります。
        super.onCreate(savedInstanceState); //onCreate(...)関数に、Bundle savedInstanceStateというBundle型の値をsavedInstanceStateという引数を渡しています。
        setContentView(R.layout.activity_main);

        /*

        //　整数型の変数をnumという名前で作成して、10を代入する
        int num = 10;
        Log.d("javatest", String.valueOf(num));

        //numに５０を代入する
        num = 50;
        Log.d("javatest", String.valueOf(num));

        Log.d("javatest","ログへの出力テスト");  //ここを追加 Logクラスでは、d()という関数があり、Log.d(...)で関数を呼び出してログを出力します。

        int num1 = 10 + 5 - 2 * 4 / 2; //四則演算の計算の優先度は数学と同様に、足し算と引き算より、掛け算や割り算のほうが先に行われます。
        Log.d("javatest", "10 + 5 - 2 * 4 / 2 = " + String.valueOf(num1));

        boolean flag1 = true;
        boolean flag2 = false;
        Log.d("javatest", "flag1 && flag2 = " + String.valueOf(flag1 && flag2));
        Log.d("javatest", "flag1 || flag2 = " + String.valueOf(flag1 || flag2));

        int num2 = 10;
        int num3 = 20;
        Log.d("javatest", "num2 < num3 = " + String.valueOf(num2 < num3));

        int num4 = 60;

        if (num4 >= 90) {
            Log.d("javatest", "優");
        } else if (num4 >= 75) {
            Log.d("javatest", "良");
        } else if (num4 >= 60) {
            Log.d("javatest", "可");
        } else {
            Log.d("javatest", "不可");
        }

        int drink = 1;

        switch (drink) {
            case 0:
                Log.d("javatest", "コーヒーを注文しました");
                break;
            case 1:
                Log.d("javatest", "紅茶を注文しました");
                break;
            case 2:
                Log.d("javatest", "ミルクを注文しました");
                break;
            default:
                Log.d("javatest", "オーダーミスです");
                break;
        }

        for (int i = 1; i < 6; i++) {
            Log.d("javatest", "for文の " + String.valueOf(i) + "回目");
        }

        int num5 = 1;

        while (num5 < 6) {
            Log.d("javatest", "while文の " + String.valueOf(num5) + "回目");
            num5++;
        }

        int[] points = new int[5];
        points[0] = 10;
        points[1] = 6;
        points[2] = 15;
        points[3] = 23;
        points[4] = 17;

        for (int i = 0; i < points.length; i++) {
            Log.d("javatest", String.valueOf(points[i]));
        }

        total(50,1000);
        int t = total2(50,1000);
        Log.d("javatest", String.valueOf(t));

   */
        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        dog.say();  // ポチが吠えます（ログ出力）
        dog.move();
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        Dog.introduce();
        Log.d("javatest", Dog.to_jp + "のクラス変数です。");

        Dog dog2 = new Dog("ハチ", 10);   // 名前をハチ、年齢10歳で、Dogインスタンスを作る
        dog2.say();  // ハチが吠えます（ログ出力）
        Log.d("javatest", "犬の名前は" + dog2.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog2.age + "歳です。");

        Dog dog3 = new Dog("パチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog3.say();  // ポチが吠えます（ログ出力）
        Log.d("javatest", "犬の名前は" + dog.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");

        //Dog.introduce();
        //Log.d("javatest", Dog.to_jp + "のクラス変数です。");

        BigDog bigdog = new BigDog("ヨーゼフ", 15);     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say();
        Log.d("javatest", "犬の名前は" + bigdog.name + "です。");
        Log.d("javatest", "犬の年齢は" + bigdog.age + "歳です。");


        Human human = new Human("Tom", "趣味" , 5);

        human.say();
        human.think();
        Log.d("javatest", "私の名前は" + human.name + "です。");
        Log.d("javatest", "年は" + human.age + "です。");



    }


    private void total(int first, int last){
        int sum = 0 ;
        for(int i = first; i <= last; i++){
            sum = sum + i;
        }

        Log.d("javatest", String.valueOf(sum));
    }

    private int total2(int first, int last){ //intなどvoid以外にすると、値を返す必要があります。return 返す値;とすることで値を返すことができます
        int sum = 0 ;
        for(int i = first; i <= last; i++){
            sum = sum + i;
        }

        return sum;
    }
}


