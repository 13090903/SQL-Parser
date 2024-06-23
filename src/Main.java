import javax.xml.XMLConstants;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputPath = "input.txt";
        System.out.println("read Query from \n\"" + inputPath + "\"");
        String input = readCommand(inputPath);
        System.out.println("input Query: ");
        System.out.println("---------------------------------------");
        System.out.println(input);

        String rst = parse(input);
        System.out.println("\n---------------------------------------");
//        System.out.println(prettyFormat(rst));
        outputAST(rst, "output.txt");
        System.out.println("\n---------------------------------------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("output.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        while ((line = fin.readLine()) != null) System.out.println(line);
    }

    public static String prettyFormat(String input, int indent) {
        try {
            Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String prettyFormat(String input) {
        return prettyFormat(input, 4);
    }

    private static String parse(String input) {
        String rst = "";
        try {
            rst = Parser.parse(input);
        } catch (Exception e) {
            System.out.println("Error during Parsing");
            e.printStackTrace();
        }
        return rst;
    }

    private static String readCommand(String inputPath) {
        StringBuilder input = new StringBuilder();
        try {
            String temp = "";
            FileReader reader = new FileReader(inputPath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            temp = bufferedReader.readLine();
            while (temp != null) {
                input.append("\n").append(temp);
                temp = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + inputPath + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + inputPath + "'");
        }
        return input.toString();
    }

    private static void outputAST(String rst, String outputPath) {
        FileWriter writer;
        try {
            writer = new FileWriter(outputPath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(rst);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error during writing result");
            e.printStackTrace();
        }
        System.out.println("output Successfully");
    }
}
