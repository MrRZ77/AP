package quiz;

public class BookShop {
    Pen pen1 = new Pen("blue",30,"cclass");
    Pen pen2 = new Pen("red",30,"cclass");
    Book book1 = new Book("big java", 500);
    Book book2 = new Book("head first java" ,400);
    Pen pen[] = [pen1,pen2];
    Book book[] = [book1,book2];
    for (int i = 0; i <2; i++){
        System.out.println("brand is "+pen[i].brand +"color is "+pen[i] );
    }
}
