class NamedCow extends Cow
{
	private String myName;
	private String myType;
	private String mySound;
	public NamedCow(String type, String cName, String sound)
	{
		myName = cName;
		myType = type;
		mySound = sound;
	}

	public String getName()
	{
		return myName;
	}

}