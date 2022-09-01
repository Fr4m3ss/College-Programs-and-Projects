//Frankie Messina

public class personclass {

private String name;
private String number;
private String zip;

public String toString()
{
return("Name-"+name+"\tNumber-"+number+"\tZip-"+zip+"\n");
}

public personclass(String s1,String s2,String s3)
{
name=s1;
number=s2;
zip=s3;
}

public personclass()
{
this(null,null,null);
}

public void setName(String s)
{
name=s;
}
public void setNumber(String s) 
{
number=s;
}
public void setZip(String s)
{
zip=s;
}

public String getName()
{
return name;
}
public String getNumber() 
{
return number;
}
public String getZip()
{
return zip;
}

public int compareTo(personclass a)
{
return name.compareTo(a.getName());
}

}
