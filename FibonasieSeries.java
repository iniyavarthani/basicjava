package lesson9;

public class FibonasieSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c;
		 
		System.out.print(a+ "" 	+b);
		for(int i=2;i<=5;++i)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			
			
		}
			System.out.println("+++++++++++++");
		int d=0,e=1,f,j=2;
		System.out.print(d+""+e);
		while(j<=10)
		{
          j++;
          f=d+e;
          d=e;
          e=f;
          System.out.print(""+f);
          }
          
	}

	}