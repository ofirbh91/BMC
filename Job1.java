import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Job1 {
	
	public static void main(String[] args) throws Exception {
		int count = 0;
        ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "cd \"C:\\newG\" && dir");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            
            if (line == null) { break; }
            
            StringTokenizer st = new StringTokenizer(line);
            System.out.println(line);
            System.out.println(st.countTokens());
            count += st.countTokens();
         
            
        }
        System.out.println(count);
    }
}
