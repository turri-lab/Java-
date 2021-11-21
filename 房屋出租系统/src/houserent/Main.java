package houserent;

import houserent.view.HouseView;

public class Main {
    public static void main(String args[])
    {
        HouseView houseView = new HouseView();
        houseView.mainMenu();
        System.out.println("您已经退出了房屋出租系统");
    }
}
