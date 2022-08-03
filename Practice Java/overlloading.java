package  threadpackage;
public class overlloading {
	public int sum(int x, int y)
	{
		System.out.println("Int Method 2 Para");
		return (x + y);
	}
	public int sum(int x, int y, int z)
	{
		System.out.println("Int Method 3 Para");
		return (x + y + z);
	}
	public double sum(double x, double y)
	{
		System.out.println("Double Method 2 Para");
		return (x + y);
	}
	public short sum(short x, double y)
	{
		System.out.println("One short and one double");
		return (short)(x + y);
	}
	public float sum(float x, float y)
	{
		System.out.println("float Method 2 Para");
		return (x + y);
	}
	public static void main(String args[])
	{
		overlloading s = new overlloading();
		System.out.println(s.sum(10, 20));
		System.out.println(s.sum(10, 20, 30));
		System.out.println(s.sum(10.5, 20.5));
	}
}
