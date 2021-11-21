package houserent.view;

import houserent.service.HouseService;
import houserent.utils.Utility;

public class HouseSub {
    public static void HouseSub(HouseService house)
    {
        System.out.println("------------------房屋出租系统------------------");
        System.out.println("请选择删除房源的编号(-1选择退出)");
        house.SubHouseTOVector(Utility.readInt());
        System.out.println("------------------删除完成------------------");
    }
}
