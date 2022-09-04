package data_sctructures;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Record user1 = new Record(30, "Alex");
        //System.out.println(user1.age);

        Chain head = new Chain(5, null);

        Scanner scanner = new Scanner(System.in);
        head.add(4, head);
        head.add(8, head);
        //System.out.println("Hello");
        head.printChain(head);
    }

}
