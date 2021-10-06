package BaiThucHanh4;

import java.time.LocalDate;

public class Card {
    private User user;
    private LocalDate borrowedDate;
    private LocalDate  expirationDate;
    private String bookName;

    public Card( LocalDate borrowedDate, String bookName) {
        this.borrowedDate = borrowedDate;
        this.expirationDate = borrowedDate.plusDays(15);
        this.bookName = bookName;
    }

    public Card() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getBookCode() {
        return bookName;
    }

    public void setBookCode(String bookCode) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Người mượn :" + user +
                ", Ngày mượn=" + borrowedDate +
                ", Hạn trả =" + expirationDate +
                ", Tên sách ='" + bookName + '\'' +
                '}';
    }
}
