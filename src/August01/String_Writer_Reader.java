import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class String_Writer_Reader {
    public static void main(String[] args) {
        String input = "Hello\nThis is Java\nUsing StringReader and Writer";

        try {
           
            StringReader reader = new StringReader(input);
            StringWriter writer = new StringWriter();

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(Character.toUpperCase((char) ch));
            }

          
            System.out.println("Modified Output:\n" + writer.toString());

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
