package app;

import app.GUI.GUI;
import app.GUI.Pages.AddDataMenuPage;
import app.GUI.Pages.MenuPage;
import app.GUI.Pages.ViewDataMenuPage;

public class App {
    public static int MENU = 0, ADD_DATA = 1, VIEW_DATA = 2;
    public static void main(String[] args) throws Exception {
        GUI g = new GUI(new MenuPage(), new AddDataMenuPage(), new ViewDataMenuPage());
        System.out.println("Hello Java");
        g.start();
    }
}