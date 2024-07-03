import java.util.Scanner;
import java.util.HashMap;

class cattle;
private String cattleOwner;
private String cattleNum;
private int daysKept;

public cattle(String cattleOwner, String cattleNum){
  this.cattleNum = cattlenum;
  this.cattleOwner = cattleOwner;
  this.daysKept = 0;
}
public String getCattlenum(){
  return cattleNum;
}
public String getCattleOwner(){
return cattleOwner;
}
public int getDayskept(){
  return getDayskept;
}
public void addDay(){
  this.daysKept++}
public void resetDaysKept(){
  daysKept =0;
}

public String toString(){
  return "Cattle Number" + cattleNum + "," + "Owner" +cattleOwner + "days kept" + daysKept;
}}
