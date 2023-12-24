package Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayMapFilter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> num=new ArrayList<>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
    
		List<Integer> filteredodd=num.stream().filter(temp -> temp%2!=0).toList();
		//num.stream().filter(temp -> temp%2!=0 ).forEach(x -> System.out.print(x+" "));
		System.out.println("ODD NUMBERS "+filteredodd);
		
		
		List<Integer> square=filteredodd.stream().map(temp -> temp*temp ).toList();
		System.out.println("SQUARE OF ODDS "+square);
       //num.stream().filter(temp -> temp%2!=0 ).forEach(x -> System.out.print(x+" "));
         
	    int sum=square.stream().mapToInt(temp -> temp ).sum();
	    System.out.println("SUM "+sum);
	}
}
