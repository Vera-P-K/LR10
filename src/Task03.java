import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task03 {
    public static void main (String[] args) {
        String url = " адрес интернет-страницы”";
        try{
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                System.out.println(link.attr("abs:href"));
            }

// Сохранение изменений в файл
            Path outputPath = Paths.get("modified.html");
            Files.writeString(outputPath, doc.outerHtml());

            System.out.println("HTML сохранен в " + outputPath);


        } catch  (IOException e) {
            e.printStackTrace();
            System.err.println("Ошибка при получении страницы: " + e.getMessage());
            // Дополнительные действия при ошибке, например, логгирование, уведомление пользователя
        }
    }

}
