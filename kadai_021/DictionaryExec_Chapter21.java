package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();

		
		String[] fruitsName = {"apple","banana","grape","orange"};
		
		
		for( int i = 0; i < fruitsName.length; i++){
			
			if(dic.fruitsMap.get(fruitsName[i]) != null) {
				
				System.out.println(fruitsName[i] + "の意味は"+ dic.fruitsMap.get(fruitsName[i]));
				
			}else {
				System.out.println(fruitsName[i] + "は辞書に存在しません");
				
			}		
		}	
	}

}
