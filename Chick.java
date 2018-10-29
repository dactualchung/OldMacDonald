class Chick implements Animal  
{
  private String myType, mySoundOne, mySoundTwo;
  public Chick(String type, String soundOne, String soundTwo){
    myType = type;
    mySoundOne = soundOne;
    mySoundTwo = soundTwo;
  }
  public Chick() {
    myType = "unknown";
    mySoundOne = "unknown";
    mySoundTwo = "unknown";
  }
  public String getSound(){
    if(Math.random() < 0.5){
      return mySoundOne;
    }else{
      return mySoundTwo;
    }
  }
  public String getType(){
    return myType;
  }
}
