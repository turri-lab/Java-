package houserent.view;

import houserent.service.HouseService;
import houserent.utils.Utility;

public class HouseView {
    //显示主菜单的功能
    public void mainMenu()
    {
        HouseService house=new HouseService(10);
        int chose=0;
        boolean loop=true;
        int con;
        do {
            System.out.println("------------------房屋出租系统------------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 源");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退 出");
            System.out.println("\t\t\t请选择功能对应的数字（1-6）");
            chose= Utility.readChar();
            switch (chose)
            {
                case 1:
                    HouseAdd.house_add(house);
                    break;
                case 2:
                    HouseSearch.HouseSearch(house);
                    break;
                case 3:
                    HouseSub.HouseSub(house);
                    break;
                case 4:
                    HouseModify.HouseModify(house);
                    break;
                case 5:
                    HouseList.print(house);
                    break;
                default:
                    loop=false;
                    break;
            }
            System.out.println("想要继续进行使用系统功能吗？");
            con=Utility.readYes();
            if(con==0)
            {
                break;
            }
        }while(loop);
    }

}
