package javaPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class TubeStationName {
    /*
    8. Write the program that tell you which line pass through particular stations.
Just use Zone 1 stations name. (Challenge)

     */
    public static void main(String[] args) {
        tube();
    }
    public static void tube() {
        HashMap<String, ArrayList<String>> tubename = new HashMap<>();
        ArrayList<String> aldgateLines = new ArrayList<>();
        aldgateLines.add("Metropolitan");
        aldgateLines.add("Circle");
        tubename.put("Aldgate", aldgateLines);
        ArrayList<String> aldgate_EastLines=new ArrayList<>();
        aldgate_EastLines.add("Hammersmith & City");
        aldgate_EastLines.add("District");
        tubename.put("aldgate_East",aldgate_EastLines);

        ArrayList<String> bakerStreetLine=new ArrayList<>();
        bakerStreetLine.add("Metropolitan");
        bakerStreetLine.add("Bakerloo");
        tubename.put("Bakerstreet",bakerStreetLine);
        System.out.println(tubename);












   //     Map<String, List<String>> tubename = new HashMap<>();
//        ArrayList<String> aldgateLines = new ArrayList<>();
//        aldgateLines.add("Metropolitan");
//        aldgateLines.add("Circle");
   //     tubename.put("Aldgate", Arrays.asList("Metropolitan", "Circle"));
//        tubename.put("Hammersmith & City", "Aldgate East");
//        tubename.put("District", "Aldgate East");
//        tubename.put("Angle", "Northern");
//        tubename.put("Matropolitan", "BakerStreet");
//        tubename.put("Bakerloo", "Bakerstreet");
  //      System.out.println(tubename.get("Aldgate"));


    }
}
