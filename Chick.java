class Chick implements Animal 
{     
	private String myType;
	private String mySound;
	private String mySoundTwo;
	private int myRdmNum;
	 public Chick(String type, String sound, String soundTwo)     {         
         myType = type;         
         mySound = sound;
         mySoundTwo = soundTwo;
         myRdmNum = (int)(Math.random());     
     }     
     public Chick()     {         
     	if (myRdmNum == 0)
         	myType = "chick";  
         else if (myRdmNum == 1)      
         	mySound = "cluck";     
     }      
     public String getSound(){return mySound;}
     public String getSoundTwo(){return mySoundTwo;}
     public String getType(){return myType;} 
}
