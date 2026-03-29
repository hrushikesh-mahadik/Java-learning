import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MusicPlayer player = new MusicPlayer();

        player.loadSongs("songs.txt");

        while (true) {
            System.out.println("\n1. Show Songs");
            System.out.println("2. Play Song");
            System.out.println("3. Stop Song");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    player.showSongs();
                    break;

                case 2:
                    System.out.print("Enter song number: ");
                    int num = sc.nextInt();
                    player.playSong(num - 1);
                    break;

                case 3:
                    player.stopSong();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}