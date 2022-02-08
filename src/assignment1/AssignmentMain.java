package assignment1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class AssignmentMain {

	public static void main(String[] args) {
LinkedList<Integer> L1 = new LinkedList<>();
System.out.println("******problem1******");
System.out.println("enter the  integer inputs for the problem1");
Scanner sc=new Scanner(System.in);
System.out.print("enter the number of integer inputs for perfect numbers ");

int n=sc.nextInt();
for(int i=0;i<n;i++) {
	L1.add(sc.nextInt());
}

AssignmentTest1 Obj1 = new AssignmentTest1();
		L1 = Obj1.problem01(L1);
		System.out.println(L1);
		System.out.println("");
		
		System.out.println("******problem2******");

		System.out.println("enter the  size of linked list ");
		int n1=sc.nextInt();
		

		LinkedList<Integer> L2 = new LinkedList<>();
		System.out.println("enter the  integer data of linked list ");
		for(int i=0;i<n1;i++) {
			L2.add(sc.nextInt());
		}
		System.out.println("enter the  number that array addition must be equal ");
int y=sc.nextInt();
		System.out.println(Obj1.problem2(L2, y));
		
	
		System.out.println("******problem3******");
		System.out.println("enter size of arraylist");
		int n2=sc.nextInt();
ArrayList<Integer> L3 = new ArrayList<>();
System.out.println("enter the integer values of arraylist");

for(int i=0;i<n2;i++) {
	L3.add(sc.nextInt());
}

		System.out.println(Obj1.problem3(L3));
	
		System.out.println("enter size of arraylist");

		ArrayList<String> L4 = new ArrayList<>();
		System.out.println("enter the String values of arraylist of problem4");
		
		System.out.println("******problem4******");
		
		int n3=sc.nextInt();
		for(int i=0;i<n2;i++) {
			L4.add(sc.nextLine());
		}

		System.out.println(Obj1.problem4(L4));
		System.out.println("enter the String pattern");

		String s=sc.nextLine();	
		System.out.println("******problem5******");

		System.out.println(Obj1.problem05(s));
		
		
		Stack<Integer> S1 = new Stack<>();
				System.out.println("******problem6******");
		System.out.println("enter the Size of stack");
		System.out.println("enter the elements of stack");

		int n5=sc.nextInt();
		for(int i=0;i<n5;i++) {
			S1.push(sc.nextInt());
		}




		System.out.println(Obj1.problem6(S1));
	
		
		System.out.println("******problem7******");
		System.out.println("enter the Size of Linked List");

		int n6=sc.nextInt();
		

		Queue<String> Q1 = new LinkedList<>();
		System.out.println("enter the elements of Linked List");

		for(int i=0;i<=n6;i++) {
			Q1.add(sc.nextLine());
		}

		System.out.println(Obj1.problem7(Q1));
		
		
		System.out.println("******problem8******");
		System.out.println("enter the Size of Linked List");

		int n7=sc.nextInt();


		Queue<Integer> Q2 = new LinkedList<>(List.of(5, 3, 7,2));
		System.out.println("enter the elements of Linked List");

		for(int i=0;i<n7;i++) {
			Q2.add(sc.nextInt());
		}

		System.out.println(Obj1.problem8(Q2));

		
		
		Queue<Integer> Q3 = new LinkedList<>();
		/*Q3.offer(5);
		Q3.offer(3);
		Q3.offer(1);
		Q3.offer(4);*/
		System.out.println("******problem9******");
		System.out.println("enter the Size of Deque");

		int n8=sc.nextInt();
		System.out.println("enter the elements of Queue");
		for(int i=0;i<n8;i++) {
			Q3.add(sc.nextInt());
		}
		System.out.println(Obj1.problem9(Q3));
		
		
		
		Deque<String> Q4 = new ArrayDeque<>();
		/*Q4.add("M");
		Q4.add("A");
		Q4.add("T");
		Q4.add("H");
		Q4.add("S");*/
		System.out.println("******problem10******");
		System.out.println("enter the Size of Deque");

		int n9=sc.nextInt();
		System.out.println("enter the elements of Deque");
		for(int i=0;i<=n9;i++) {
			Q4.add(sc.nextLine());
		}
		System.out.println("enter the Size of opeartions performed");

		int n10=sc.nextInt();
		Integer[] arr = new Integer[n10];  
		System.out.println("enter the binary elements");

		for(int i=0;i<n10;i++) {
			arr[i]=sc.nextInt();
		}
		//Integer[] arr = {1, 1, 0};
		System.out.println(Obj1.problem10(Q4,arr));
	
	

	}

}
