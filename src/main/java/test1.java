package test;

public class test1 {
	public static void main(String[]args) {
		Queue<Integer>p1=new Queue<>();
		p1.insert(2);
		p1.insert(2);
		p1.insert(2);
		p1.insert(2);
		p1.insert(2);
		p1.insert(2);
		Queue<Integer>p=new Queue<>();
		System.out.println(m(p1,2,p));
		System.out.println(p);
	}

	public static boolean m(Queue<Integer>p,int num,Queue<Integer>p1) {
		boolean flag=false;
		
		int g=0;
	while(!p.isEmpty()) {
		if(p.head()==num) {
			p1.insert(p.remove());
		}
		if(!p.isEmpty()) {
			if(p.head()==num) {
		flag=true;
		p1.insert(p.remove());
		}
		
	}
	
	}
	return flag;
	}}
	

