package �űԾ��̵���õ;

public class Solution {
	 public String solution(String new_id) {
	        String answer = "";
	        
	        //�ҹ��ڷ� �ٲٴ� �޼ҵ�
	        new_id = new_id.toLowerCase();
	        
	        //���Խ��� Ȱ���� ����
	        answer = new_id.replaceAll("[^-_.a-z0-9]", "");
	        
	        answer = answer.replaceAll("[.]{2,}", ".");
	        
	        answer = answer.replaceAll("^[.]|[.]$", "");
	        
			 
			  //���ڿ��� ���̰� 0�̸� 'a'�߰�
			  if(answer.length() == 0) {
			  	answer += 'a';
			  }
			  
			  //���̰� 16���� Ŭ��
			  if(answer.length() >= 16) {
			  	//�߶�
			  	  answer = answer.substring(0,15);
			      answer = answer.replaceAll("^[.]|[.]$", "");
			  }
			  
			  if(answer.length() <= 2) {
			  	String temp = answer.substring(answer.length()-1, answer.length());
			  	while(answer.length() < 3) {
			  		answer += temp;
			  	}
			  }
			 
	        
	        return answer;
	    }
}
