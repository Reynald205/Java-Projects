import javax.swing.JOptionPane;

public class Project0GUI{
		
public static void main(String[] args){
	int cap_e = 0;
	int low_e = 0;
	String sentence = JOptionPane.showInputDialog("Please Enter a sentence:");
	
	for(int i= 0; i < sentence.length(); i++)
	{
		
if(sentence.charAt(i) == 'e')
{low_e = low_e + 1;}
if(sentence.charAt(i) == 'E')
{cap_e = cap_e + 1;}
	
	}
	JOptionPane.showMessageDialog(null,"The amount of lower case e's is: " + low_e +"\n"+ "The amount of upper case E's is: " + cap_e,"Project 0 GUI",JOptionPane.PLAIN_MESSAGE);

}

}