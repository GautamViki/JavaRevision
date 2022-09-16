import java.util.ArrayList;
import java.util.List;

abstract class Publication {
    private int numOfPage;
    private int price;
    private String publisherName;

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publication {" +
                "numOfPage=" + numOfPage +
                ", price=" + price +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}

class Book extends Publication {
    Book(int page, int price, String name) {
        this.setPublisherName(name);
        this.setPrice(price);
        this.setNumOfPage(page);
    }
}

class Journal extends Publication {
    Journal(int page, int price, String name) {
        this.setPublisherName(name);
        this.setPrice(price);
        this.setNumOfPage(page);
    }
}

class Library {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Book book1 = new Book(580, 420, "RajKamal");
        list.add(book1);
        Book book2 = new Book(487, 240, "MgHills");
        list.add(book2);
        Book book3 = new Book(682, 480, "Oxford");
        list.add(book3);

        Journal journal1 = new Journal(50, 30, "IndiaToday");
        list.add(journal1);
        Journal journal2 = new Journal(35, 40, "Washingtonpost");
        list.add(journal2);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
