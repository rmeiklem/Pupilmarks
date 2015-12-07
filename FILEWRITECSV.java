import javax.swing.*;

import java.io.*;     

public class FILEWRITECSV

{
    private FileWriter fWriter;     

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