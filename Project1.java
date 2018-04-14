import java.io.*;
import java.util.*;

public class Project1{
	
private Scanner x;

public void main(String[] args){
	
	try{
		x = new Scanner(new File("Project1.txt"));
	}
	catch (Exception e){
		System.out.println("could not find file");
	}
	
int i = 0;
	while(x.hasNext()){
		String accepted[] = new String [20];
		String word = x.next();
	if(word.matches("[a-zA-Z]+")){
		accepted[i] = word;
		i++;
		}
	for(int a=0; accepted[a]!=null;a++){
		System.out.println(accepted[a]);
	}
}
}
}