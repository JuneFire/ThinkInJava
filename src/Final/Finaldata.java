package Final;

public class Finaldata {
	
	/**
	 * 之所以要使用final 方法，可能是出于对两方面理由的考虑。第一个是为方法“上锁”，防止任何继承类改
		变它的本来含义。设计程序时，若希望一个方法的行为在继承期间保持不变，而且不可被覆盖或改写，就可
		以采取这种做法。
		采用final 方法的第二个理由是程序执行的效率。将一个方法设成final 后，编译器就可以把对那个方法的
		所有调用都置入“嵌入”调用里。只要编译器发现一个final 方法调用，就会（根据它自己的判断）忽略为
		执行方法调用机制而采取的常规代码插入方法
	 */
	
	final int i1 = 9;
	
	static final int I2 = 99; //固定初始化值,大写
	
	//public表示它们可在包外使用；Static 强调它们只有一个；而final 表明它是一个常数
	public static final int i3 = 39;  
	
	final int i4 = (int)(Math.random()*20);
	
	static final int  i5 = (int)(Math.random()*20);
	
	Vlaue v1 = new Vlaue();
	final Vlaue v2 = new Vlaue();
	static final Vlaue v3 = new Vlaue();
	
	final int[] a = {1,2,3,4,5};
	
	public void print(String id){
		System.out.println(
				id + ": " + "i4= " + i4 +
				",i5= " + i5);
	}
	
	public  static void main(String[] args){
		Finaldata f1 = new Finaldata();
		System.out.println("v2.i++ :" + ++f1.v2.i);
	/*	f1.v2.i++;
		f1.v3.i++;*/
		f1.v1 = new Vlaue();
		for(int i=0;i < f1.a.length;i++){
			System.out.println(f1.a[i]++); 
		}
		f1.print("f1");  //.. ..
		System.out.println("Creating new FinalData");
		Finaldata f2 = new Finaldata();
		f1.print("f1");
		f2.print("f2");  //对象发生改变，i4会变
	}
}

class Vlaue{
	int i = 1;
}