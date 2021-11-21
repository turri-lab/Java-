package houserent.view;

import houserent.service.HouseService;
import houserent.utils.Utility;

public class HouseSearch {
    public static void HouseSearch(HouseService house)
    {
        System.out.println("------------------查找房源------------------");
        System.out.println("请输入您像查找的id:");
        house.HouseTOSearch(Utility.readInt());
        System.out.println("------------------查找结束------------------");
    }
}
