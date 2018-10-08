package control;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import model.knoife.knoife;
public class controlsser
{// that weird stuff is java dock
	/**
	 * Builds  the instance of the Controller
	 */
	public controlsser() 
	{
		
	}
	/**
	 * this is where the program calls the methods to run em
	 */
    public void start() 
    {
    	//loooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooop();
        //loopy();
    	askUser();
    	System.out.println("fug");
    }
    
   public boolean validDouble (String response){
	boolean isvalid = false;
	try 
	{
		Double.parseDouble(response);
		 isvalid = true;
	}catch(NumberFormatException e)
	{			
	JOptionPane.showMessageDialog(null, "put in a valid double");
	}
	return isvalid;
}
   public void loooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooop() 
   {
	   for  (int guf = 0; guf < 9001; guf ++ )
	   {
		   
		   if (guf<1) 
		   {
			   JOptionPane.showMessageDialog(null,"you are past 0");
		   }
		   else if (guf>=1 && guf<10)
		   { 
			   JOptionPane.showMessageDialog(null,"you are past 1");
		   }
		   else if (guf>=10 && guf<100)
		   { 
			   JOptionPane.showMessageDialog(null,"you are past 10");
		   }
		   else if (guf>=100 && guf<1000)
		   {
			   JOptionPane.showMessageDialog(null, "you are past 100");
		   }
		   else if (guf>=1000 && guf<9000)
		   {
			   JOptionPane.showMessageDialog(null, "you are past 1000");
		   }
		   else if (guf> 9000)
		   {
			   JOptionPane.showMessageDialog(null, "its over 9000");
		   }
	 }
   }
 
    private void loopy()

    {
    	boolean isDone = false;//Initialize
    	int count = 0;
    	while (!isDone)//test
    	{
    		JOptionPane.showMessageDialog(null, "this is the song that doesnt end it just goes on and on my friend some people started singing it not knowing what it was and people will keep singing it forever just because");
    		
    		count++;
    		
    		if (count > 5)
    		{
    			isDone = true;//update
    		}
    	}
    	while (isDone)
    	{
    		
    		count++;
    		JOptionPane.showMessageDialog(null,"kidding");
    		if (count > 10)
    		{
    			isDone = false;
    		}// what I did here was develop a while loop
    	}
    	for (int i = 9000; i < 30; i -= 2)
    	{
    		JOptionPane.showMessageDialog(null, "The loop value is:" + i);
    	}
    	
    }
    private void knoifeyInGreatQuantity()
    {//dont forhet that local variables are only visible to those they were made in
    	// they only have scope to its method
    	ArrayList<knoife> myknoife = new ArrayList<knoife>();
    	knoife sampleKnoife = new knoife();
    	knoife otherknoife = new knoife();
    	myknoife.add(sampleKnoife);
    	myknoife.add(sampleKnoife);
    	myknoife.add(otherknoife);
    	//standered forward loop
    	for (int fug = 0; fug < myknoife.size(); fug += 1)
    	{
    		knoife currentKnoife = myknoife.get(fug);
    		currentKnoife.setKnoifeLength(fug * currentKnoife.getKnoifeLength());
    	}
    	//standered backward loop
    	for (int index = myknoife.size() - 1; index >= 0; index -= 1)
    	{
    		
    	}
    	for (knoife current : myknoife)// stuff that you put into a loop or if then like current cant be seen outside the loop
    	{//this is a for each loop so for (each thing on a list) 
    		JOptionPane.showMessageDialog(null, "the knoife is named: " + current.getIfSwitchBlade());
    	}
    	
    }
    public void askUser()
    {
    	String response = JOptionPane.showInputDialog("What is the length");
    	knoife userknoife = new knoife();
    	while (!validDouble(response))
    	{		
    		
    		response = JOptionPane.showInputDialog("What is the length");
    		
    	}
    	userknoife.setKnoifeLength(Double.parseDouble(response));
    	int wrong = 1;
    	String response1 = "o";
    	boolean knoifeStatus = true;
    	while (wrong == 1)
    	{  		 
    		response1 = JOptionPane.showInputDialog("is it a switch blade?");
    				switch (response1) {
    				case "yes":
    					knoifeStatus = true;
    					wrong = 0;
    					break;
    				case "no":
    					knoifeStatus = false;
    					wrong = 0;
    					break;
    				default:JOptionPane.showMessageDialog(null, "yes or no silly");
    				}
    		userknoife.setIfSwitchBlade(knoifeStatus);		
    	}
    	
    	while (wrong == 0)
    	{
    		response1 = JOptionPane.showInputDialog("is it a knoife");
    		switch (response1) {
    			case "yes":
    				knoifeStatus = true;
    				wrong = 1;
    			    break;
    			case "no":
    				knoifeStatus = false;
    				wrong = 1;
    				break;
    			default:JOptionPane.showMessageDialog(null, "yes or no plz");
    		}
    	}
    	userknoife.setIsAKnoife(knoifeStatus);
    	while (wrong == 1)
    	{
    		response1 = JOptionPane.showInputDialog("Are you in britain?");
    		switch (response1) {
    			case "yes":
    				knoifeStatus = true;
    				wrong = 0;
    				break;
    			case "no":
    				knoifeStatus = false;
    				wrong = 0;
    				break;
    			default:
    		}
    	}
   
   
   }
}

