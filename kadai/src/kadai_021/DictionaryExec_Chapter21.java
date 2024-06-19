package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを作成する
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		// 調べる英単語を配列にセットする
		String[] array = {"apple", "banana", "grape", "orange"};
		
		// 辞書を調べる
		for(int i = 0; i < array.length; i++) {
			dictionary.lookUpInDictionary(array[i]);
		}
	}

}
