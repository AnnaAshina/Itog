package Farm.Instances.Dialogs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Dialog {

    Scanner sc = new Scanner(System.in);
    public String[] printDialog(){
        String [] dataArray = new String[3];
        System.out.println("Ââåäè èìÿ: ");
        dataArray[0] = sc.nextLine();
        System.out.println("Ââåäèòå äàòó ðîæäåíèÿ â ôîðìàòå 'ÃÃÃÃ-ÌÌ-ÄÄ': ");
        dataArray[1] = sc.nextLine();
        System.out.println("Ââåäèòå öâåò: ");
        dataArray[2] = sc.nextLine();
        return dataArray;
    }
}