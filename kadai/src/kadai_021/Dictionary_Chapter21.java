package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> dic = new HashMap<String,String>();

	public Dictionary_Chapter21() {
		dic.put("apple","りんご");
		dic.put("peach","桃");
		dic.put("banana","バナナ");
		dic.put("lemon","レモン");
		dic.put("pear","梨");
		dic.put("kiwi","キウイ");
		dic.put("strawberry","いちご");
		dic.put("grape","ぶどう");
		dic.put("muscat","マスカット");
		dic.put("cherry","さくらんぼ");
	}
	
	public void lookUpInDictionary(String[] words) {
		for(int i = 0; i < words.length; i++) {
			if(this.dic.get(words[i]) != null) {
				System.out.println(words[i] + "の意味は" + this.dic.get(words[i]));
			}
			else {
				System.out.println(words[i] + "は辞書に存在しません");
			}
		}
	}

}
