package assignment1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AssignmentTest1 {

	

		public LinkedList<Integer> problem01(LinkedList<Integer> L1) 
		{
			LinkedList<Integer> out1
			= new LinkedList<Integer>();
			int l=L1.size();
			for(int i=0 ; i < l ; i++) 
			{
				int num  = perfectnum(L1.get(i));
				
				if(num > 1)
				{
					out1.add(num);
				}
			}
			
			return out1;
		}
		
	    static int perfectnum(int N)
	    {
	        if (N == 1)
	            return 1;
	  
	        int count = 1;
	        
	        for (int i = 2; i < N; i++) {
	            
	            if (N % i == 0) {
	                count += i;
	            }
	            
	        }
	  
	        if (count == N)
	            return N;
	        
	        return 0;
	    }
	    
	    public LinkedList<LinkedList<Integer>> problem2(LinkedList<Integer> L1, int K) 
		{
	    	LinkedList<LinkedList<Integer>> out1 = new LinkedList<LinkedList<Integer>>();
			
			for(int i=0;i< L1.size();i++)
			{	
				LinkedList<Integer> list = new LinkedList<Integer>();
				
				if(i < L1.size() - 1)
				{
					int num1 = L1.get(i);
					int num2 = L1.get(i + 1);
					if((num1 + num2) == K) 
					{
						list.add(num1);
						list.add(num2);
						out1.add(list);
					}
				}
			}
			return out1;
		}
	    
	    public Integer problem3(ArrayList<Integer> l) 
		{
	    	int max = Integer.MIN_VALUE;
			for(int i=0 ; i < l.size() ; i++) 
			{
				if(l.get(i) >= max)
				{
					max = l.get(i);
				}
			}
			return max;
		}
	    
	    public ArrayList<String> problem4(ArrayList<String> l1) 
		{
	    	Collections.sort(l1, Comparator.comparing(String::length));
	    	return l1;
		}
	    
	    public boolean problem05(String s)
	    {
	        Deque<Character> st
	            = new ArrayDeque<Character>();
	 
	        for (int i = 0; i < s.length(); i++)
	        {
	            char c1 = s.charAt(i);
	 
	            if (c1 == '(' || c1 == '[' || c1 == '{')
	            {
	                st.push(c1);
	                continue;
	            }
	 
	            if (st.isEmpty())
	                return false;
	            char check;
	            switch (c1) {
	            case ')':
	                check = st.pop();
	                if (check == '{' || check == '[')
	                    return false;
	                break;
	 
	            case '}':
	                check = st.pop();
	                if (check == '(' || check == '[')
	                    return false;
	                break;
	 
	            case ']':
	                check = st.pop();
	                if (check == '(' || check == '{')
	                    return false;
	                break;
	            }
	        }
	 
	        // Check Empty Stack
	        return (st.isEmpty());
	    }
	    
	    public ArrayList<Integer> problem6(Stack<Integer> S)
	    {
	    	ArrayList<Integer> ut1 = new ArrayList<>();
	    	int siz = S.size() / 2;
	    	for(int i = 0; i < siz ; i++) 
	    	{
	    		ut1.add(S.pop());
	    	}
	    	S.sort(Collections.reverseOrder());
	    	System.out.println(S.size());
	    	for(int i = 0; i < siz ; i++) 
	    	{	
	    		ut1.add(S.pop());
	    	}
	    	
	    	return ut1;
	    }
	    
	    public int problem7(Queue<String> Q) 
	    {	
	    	String dec = "";
	    	for (String bin: Q) {
	    		dec += bin;
	        }
	    	
	    	return Integer.parseInt(dec,2);
	    }
	    
	    public ArrayList<Integer> problem8(Queue<Integer> queue)
	    {
	    	ArrayList<Integer> out1 = new ArrayList<>();
	    	for(int i=0 ; i < queue.size() ; i++) 
	    	{
	    		queue = reversequeue(queue);
	    		out1.add(queue.poll());
	    		queue = reversequeue(queue);
	    		out1.add(queue.poll());
	    	}
	    	    	
	    	return out1;
	    }
	    
	    public Queue<Integer> reversequeue(Queue<Integer> queue)
	    {
	        Stack<Integer> st1 = new Stack<>();
	        while (!queue.isEmpty()) {
	            st1.add(queue.peek());
	            queue.remove();
	        }
	        while (!st1.isEmpty()) {
	            queue.add(st1.peek());
	            st1.pop();
	        }
	        return queue;
	    }

	    public ArrayList<Integer> problem9(Queue<Integer> queue)
	    {
	    	ArrayList<Integer> out1 = new ArrayList<>();
	    	for(int i=0 ; i < queue.size() ; i++) 
	    	{
	    		queue = reversequeue(queue);
	    		int n1 = queue.poll();
	    		int n2 = queue.poll();
	    		if(n1 % 2 == 0) 
	    		{
	    			out1.add(n1);
	    			out1.add(n2);
	    		}
	    		else
	    		{
	    			out1.add(n2);
	    			out1.add(n1);
	    		}
	    	}
	    	return out1;
	    }

	    public String problem10(Deque<String> deque, Integer[] array1)
	    {
	    	String sum = "";
	    	Stack<String> stack = new Stack<>();
	    	int l=array1.length - 1;
	    	for(int i=0;i <=l;i++)
	    	{
	    		if(array1[i] == 1) 
	    		{
	    			stack.add(deque.remove());
	    		}
	    		if(array1[i] == 0) 
	    		{
	    			deque.addFirst(stack.pop());
	    		}
	    	}
	    	
	    	Iterator ti = deque.iterator();
	        while (ti.hasNext())
	        {
	        	sum += ti.next();
	        }
	        
	        return sum;
	    }

	
	
}
