package sample;

public class Sample 
{
	
	public int display()
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
			System.out.println("demo2");
		}
		System.out.println("demo3");
		return 1;
	}

	public static void main(String[] args) 
	{
		Sample obj=new Sample();
		int a=obj.display();
		System.out.println("demo1");
		System.out.println("demo4");
		System.out.println("demo5");
		System.out.println("demo5");
		System.out.println("demo5");
	}
	
	

}
