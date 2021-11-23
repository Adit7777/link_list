package link_list;

public class List {
	
	private int info;
	private List next;
	
	public List getNext() {
		return next;
	}


	public void setNext(List next)
	{
		this.next = next;
	}

	public int getInfo()
	{
		return info;
	}

	public void setInfo(int info) 
	{
		this.info = info;
	}

	
	public static void main(String[] args)
	{
		List start = null;
		
		List obj1 = new List();
		List obj2 = new List();
		List obj3= new List();
		List obj4 = new List();
		List obj5 = new List();
		
		start=obj1;

		obj1.setInfo(13);
		obj1.setNext(obj2);
		
		obj2.setInfo(46);
		obj2.setNext(obj3);
		
		obj3.setInfo(64);
		obj3.setNext(obj4);
		
		obj4.setInfo(83);
		obj4.setNext(obj5);
		
		obj5.setInfo(197);
		obj5.setNext(null);
		
		
		System.out.println();
		List node=start;
        if (start != null)
        {
            while(node != null)
            {
                System.out.println(node.getInfo());
                node=node.getNext();
            }
        }

		
	}



	
}
