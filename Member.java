//import javax.swing.JOptionPane; 
//import java.io.*;
public class Member
{

    private String Fname;
    private String Sname;
    private int Mark;

    public Member()
    {
        Fname = "";
        Sname = "";
        Mark = 0;
        
    }

    public void readMemberDetails(String dataItems)
    {

        String[] rowItems = dataItems.split(",");

        Fname = rowItems[0];
        Sname = rowItems[1];
        Mark = Integer.parseInt(rowItems[2]);

    }

    public String writeDetails()
    {
        String memberData = "";
        memberData = memberData.concat(Fname);
        memberData = memberData.concat(",");
        memberData = memberData.concat(Sname);
        memberData = memberData.concat(",");
        memberData = memberData.concat(Integer.toString(Mark));
        return memberData;
    }
    public int getMark(){

        return Mark;
    }
    
}

