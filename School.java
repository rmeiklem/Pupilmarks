import javax.swing.JOptionPane;
import java.io.*;
public class School
{
    private Member memberlist [];
    int noOfPupils;
    int Topmark = 0;
    FILEREADCSV fILEREAD;
    FILEREADCSV highestmark;
    public School()
    {
        fILEREAD = new FILEREADCSV();
        highestmark = new FILEREADCSV();
    }

    public void processMembers() throws IOException
    {
        setUpMemberList();
        Topmark();
        displaydetails();
    }

    private void setUpMemberList() throws IOException
    { 
        System.out.println("top mark: top mark update");
        System.out.println("** preparing to read data file.");

        String[] datarows = fILEREAD.readCSVtable();
        noOfPupils = datarows.length - 1;

        System.out.println("** " + noOfPupils + " rows read.\n\n");

        memberlist = new Member[noOfPupils];

        for (int i=0; i<noOfPupils; i++) {
            memberlist[i] = new Member();
            memberlist[i].readMemberDetails(datarows[i+1]);
        }
    }

    public void displaydetails() throws IOException
    {
        System.out.println("Pupil with the highest mark\n" + memberlist[Topmark].getName() + "" + memberlist[Topmark].getMark());
        highestmark.writeCSVtable(memberlist[Topmark].getName() + "," + memberlist[Topmark].getMark());
    }

    public void Topmark() throws IOException
    {
        int maxMark = memberlist[0].getMark();

        for (int i = 1; i < noOfPupils; i++)
        {
            if (memberlist[i].getMark() > memberlist[Topmark].getMark()){
                Topmark = i;
                maxMark = memberlist[i].getMark();
            }

        }

    }

    public static void main(String[] args) throws IOException{
        School mySchool = new School();
        mySchool.processMembers();
    }
    

    

}
