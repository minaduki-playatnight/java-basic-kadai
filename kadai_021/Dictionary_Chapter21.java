package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	private HashMap<String, String> fruitsMap;

		public Dictionary_Chapter21() {
	        fruitsMap = new HashMap<>();
			fruitsMap.put("apple", "りんご");
	        fruitsMap.put("peach", "桃");
	        fruitsMap.put("banana", "バナナ");
	        fruitsMap.put("lemon", "レモン");
	        fruitsMap.put("pear", "梨");
	        fruitsMap.put("kiwi", "キウィ");
	        fruitsMap.put("strawberry", "いちご");
	        fruitsMap.put("grape", "ぶどう");
	        fruitsMap.put("muscat", "マスカット");
	        fruitsMap.put("cherry", "さくらんぼ");			
			}

	

	
	public void dicFruits(String[] addFruits){
		
        if (addFruits == null) {
            System.out.println("入力が null です");
            return;
        }		
        
		for( int i = 0; i < addFruits.length; i++){
			
			String key = addFruits[i];
			String value = fruitsMap.get(key);
		
			if(value != null) {
			
				System.out.println(key+ "の意味は"+ value);
			
			}else {
				System.out.println(key + "は辞書に存在しません");
			}
		}		
	}
}


	
	
	
	
    

