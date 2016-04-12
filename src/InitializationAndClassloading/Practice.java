package InitializationAndClassloading;

/**
 * (1) 用默认构建器（空自变量列表）创建两个类：A 和B，令它们自己声明自己。从A 继承一个名为C 的新
	类，并在C 内创建一个成员B。不要为C 创建一个构建器。创建类C 的一个对象，并观察结果。
	(2) 修改练习1，使A 和B 都有含有自变量的构建器，则不是采用默认构建器。为C 写一个构建器，并在C
	的构建器中执行所有初始化工作。
	(3) 使用文件Cartoon.java ，将Cartoon 类的构建器代码变成注释内容标注出去。解释会发生什么事情。
	(4) 使用文件Chess.java，将Chess 类的构建器代码作为注释标注出去。同样解释会发生什么。
 *
 */
public class Practice {
 public static void main(String[] args) {
	 new C("HelloWorld");
}
}
//于构建器的名字必须与类名完全相同
class A{
	public A(String s) {
		System.out.println("This is the A's constructor ：" + s);	
	}
}
class B{
	
	public B(String s) { System.out.println("2B(): " + s); } 
}

class C extends A {
	B b;
	public C(String s){
		super(s);
		System.out.println(s);
		b = new B(s);
	}
}