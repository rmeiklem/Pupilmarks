import javax.swing.JOptionPane;
import java.io.*;
public class School
{
    private Member memberlist [];
    int noOfMembers;
    FILEREADCSV fILEREAD;
    public School()
    {
        fILEREAD = new FILEREADCSV();
    }

    public void processMembers() throws IOException
    {
        setUpMemberList();
        Topmark();
    }

    private void setUpMemberList() throws IOException
    { 
        System.out.println("top mark: top mark update");
        System.out.println("** preparing to read data file.");
         
        String[] datarows = fILEREAD.readCSVtable();
        noOfMembers = datarows.length - 1;
        
        System.out.println("** " + noOfMembers + " rows read.\n\n");
    }

    public void Topmark()
    {
        //placeholder
    }
}
