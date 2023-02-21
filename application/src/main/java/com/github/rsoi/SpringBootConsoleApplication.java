package com.github.rsoi;

import com.github.rsoi.service.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {
    private final Greeter greeter;

    @Autowired
    public SpringBootConsoleApplication(Greeter greeter) {
        this.greeter = greeter;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsoleApplication.class, args);
	}

    @Override
    public void run(String... args) {
        greeter.sayHello();

        ArrayList<Goods> listOfGoods = new ArrayList();

            Goods good1 = new Goods(1, "The Magic Wand", 150);
            listOfGoods.add(good1);
            Goods good2 = new Goods(2, "The Book Hogwarts: A History", 109);
            listOfGoods.add(good2);
            Goods good3 = new Goods(3, "The Time-Turner", 20);
            listOfGoods.add(good3);
            Goods good4 = new Goods(4, "The Ravenclaw's Diadem", 1);
            listOfGoods.add(good4);
            Goods good5 = new Goods(5, "The Broomstick Nimbus 2000", 167);
            listOfGoods.add(good5);
            Goods good6 = new Goods(6, "The Golden Snitch", 170);
            listOfGoods.add(good6);
            Goods good7 = new Goods(7, "The Invisibility cloak", 3);
            listOfGoods.add(good7);
            Goods good8 = new Goods(8, "The Wizard Chess Set", 15);
            listOfGoods.add(good8);

            int length = 7;

            int answer1 = 0;


            do {
                System.out.println("Do you want to do something with the list of magic goods?");
                System.out.println("Press:\n1 - yes\n2 - no");
                Scanner input = new Scanner (System.in);
                answer1 = input.nextInt();


                if (answer1 == 1) {
                    System.out.println("What do you want to do?");
                    System.out.println("Press:\n1 - add product;\n2 - delete product\n3 - show the ranged list of magic goods\n4 - show all goods");
                    int answer2;

                    Scanner in = new Scanner(System.in);
                    answer2 = in.nextInt();


                    switch (answer2) {
                        case 1:
                            Scanner added1 = new Scanner(System.in);
                            System.out.println ("Input the ID od added product:");
                            int IDAdded = added1.nextInt();
                            Scanner added2 = new Scanner(System.in);
                            System.out.println ("Input the name of the added product:");
                            String nameAdded = added2.nextLine();
                            System.out.println ("Input the amount of orders:");
                            int amountAdded = added1.nextInt();

                            Goods newGoods = new Goods(IDAdded, nameAdded, amountAdded);
                            listOfGoods.add(newGoods);
                            length++;
                            break;
                        case 2:
                            System.out.println("Please, input an ID of deleted product:");
                            Scanner inputID = new Scanner(System.in);
                            int IDofDeleted = inputID.nextInt();
                            listOfGoods.remove(IDofDeleted - 1);
                            length--;
                            break;
                        case 3:
                            Collections.sort(listOfGoods, Comparator.comparing(Goods::getAvgMrk));
                            Collections.reverse(listOfGoods);
                            for (int i = 0; i <= length; i++) {
                                System.out.println("The goods number " + (i + 1) + ": ID is " + listOfGoods.get(i).getIDProduct() + "; the name is " + listOfGoods.get(i).getNameProduct() + "; the amount of orders is " + listOfGoods.get(i).getAmountOfOrders() + "; the average mark is " + listOfGoods.get(i).getAvgMrk());
                            }
                            break;
                        case 4:
                            for (int i = 0; i <= length; i++) {
                                System.out.println("The goods number " + (i + 1) + ": ID is " + listOfGoods.get(i).getIDProduct() + "; the name is " + listOfGoods.get(i).getNameProduct() + "; the amount of orders is " + listOfGoods.get(i).getAmountOfOrders() + "; the average mark is " + listOfGoods.get(i).getAvgMrk());
                            }

                            break;

                    }
                    if (answer1 == 2)
                        System.out.println("Bye!");

                }
            } while (answer1 == 1);

        }
    }

