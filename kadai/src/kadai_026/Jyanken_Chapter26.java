package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	HashMap<String,String> hand = new HashMap<String,String>();

	public Jyanken_Chapter26() {
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
	}
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		boolean isCorrect = false;
		String myChoice;
		Scanner scanner = new Scanner(System.in);
		
		do {
			myChoice = scanner.next();
			if(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
				isCorrect = true;
			}
			else {
				System.out.println("エラーです、もう一度入力してください");
			}
		}while(!isCorrect);
		
		scanner.close();
		
		return myChoice;
	}
	
	public String getRandom() {
		String[] jyanken = {"r", "s", "p"};
		String yourChoice = jyanken[(int) Math.floor(Math.random() * 3)];
		return yourChoice;
	}
	
	public void playGame(String me, String you) {
		String result;
		
		System.out.println("自分の手は" + this.hand.get(me) + ",対戦相手の手は" + this.hand.get(you));
		
		if(me.equals(you)) {
			result = "あいこです";
		}
		else if((me.equals("r") && you.equals("s")) || (me.equals("s") && you.equals("p")) || (me.equals("p") && you.equals("r"))) {
			result = "自分の勝ちです";
		}
		else {
			result = "自分の負けです";
		}
		
		System.out.println(result);
	}
}
