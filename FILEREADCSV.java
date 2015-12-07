import javax.swing.*;
import java.io.*;                   
public class FILEREADCSV
{
    private FileReader fReader;   
    private FileWriter fWriter; 

    public String[] readCSVtable() throws IOException {

        File currentDir = new File("").getAbsoluteFile();
        final JFileChooser fc = new JFileChooser(currentDir);
        int returnVal = fc.showOpenDialog(null);
        File csvFile = fc.getSelectedFile();

        char[] inBuffer = new char[5000];

        fReader = new FileReader(csvFile);
        int size = fReader.read(inBuffer);
        fReader.close();

        String fileContent = String.valueOf(inBuffer).substring(0,size);

        return fileContent.split("\n");
    }


      
    public void writeCSVtable(String outBuffer) throws IOException
    {
        String csvFile;
        File currentDir = new File("").getAbsoluteFile();
        final JFileChooser fc = new JFileChooser(currentDir);
        int returnVal = fc.showSaveDialog(null);
        File file = fc.getSelectedFile();
        csvFile = file.getName();
        fWriter = new FileWriter(csvFile);
        fWriter.write(outBuffer);
        fWriter.close();

    }  

}