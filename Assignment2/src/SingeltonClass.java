
//singleton is a class which have only one object at a time ,if we try to instantiate a singleton class
//the new variable also point to the first instance created 


class Singleton{
	private static Singleton single_instance=null;
	
	public String s;
	
	private Singleton()
	{
		s="Hello I am String Part of Singleton Class";
	}
	
	public static Singleton getInstance()
	{
		if(single_instance==null)
			single_instance=new Singleton();
		return single_instance;
	}
}

class SingletonInheritance extends Singleton
{
	
}
public class SingeltonClass {
    public static void main(String[] args)
    {
    	
    	Singleton x=Singleton.getInstance();
    	Singleton y=Singleton.getInstance();
    	Singleton z=Singleton.getInstance();
    	
    	System.out.println("hashcode of x is " +x.hashCode());

    	System.out.println("hashcode of x is " +y.hashCode());
    	System.out.println("hashcode of x is " +z.hashCode());

    }
}
