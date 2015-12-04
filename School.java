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

        memberlist = new Member[noOfMembers];

        for (int i = 0; i < noOfMembers; i++) {
            memberlist[i] = new Member();
            memberlist[i].readMemberDetails(datarows[i+1]);
        }
    }

    public void Topmark() throws IOException
    {
        System.out.println("Pupil with the highest mark\n");

        int Topmark = 0;
        for (int i = 1; i < noOfMembers; i++)
        {
            if (memberlist[i].getMark() > memberlist[Topmark].getMark()){
                Topmark = i;
            }

            memberlist[i].displayDetails();  
        }

        System.out.println("\n The top mark is : " + Topmark);
        memberlist[Topmark].displayDetails(); 
        System.out.println();
    }

    
}
