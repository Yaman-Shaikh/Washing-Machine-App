import java.util.*;
abstract class Appliance 
{protected double Power;
protected String Brand;
	public Appliance(String Brand,double Power)
	{
		this.Brand=Brand;
		this.Power=Power;
	}
	abstract void TurnOn();

}

class WashingMachine extends Appliance
{ 
int Capacity;
	
	WashingMachine(double Power,String Brand,int Capacity)
	{
		
		super(Brand,Power);
		
		this.Capacity=Capacity;
	}
	public void TurnOn()
	{
		System.out.println("Starting WashingMachine with the capacity of "+Capacity);
	}
	
}
public class WashingMachineApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("enter the power of machine");
		double Power=xyz.nextDouble();
		
		xyz.nextLine();
		System.out.println("enter the Brand of machine");
		String Brand=xyz.nextLine();
		
		System.out.println("enter the capacity of machine");
		int  Capacity=xyz.nextInt ();
		
		WashingMachine W=new WashingMachine(Power,Brand,Capacity);
		W.TurnOn();
		
		
	}	
}