package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class HashmapDemo {


     public  static void main(String args[]){
         final String COMMA_Delimiter=",";
         HashMap<Integer,String> map=new HashMap<Integer, String>();
         BufferedReader br = null;
         try{
             //br = new BufferedReader(new FileReader("C:\\Users\\user16.CABGRID\\Desktop\\columns.csv"));
             br = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\Compressed\\New folder\\workspace\\JspProjectPig\\columns.csv"));

             //Create List for holding Employee objects
             //List<Employee> empList = new ArrayList<Employee>();
             String line = "";
             //Read to skip the header
             br.readLine();
             //Reading from the second line
             while ((line = br.readLine()) != null)
             {
                 String[] str = line.split(COMMA_Delimiter);

                 if(str.length > 0 )
                 {
                     int i = Integer.parseInt(str[0]);
                     map.put(i, str[1]);
                 }
                 System.out.println(map.size());

             }

             //System.out.println(map.entrySet());

         }catch(Exception e){
             e.printStackTrace();
         }

     }
}
