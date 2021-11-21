package houserent.view;

import houserent.service.HouseService;
import houserent.utils.Utility;

public class HouseModify {
    public static void HouseModify(HouseService house)
    {
        System.out.println("------------------修 改 客 户------------------");
        System.out.print("请选择待修改的房屋编号:");
        int modify_num=Utility.readInt();
        System.out.println();
        System.out.print("姓名:");
        String name=Utility.readString();
        System.out.println();
        System.out.print("电话:");
        String number=Utility.readString();
        System.out.println();
        System.out.print("地址:");
        String sub_address=Utility.readString();
        System.out.println();
        System.out.print("租金:");
        int sub_rent=Utility.readInt();
        System.out.println();
        System.out.print("状态:");
        String sub_status=Utility.readString();
        System.out.println();
        house.HouseTOModify(modify_num,name,number,sub_address,sub_rent,sub_status);
        System.out.println("------------------修 改 完 成------------------");
    }
}
