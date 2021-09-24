package 신규아이디추천;

public class Solution {
	 public String solution(String new_id) {
	        String answer = "";
	        
	        //소문자로 바꾸는 메소드
	        new_id = new_id.toLowerCase();
	        
	        //정규식을 활용한 제거
	        answer = new_id.replaceAll("[^-_.a-z0-9]", "");
	        
	        answer = answer.replaceAll("[.]{2,}", ".");
	        
	        answer = answer.replaceAll("^[.]|[.]$", "");
	        
			 
			  //문자열의 길이가 0이면 'a'추가
			  if(answer.length() == 0) {
			  	answer += 'a';
			  }
			  
			  //길이가 16보다 클때
			  if(answer.length() >= 16) {
			  	//잘라냄
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
