import Dev.Devel;
import Page.Pages;
import Emp.FirstExample;

/**
 * Created by ROSA on 3/26/16.
 */
public class Main {

    public static void main(String args[]) {
        grab();
    }

    public static void grab() {
        System.out.println("hello");
        Pages.krisp();
        Devel.Devels();
        new FirstExample();
        FirstExample.mysqlEMP();
    }
}
