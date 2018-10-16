package model.knoife;

public class knoife
{//--------Data Members--------
	private boolean needALoicence;
	private double knoifeLength;
	private boolean ifSwitchBlade;
	private boolean ifInBritain;
	private boolean isAKnoife;
	
	/**
		 * default constructor for after the fact customization
		 */
	public knoife()
	{
		this.needALoicence = true;
		this.isAKnoife = true;
		this.ifInBritain = false;
		this.ifSwitchBlade = false;
		this.knoifeLength = 6.7;
	}
	public knoife(boolean needALoicence, boolean ifSwitchBlade, boolean ifInBritain, boolean isAKnoife, double knoifeLength, boolean thynLegality) 
	{
		this.needALoicence = needALoicence;
		this.ifSwitchBlade = ifSwitchBlade;
		this.ifInBritain = ifInBritain;
		this.isAKnoife = isAKnoife;
		this.knoifeLength = knoifeLength;

	}
	//--------Getters--------
	public boolean getneedALoicence() 
	{
		return needALoicence;
	}
	public boolean getIfSwitchBlade() 
	{
		return ifSwitchBlade;
	}
	public boolean getIfInBritain() 
	{
		return ifInBritain;
	}
	public boolean getIsAKnoife() 
	{
		return isAKnoife;
	}
	public double getKnoifeLength() 
	{
		
		return knoifeLength;
	}
	//--------Setters--------
	public void setNeedALoicence(boolean Loicence)
	{		
		this.needALoicence = Loicence;	
	}
	public void setIfSwitchBlade(boolean SwitchBlade)
	{		
		this.ifSwitchBlade = SwitchBlade;
	}
	public void setIfInBritain(boolean Britain)
	{
		this.ifInBritain = Britain;
	}
	public void setIsAKnoife(boolean Knoife)
	{
		this.isAKnoife = Knoife;
	}
	public void setKnoifeLength(double length)
	{
		this.knoifeLength = length;
	}
	public Boolean toString(String fug)
	{
		boolean thynLegality = false ;
		
				
				return thynLegality;
		
	}
	
}


