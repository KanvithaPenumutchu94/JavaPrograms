package HierarchicalInheritance;

//It is a chain of inheritance
public class BabyDog extends Animal {
	 void m3()
	 {
		 System.out.println("babydog");
	 }
public static void main(String[] args)
{
	Animal a=new Animal();
	a.m1();
	Dog d=new Dog();
	d.m1();
	d.m2();
	BabyDog bd=new BabyDog();
	bd.m1();
	bd.m3();
}
}
