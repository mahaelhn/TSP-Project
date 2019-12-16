package tsp;

import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class UtilFile {
	
	public static LinkedList<Set> getData(String path, String separator){
		String nvLigne = "";
		LinkedList<Set> l = new LinkedList<Set>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            while ((nvLigne = br.readLine()) != null) {

                // use comma as separator
                String[] rowData = nvLigne.split(separator);

                l .add(new Set(Integer.parseInt(rowData[2]) , Integer.parseInt(rowData[3])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

		
		return l;
		
		
	}
	

	
	

}
