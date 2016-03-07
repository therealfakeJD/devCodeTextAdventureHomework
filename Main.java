package com.example.textadventure;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);




        print("What is your name?");

        String name = s.nextLine();

        Player player = new Player(name);
        DecimalFormat df = new DecimalFormat();

        print("Welcome to a New Adventure " + player.getName() + "!");

        int input;

        print("You find yourself in the middle of a dream.  In this dream you are staring straight ahead at a ghost town \n");
        print("You see at the end of the town a bright light and you know that somehow you must get there \n");
        print("But you also realize you are very week... You must make it through this town to wake up \n");
        print("Or you might never wake up again!!!");
        System.out.println("");


        System.out.println("Starting Health: " + player.getHealth());
        System.out.println("Starting Money: $" + player.getMoney());
        System.out.println("");




            print("[0] Quit Game");
            print("[1] Walk to the bar");
            print("[2] Go to the hotel");
            print("[3] Go to the rundown house");
            print("[4] Try to sprint to the end of town");



            input = s.nextInt();

            if (input == 1) {
                print("You have chosen to go to the bar...  The bartender asks if you want to take a shot. You say yes");
                player.modifyHealth(+10);
                print("The shot gives you a rush of energy and you immediately begin feeling better");
                System.out.println("Current Health: " + player.getHealth() + "\n");
                print("But the shot costs you 5 dollars... Be careful about what you buy in the future. \n");
                player.modifyMoney(-5.00);
                System.out.println("You have $" + df.format(player.getMoney()) + " left");

            } else if (input == 2) {
                print("You run to the hotel \n");
                print("The hotel clerk asks if you would like to stay in a room.  You say no! \n");
                print("You feel your eyelids get heavy and you wonder if you should stay \n");
                print("You decide to move on but its going to cost you some health \n");
                player.modifyHealth(-5);
                System.out.println("Now you must find something to help you because you are exhausted \n");
                System.out.println("Current Health: " + player.getHealth());
                System.out.println("Current Money: $" + player.getMoney());



            } else if (input == 3) {
                print("You go to the rundown house \n");
                print("There is a very kind person there who gives you a drink of water and some beef jerky \n");
                print("You immediately start to feel better but you feel you must pay the person for their kindness \n");
                player.modifyHealth(+10);
                player.modifyMoney(-10);
                System.out.println("Current Health: " + player.getHealth());
                System.out.println("Current Money: $" + player.getMoney());
            } else if (input == 4) {
                print("You try to sprint to the end of town");
                print("You are too weak to keep running and you notice that the light is still getting further away \n");
                print("You decide you need more answers and you suddenly see a police station \n");
                print("It looks abandoned but someone may be there to give you the answers you need \n");
                print("And if you don't get something to eat or drink soon you may never wake up!!! \n");
                player.modifyHealth(-9);
                System.out.println("Current Health: " + player.getHealth());
                System.out.println("Current Money: $" + player.getMoney());
            }
    }
    public static void print(String msg){
        System.out.println(msg);
    }


}
