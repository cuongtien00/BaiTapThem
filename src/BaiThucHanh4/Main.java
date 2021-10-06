package BaiThucHanh4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User cuong = new User("Cuong","H210811","2000","2A");
        User huyen = new User("Huyen","H21081155","2002","KT47C");
        ArrayList<User> users = new ArrayList<>();
        users.add(cuong);
        users.add(huyen);

        Card cardOfCuong = new Card(LocalDate.of(2021,10,4),"Dac nhan tam");
        cardOfCuong.setUser(cuong);
        Card cardOfHuyen = new Card(LocalDate.of(2021,10,4),"100 buc thu gui ban");
        cardOfHuyen.setUser(huyen);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(cardOfCuong);
        cards.add(cardOfHuyen);





        Manager ongHiep = new Manager(users,cards);
        ongHiep.showInFoAllOfUser();
    }


}
