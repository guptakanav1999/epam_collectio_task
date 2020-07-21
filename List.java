import java.util.ArrayList;
import java.util.Scanner;

public class List {
	static boolean fetch(ArrayList<Integer> ar,int ele){
		for(int i=0;i<ar.size();i++){
			if(ar.get(i)==ele){
				return true;
			}
		}
		return false;
	}
	static void remove(ArrayList<Integer>ar,int ele){
		for(int i=0;i<ar.size();i++){
			if(ar.get(i)==ele){
				ar.remove(i);
				System.out.println("Number is removed Successfully");
				return;
			}
		}
		System.out.println("Number is not there in the list");
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ar=new ArrayList<Integer>(10);
		for(int i=0;i<10;i++){
			ar.add(i);
		}
		System.out.println("List is created and initialized with 10 elements");
		boolean flag=true;
		while(flag){
			System.out.println("Operations that we can perform on the list are:");
			System.out.println("1.Fetching an element\n2.adding an element\n3.removing the element\n4.printing the list");
			System.out.println("Enter your option to perform operations on the list");
			int op=sc.nextInt();
			if(op==1){
				System.out.println("Enter a number to fetch in the list:");
				int ele=sc.nextInt();
				if(fetch(ar,ele)){
					System.out.println("Number is present in the list");
				}
				else{
					System.out.println("Number is not present in the list");
				}
			}
			else if(op==2){
				System.out.println("Enter a number to add in the list:");
				int ele=sc.nextInt();
				ar.add(ele);
				System.out.println("Number is added to the list");
			}
			else if(op==3){
				System.out.println("Enter a number to remove in the list:");
				int ele=sc.nextInt();
				remove(ar,ele);
			}
			else if(op==4){
				System.out.println(ar);
			}
			else{
				System.out.println("Invalid option");
			}
			System.out.println("Do you want to perform operations, true/false"); 
			flag=sc.nextBoolean();
		}
	}
}
