package Com.company.satr;
import java.sql.SQLOutput;
public class NewPatternProgram {
    public static void main(String[] args){
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
               if(j>=6-i)
               {
                   System.out.print("*");
               }else
                   System.out.print(" ");
            }
            System.out.println();
        }

    }
}