package BaiThucHanh4;

import java.util.ArrayList;

public class Manager {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Card> cards = new ArrayList<>();

    public Manager() {
    }

    public Manager(ArrayList<User> users, ArrayList<Card> cards) {
        this.users = users;
        this.cards = cards;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    public void showInFoAllOfUser(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Manager{" +
                 cards +
                '}';
    }
}
