import java.util.Scanner;

public class Aphanumcode {

	public static void main(String[] args) {
		 String src;
		 String s = "";

		 Scanner input = new Scanner(System.in);
		 System.out.println("Please Enter what you want to encrypt: ");
		 src = input.nextLine(); 
		 
		 StringBuffer sbr = new StringBuffer();
		 
		 String str = src;
		 char c[]=str.toCharArray();
		 for(int i=0;i<c.length;i++)
		 {
			 if(c[i]=='x'||c[i]=='y'||c[i]=='z'||c[i]=='X'||c[i]=='Y'||c[i]=='Z')
			 {
				 sbr.append((char)(str.charAt(i)-23));
		
			 }else{
			     sbr.append((char)(str.charAt(i)+3));
			 }
			
		 }
		 s=sbr.toString();
	     System.out.println(s);

	}

}
