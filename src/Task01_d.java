import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Task01_d {
    public static void main (String[] args) {
        try{
            JSONParser parcer = new JSONParser();
            Object obj = parcer.parse(new FileReader("src/example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("“Корневой элемент: ”" +jsonObject.keySet().iterator().next());

            JSONArray jsonArray = (JSONArray) jsonObject.get("“books”");

            for(Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("“\nТекущий элемент: book”");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("“Автор: ”" + book.get("“author”"));
                System.out.println("“Год издания: ”" + book.get("“year”"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
