public class ChemputerClass {

public String checkPeriodic(String x)	
{
ChemputerClass s = new ChemputerClass();
s.checkS(x);
s.checkD(x);
s.checkP(x);
s.checkF(x);
return "Na";
}
public String checkS(String x)
{
  int charge=1;
  if(x=="H")
  {
	 return "H"+charge;
  }
  if(x=="He")
  {
	 return "He";
  }
  if(x=="Li")
  {
	 return "Li";
  }
  if(x=="Be")
  {
	 return "Be";
  }
  if(x=="Na")
  {
	 return "Na";
  }
  if(x=="Mg")
  {
	 return "Mg";
  }
  if(x=="K")
  {
	 return "K"+charge; 
  }
  if(x=="Ca")
  {
	 return "Ca";
  }
  if(x=="Rb")
  {
	 return "Rb"; 
  }
  if(x=="Sr")
  {
	 return "Sr";
  }
  if(x=="Cs")
  {
	 return "Cs";
  }
  if(x=="Ba")
  {
	 return "Ba";
  }
  if(x=="Fr")
  {
	 return "Fr";
  }
  if(x=="Ra")
  {
	 return "Ra";
  }
return x;
}


public String checkD(String x)
{
  if(x=="Sc")
  {
	 return "Sc";
  }
  if(x=="Ti")
  {
	 return "Ti";
  }
  if(x=="V")
  {
	 return "V"; 
  }
  if(x=="Cr")
  {
	 return "Cr";  
  }
  if(x=="Mn")
  {
	 return "Mn";
  }
  if(x=="Fe")
  {
	 return "Fe";
  }
  if(x=="Co")
  {
	 return "Co";
  }
  if(x=="Ni")
  {
	 return "Ni";
  }
  if(x=="Cu")
  {
	 return "Cu";
  }
  if(x=="Zn")
  {
	 return "Zn";
  }
  if(x=="Y")
  {
	 return "Y";
  }
  if(x=="Zr")
  {
	 return "Zr";
  }
  if(x=="Nb")
  {
	 return "Nb";
  }
  if(x=="Mo")
  {
	 return "Mo";
  }
  if(x=="Tc")
  {
	 return "Tc";
  }
  if(x=="Ru")
  {
	 return "Ru";
  }
  if(x=="Rh")
  {
	 return "Rh";
  }
  if(x=="Pd")
  {
	 return "Pd";
  }
  if(x=="Ag")
  {
	 return "Ag";
  }
  if(x=="Cd")
  {
	 return "Cd";
  }
  if(x=="La")
  {
	 return "La";
  }
  if(x=="Hf")
  {
	 return "Hf";
  }
  if(x=="Ta")
  {
	 return "Ta";
  }
  if(x=="W")
  {
	 return "W";
  }
  if(x=="Re")
  {
	 return "Re";  
  }
  if(x=="Os")
  {
	 return "Os";
  }
  if(x=="Ir")
  {
	 return "Ir";
  }
  if(x=="Pt")
  {
	 return "Pt";
  }
  if(x=="Au")
  {
	 return "Au";
  }
  if(x=="Hg")
  {
	 return "Hg"; 
  }
  if(x=="Ac")
  {
	 return "Ac"; 
  }
  if(x=="Rf")
  {
	 return "Rf";
  }
  if(x=="Db")
  {
	 return "Db";
  }
  if(x=="Sg")
  {
	 return "Sg";
  }
  if(x=="Bh")
  {
	 return "Bh";
  }
  if(x=="Hs")
  {
	 return "Hs";
  }
  if(x=="Mt")
  {
	 return "Mt";
  }
return x;
}


public String checkP(String x)
{
	int charge = -1;
  if(x=="B")
  {
	 return "B";
  }
  if(x=="C")
  {
	 return "C"; 
  }
  if(x=="N")
  {
	 return "N";  
  }
  if(x=="O")
  {
	 return "O"; 
  }
  if(x=="F")
  {
	 return "F";
  }
  if(x=="Ne")
  {
	 return "Ne";
  }
  if(x=="Al")
  {
	 return "Al"; 
  }
  if(x=="Si")
  {
	 return "Si";
  }
  if(x=="P")
  {
	 return "P";  
  }
  if(x=="S")
  {
	 return "S"; 
  }
  if(x=="Cl")
  {
	 return "Cl"+charge; 
  }
  if(x=="Ar")
  {
	 return "Ar";  
  }
  if(x=="Ga")
  {
	 return "Ga"; 
  }
  if(x=="Ge")
  {
	 return "Ge";
  }
  if(x=="As")
  {
	 return "As";
  }
  if(x=="Se")
  {
	 return "Se";
  }
  if(x=="Br")
  {
	 return "Br"+charge;  
  }
  if(x=="Kr")
  {
	 return "Kr";
  }
  if(x=="In")
  {
	 return "In";
  }
  if(x=="Sn")
  {
	 return "Sn";
  }
  if(x=="Sb")
  {
	 return "Sb";
  }
  if(x=="Te")
  {
	 return "Te";
  }
  if(x=="I")
  {
	 return "I";
  }
  if(x=="Xe")
  {
	 return "Xe";
  }
  if(x=="Tl")
  {
	 return "Tl";
  }
  if(x=="Pb")
  {
	 return "Pb"; 
  }
  if(x=="Bi")
  {
	 return "Bi";
  }
  if(x=="Po")
  {
	 return "Po";
  }
  if(x=="At")
  {
	 return "At"; 
  }
  if(x=="Rn")
  {
	 return "Rn";
  }
return x;
}


public String checkF(String x)
{
  if(x=="Ce")
  {
	 return "Ce";
  }
  if(x=="Pr")
  {
	 return "Pr";
  }
  if(x=="Nd")
  {
	 return "Nd"; 
  }
  if(x=="Pm")
  {
	 return "Pm";
  }
  if(x=="Sm")
  {
	 return "Sm";
  }
  if(x=="Eu")
  {
	 return "Eu";
  }
  if(x=="Gd")
  {
	 return "Gd";
  }
  if(x=="Tb")
  {
	 return "Tb";
  }
  if(x=="Dy")
  {
	 return "Dy";
  }
  if(x=="Ho")
  {
	 return "Ho";
  }
  if(x=="Er")
  {
	 return "Er";
  }
  if(x=="Tm")
  {
	 return "Tm";
  }
  if(x=="Yb")
  {
	 return "Yb";
  }
  if(x=="Lu")
  {
	 return "Lu";
  }
  if(x=="Th")
  {
	 return "Th";  
  }
  if(x=="Pa")
  {
	 return "Pa"; 
  }
  if(x=="U")
  {
	 return "U";
  }
  if(x=="Np")
  {
	 return "Np";
  }
  if(x=="Pu")
  {
	 return "Pu";
  }
  if(x=="Am")
  {
	 return "Am";
  }
  if(x=="Cm")
  {
	 return "Cm";
  }
  if(x=="Bk")
  {
	 return "Bk";
  }
  if(x=="Cf")
  {
	 return "Cf";
  }
  if(x=="Es")
  {
	 return "Es";  
  }
  if(x=="Fm")
  {
	 return "Fm";
  }
  if(x=="Md")
  {
	 return "Md";
  }
  if(x=="No")
  {
	 return "No";
  }
  if(x=="Lr")
  {
	 return "Lr";
  }
return x;
}



public void setSpot1(int x, int y, String[][] b)
{
}

public void setSpot2(int x, int y, String[][] b)
{
}










}
