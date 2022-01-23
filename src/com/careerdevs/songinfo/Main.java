package com.careerdevs.songinfo;

import java.util.Scanner;

// step 0: Create scanner
// step 1: take user input;
// step 2: create an instance
// step 3: print the fields' value in the terminal
public class Main {
    public static void main(String[] args) {

//        Song song1 = new Song("Man in the Mirror","Micheal Jackson", "Pop","none", (int) 5.19);
//        System.out.println(song1);
         songPlayBack();

    }

    public static void songPlayBack() {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the name of the song ? \n Song Name:");
        String title = scan.nextLine();

        System.out.print("What is the name of the artist ? \n Artist Name:");
        String artist = scan.nextLine();

        System.out.print("What is the genre of this song ? \n Genre:");
        String genre = scan.nextLine();

        System.out.print("Are there any features on this song ? \n Features:");
        String features = scan.nextLine();

        System.out.print("How long is the song? \n Song Length:");
        int seconds = scan.nextInt();

        Song userGeneratedSong = new Song(title, artist, genre, features,seconds);

        //System.out.println(userGeneratedSong.artistName+" "+"is a"+" "+typeOfGenre +" "+"artist who is notoriously known for his hit record:" +""+songName+","+" "+" which has a runtime of"+" "+seconds+"secs'");
        System.out.println(userGeneratedSong.title);

    }

}
