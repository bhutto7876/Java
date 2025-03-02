  class Hello {


    public static Object main (String a[]) {  
      String day = "Monday";

return  switch (day) {
  case "Monday"-> "Week day";
  case "Tuesday"-> "Week day";
  case "Wednesday"->"Week day";
  case "Thursday"->"Week day";
  case "Friday"->"Week day";
  case "Saturday"-> "Weekend";
  case "Sunday"-> "Weekend";
  default->"Unknown";
};
  //  return switch (day) {
  //     case 1-> System.out.println ("Hello  World");
           
  //       case 2-> System.out.println ("Hello  World");
        
  //     default-> System.out.println ("Hello  World");
  //   }  
    }  
    } 