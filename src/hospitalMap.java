import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class hospitalMap {
    public int map[][] = new int[15][24];

    public hospitalMap() throws IOException, URISyntaxException {
        File file = new File(getClass().getResource("hospital_sample_map.csv").toURI());
        BufferedReader f = new BufferedReader(new FileReader(file));


        for (int i = 0; i < 15; i++) {
            String[] line = f.readLine().split(",");
            for (int j = 0; j < 24; j++) {
                map[j][i] = Integer.parseInt(line[j]);
            }
        }
    }

}
