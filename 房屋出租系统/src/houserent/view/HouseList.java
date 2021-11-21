package houserent.view;

import houserent.service.HouseService;

//房屋列表显示
public class HouseList {
    //房屋显示
    public static void print(HouseService house)
    {
        System.out.println("------------------房 屋 列 表------------------");
        System.out.println("编号\t      房主\t      电话\t      地址\t      月租\t      状态");
        for(int i=0;i<house.getHouse_vector().length;i++)
        {
            if((house.getHouse_vector())[i]==null)
            {
                break;
            }
            //"编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态"
            System.out.println((house.getHouse_vector())[i].getId()+"\t      "+(house.getHouse_vector())[i].getHost()+"\t      "+(house.getHouse_vector())[i].getNumber()+"\t      "+(house.getHouse_vector())[i].getAddress()+"\t      "+(house.getHouse_vector())[i].getRent()+"\t      "+(house.getHouse_vector())[i].getStatus());
        }
        System.out.println("------------------房屋列表完成------------------");
    }
}
