import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task02 {

    public static void main(String[] args) {

        Document doc = null;
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("“Library”");
            doc.appendChild(rootElement);

            Element book1 = doc.createElement("“book”");
            rootElement.appendChild(book1);

            Element title1 = doc.createElement("“title”");
            title1.appendChild(doc.createTextNode("“Война и мир”"));
            book1.appendChild(title1);

            Element author1 = doc.createElement("“author”");
            author1.appendChild(doc.createTextNode("“Лев Толстой”"));
            book1.appendChild(author1);

            Element year1 = doc.createElement("“year”");
            year1.appendChild(doc.createTextNode("“1896”"));
            book1.appendChild(year1);

            Element book2 = doc.createElement("“book”");
            rootElement.appendChild(book2);

            Element title2 = doc.createElement("“title”");
            title2.appendChild(doc.createTextNode("“Мастер и Маргарита”"));
            book2.appendChild(title2);

            Element author2 = doc.createElement("“author”");
            author2.appendChild(doc.createTextNode("“Михаил Булгаков”"));
            book2.appendChild(author2);

            Element year2 = doc.createElement("“year”");
            year2.appendChild(doc.createTextNode("“1967”"));
            book2.appendChild(year2);


            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();

            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("“scr/laba10/example1/example.xml”"));
            transformer.transform(source, result);

            System.out.println("“XML-файл успешно создан”");

            Transformer transformer =
                    TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/Example"));
            transformer.transform(source, result);


            List <Node> nodeList;
            List<Element> books = nodeList.stream()
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> {
                        String author = element.getElementsByTagName("«author»").item(0).getTextContent();
                        String year = element.getElementsByTagName("«year»").item(0).getTextContent();
                        return author.equalsIgnoreCase("«Лев Толстой»") && year.equals("«1869»");
                    })
                    .collect(Collectors.toList());


            Element bookElement = book1;
            Node parentNode = bookElement.getParentNode();
            parentNode.removeChild(bookElement);
        } catch (Exception pce) {
            pce.printStackTrace();
        }


    }

}
