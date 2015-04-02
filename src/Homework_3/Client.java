package Homework_3;

public class Client {
    private static final String CLIENT_LOGIN = "client";
    private String name;
    private IGoods[] listOfClientsGoods;
    private int clientsGoodsCounter;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean toBuy(int techID) {
        for (int i = 0; i < ServiceCenter.getGoodsCounter(); i++) {
            if (ServiceCenter.getListOfGoods()[i].getID() == techID) {
                listOfClientsGoods[clientsGoodsCounter] = ServiceCenter.getListOfGoods()[i];
                clientsGoodsCounter ++;
            }
        }
        return true;
    }

    public boolean referToRepair(int techID) {
        for (int i = 0; i < clientsGoodsCounter; i++) {
            if (listOfClientsGoods[i].getID() == techID) {
                System.arraycopy(listOfClientsGoods, i + 1, listOfClientsGoods, i, clientsGoodsCounter - i);
                clientsGoodsCounter --;
            }
        }
        return true;
    }

}
