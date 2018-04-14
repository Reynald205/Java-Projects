import java.util.Scanner;

public class ProjectA 
{
		
public static void main(String[] args){
int cap_e = 0;
int low_e = 0;
	System.out.println("Please Enter a sentence:");
	Scanner typed = new Scanner(System.in);
	String sentence = typed.nextLine();
	typed.close();
	for(int i= 0; i < sentence.length(); i++)
	{
		
if(sentence.charAt(i) == 'e')
{low_e = low_e + 1;}
if(sentence.charAt(i) == 'E')
{cap_e = cap_e + 1;}
	
	}
System.out.println("The amount of lower case e's is: " + low_e);
System.out.println("The amount of upper case E's is: " + cap_e);

}

}