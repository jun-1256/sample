package jp.co.diworks.action;

public class Main5 {

	public static void main(String[] args) {
		System.out.println(hikizan(10,10));
		System.out.println(kakezan(10,10));
		System.out.println(warizan(10,10));
	}
	// 引数名は、別メソッドであれば同じでも良い
	// intのデータ型でhikizan、kakezam、warizanメソッドを作成。 
	// 各メソッドの引数に『int numer1, int number2』を設定。
	// hikizanの処理内容に『number1-number2』を設定。
	// kakezanの 処理内容に『number1*number2』を設定。
	// warizanの処理内容 に『number1/number2』を設定。
	public static int hikizan(int number1,int number2) {
		return number1-number2;
	}
	
	public static int kakezan(int number1,int number2) {
		return number1*number2;
	}
	
	public static int warizan(int number1,int number2) {
		return number1/number2;
	}

}
