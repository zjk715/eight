package liti;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class book {
	static class Book{
        private String index;//编号
        private String name;//名称
        private int price;//单价
        private String press;//出版社
        public Book(String index,String name,int price,String press){
            this.index = index;//编号
            this.name = name;//名称
            this.price = price;//单价
            this.press = press;//出版社
        }
        public String getIndex(){
            return this.index;
        }
        public String getName(){
            return this.name;
        }
        public int getPrice(){
            return this.price;
        }
        public String getPress(){
            return this.press;
        }
        public void setIndex(String index){
            this.index = index;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setPrice(int price){
            this.price = price;
        }
        public void setPress(String press){
            this.press = press;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Book> books = new ArrayList<Book>();
        Map<String,Book> books1 = new HashMap<String,Book>();
        System.out.print("请输入书本数量：");
        int n = input.nextInt();
        for(int i = 0;i < n;++ i){
            String name,index,press,str;
            int price;
            index = input.next();//书本编号
            name = input.next();//名称
            price = input.nextInt();//单价
            press = input.next();//出版社
            Book x = new Book(index,name,price,press);
            books.add(x);
            books1.put(index,x);
        }
        Iterator it = books.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
        Iterator it1 = books1.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry entry = (Map.Entry)it1.next();
            System.out.println("next :" + entry.getKey() + " " + ((Book)entry.getValue()).getName());
        }
    }
}
