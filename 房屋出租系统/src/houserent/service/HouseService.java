package houserent.service;

import houserent.domian.House;
import houserent.view.HouseAdd;

/*
* 1.定义House[]保存House对象
* 2.响应HouseView的调用
* 3.完成房屋信息的各种操作（crud）
* */
public class HouseService {
    //记录数组的长度
    private int num=0;
    //自增长的id
    private static int id=0;
    //1.定义House[]保存House对象
    private House[] house_vector=new House[10];
    //初始化数组大小
    public HouseService(int Size)
    {
        house_vector=new House[Size];
        //int id, String host, String number, String address, int rent, String status
        //house_vector[0]=new House(1,"Li","132","新疆",1200,"代售");
    }
    public House[] getHouse_vector() {
        return house_vector;
    }

    //在数组中添加对象
    public void AddHouseTOVector(House house)
    {
        if(num== house_vector.length)
        {
            System.out.println("已经超过存储范围了");
        }
        else
        {
            house_vector[num++]=house;
        }
    }
//    //id的自增长
    public static int generate_id()
    {
        return id++;
    }

    //在数组中删除对象
    public void SubHouseTOVector(int sub_id)
    {
//        if(house_vector[sub_id]==null)
//        {
//            System.out.println("id不存在");
//        }
//        else
//        {
//            for(int i=sub_id;i<id-1;i++)
//            {
//                house_vector[i]=house_vector[i+1];
//            }
//        }
//        id--;
        int length = house_vector.length;
        House[] sub_vector=new House[length];
        for(int i=0,k=0;i<10;i++)
        {
            if(i!=sub_id)
            {
                sub_vector[k]=house_vector[i];
                k++;
            }
        }
        house_vector=sub_vector;
        num--;
    }

    //在数组中返回查找对象
    public void HouseTOSearch(int sub_id)
    {
        System.out.println(house_vector[sub_id].getId()+"\t      "+house_vector[sub_id].getHost()+"\t      "+house_vector[sub_id].getNumber()+"\t      "+house_vector[sub_id].getAddress()+"\t      "+house_vector[sub_id].getRent()+"\t      "+house_vector[sub_id].getStatus());
    }

    //修改数组中对象的信息
    //顺序：姓名、电话、地址、租金、状态
    public void HouseTOModify(int sub_id,String host,String number,String address,int rent,String status)
    {
        house_vector[sub_id].setNumber(host);
        house_vector[sub_id].setNumber(number);
        house_vector[sub_id].setAddress(address);
        house_vector[sub_id].setRent(rent);
        house_vector[sub_id].setStatus(status);
    }
}
