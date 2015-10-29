class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String cName, String sound)
	{
		myName = cName;
	}

	public String getName()
	{
		return myName;
	}

}