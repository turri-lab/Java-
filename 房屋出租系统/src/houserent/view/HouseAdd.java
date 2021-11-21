package houserent.view;
import houserent.domian.House;
import houserent.service.HouseService;
import houserent.utils.Utility;

public class HouseAdd {
    //添加房屋界面
    public static void house_add(HouseService house)
    {
        System.out.println("------------------添加房屋------------------");
        System.out.println("姓名");
        String host=Utility.readString();
        System.out.println("电话");
        String number=Utility.readString();
        System.out.println("地址");
        String address=Utility.readString();
        System.out.println("月租");
        int rent=Utility.readInt();
        System.out.println("状态(未出租/已出租)");
        String status=Utility.readString();
        //int id, String host, String number, String address, int rent, String status
        House my_house=new House(HouseService.generate_id(),host,number,address,rent,status);
        house.AddHouseTOVector(my_house);
        System.out.println("------------------添加完成------------------");
    }
}
