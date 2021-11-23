package link_list;

import java.util.Scanner;

public class linkedlist2 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		
		int tinfo;
		List start =null;
		List tnext;
		List node =new List();
		
		String ch;
		
		start =node;
		
		do
		{
			System.out.println("Enter the information part of node");
			tinfo=scan.nextInt();
			node.setInfo(tinfo);
			node.setNext(null);
			
			System.out.println("You want to create more nodes (Y/N)");
			ch=scan.next();
			
			if(ch.toUpperCase().equals("Y"))
			{
				tnext=new List();
				node.setNext(tnext);
				node=tnext;
				continue;
			}
			else
				break;
			
		}while(true);
		
		if(start!=null)
		{
			System.out.println("given list is :");
			node=start;
			while (node!=null)
			{
				System.out.print(node.getInfo()+" ");
				node = node.getNext();
			}		
		}
		
	}
}
