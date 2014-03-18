import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StockSpan {

  public static void main(String[] args) {
StockSpan obj = new StockSpan();
	obj.run();

  }

  public void run() {

	String csvFile = "/Users/Mitsos/Documents/GitHub/example-repo/assignment-1/src/DJIA.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";

	try {

		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {

		        // use comma as separator
			String[] country = line.split(cvsSplitBy);

			System.out.println(   country[0]
                                 +  ","   + country[1]   );


}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	System.out.println("Done");
  }

}