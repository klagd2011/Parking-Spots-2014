
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author S500900
 */
public class RunProgram {

    /**
     * @param args the command line arguments
     */
    static String currentLot = "";

    static NorthLot northLot;
    static SouthLot southLot;
    static BusLot busLot;
    static ChooseLot main_menu;
    static addStudent addInterface;
    static RetrieveSpot getInterface;
    
    public static void main(String[] args) throws IOException {
        Verification start = new Verification();
        establish();
        start.show();
    }

    public static void establish() throws IOException
    {
        northLot = new NorthLot();
        southLot = new SouthLot();
        busLot = new BusLot();
        main_menu = new ChooseLot();
        addInterface = new addStudent();
        getInterface = new RetrieveSpot();
    }

}
