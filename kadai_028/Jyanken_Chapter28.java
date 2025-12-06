package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	
	//自分のじゃんけんの手を入力する。
	//Scannerで入力。正しい入力値であれば、Execクラスに入力された手を返す(return)
	//判定はifを使う
	//誤っている場合はエラー出力。再度入力してもらう
	
	
    //　***
	private final Scanner scanner = new Scanner(System.in);
	
	public String getMyChoice() {
				
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			System.out.println("入力：");
			
            if (!scanner.hasNext()) { 
                System.out.println("入力がありません。もう一度やり直してください。");
                scanner.nextLine(); 
                continue;
            }

            String myHand = scanner.next().trim().toLowerCase();

            if (myHand.equals("r") || myHand.equals("s") || myHand.equals("p")) {
                return myHand;
            } else {
                System.out.println("不正な入力です。r、s、p のいずれかを入力してください。");

            }
		}
	}
	
    //　***
	
	/*
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
		String myHand = scanner.next();
		
		if(myHand == null) {
			
			System.out.println("値が入力されていません。r（グー）かs（チョキ）かp（パー）を入力してください");
			
			continue;
			}
		if(myHand.equals("r") || myHand.equals("s") || myHand.equals("p")) {
			
			scanner.close();
			return myHand;

		}
		
			System.out.println("不正な入力です。r（グー）かs（チョキ）かp（パー）を入力してください");

		}
	}
*/
	
	
	//配列でグー、チョキ、パーを割り当てる
	//乱数出力で0～2まで出力して、配列から手を選択する
	//結果をExceクラスに返す

	public String getRandom() {
	String[] vsHand = {"r","s","p"};
	
	double i = Math.floor(Math.random () * 3 );
	
	return vsHand[(int)i];
	
	}


	//手を比較する。HashMpaを使用する。比較はswitchがよさそう？
	//switchだとうまく書けなさそう。ifなら行けそう。考える

	public void playGame(){
		
		HashMap<String,String> hands = new HashMap<String,String>();
		hands.put("r","グー");
		hands.put("s","チョキ");
		hands.put("p","パー");
		
		
		String judgeMyHand = getMyChoice();
		String judgeVsHand = getRandom() ;
		
		System.out.println("自分の手は" + hands.get(judgeMyHand));
		System.out.println("相手の手は" + hands.get(judgeVsHand));
		
		
		if(judgeMyHand.equals(judgeVsHand)) {
			System.out.println("あいこです");
			
		}
		if(judgeMyHand.equals("r") && judgeVsHand.equals("s")) {
			System.out.println("自分の勝ちです");
			
		}

		if(judgeMyHand.equals("r") && judgeVsHand.equals("p")) {
			System.out.println("自分の負けです");
			
		}

		
		if(judgeMyHand.equals("s") && judgeVsHand.equals("p")) {
			System.out.println("自分の勝ちです");
			
		}

		if(judgeMyHand.equals("s") && judgeVsHand.equals("r")) {
			System.out.println("自分の負けです");
			
		}
		
		if(judgeMyHand.equals("p") && judgeVsHand.equals("r")) {
			System.out.println("自分の勝ちです");
			
		}

		if(judgeMyHand.equals("p") && judgeVsHand.equals("s")) {
			System.out.println("自分の負けです");
			
		}
		
	}
		
		
}

