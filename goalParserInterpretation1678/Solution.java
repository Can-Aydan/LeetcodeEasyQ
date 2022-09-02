package goalParserInterpretation1678;

public class Solution {
    public String interpret(String command) {
        StringBuilder commandResult = new StringBuilder();
        for(int i=1;i<=command.length();i++) {
        	if(command.charAt(i-1)=='G') {
        		commandResult.append('G');
        	}else if(command.charAt(i-1)=='('&&command.charAt(i)==')') {
        		commandResult.append('o');
        	}else if(command.charAt(i-1)=='('&&command.charAt(i)=='a') {
        		commandResult.append('a');
        		commandResult.append('l');
        	}        	
        }
    	return commandResult.toString();
    }
}
