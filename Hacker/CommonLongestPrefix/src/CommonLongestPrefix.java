
public class CommonLongestPrefix {

	public String longestCommonPrefix(String[] strs) {
        int minLength = getMinLength(strs);
        String prefix = "";
        for(int i=0;i<minLength;i++){
        	for(int j=0;j<strs.length;j++){
        		//if(strs[j].char[i])
        	}
        }
		return "";
        
    }
	
	public int getMinLength(String[] strs){
		String min = strs[0];
		for(int i=1;i<strs.length;i++){
			if(min.length()>strs[i].length()){
				min = strs[i];
			}
		}
		return min.length();
	}
}
