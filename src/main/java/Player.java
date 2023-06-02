import java.util.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        // game loop
        while (true) {
            List<Integer> altezzaMontagneList = new ArrayList<>();

            Map<Integer, Integer> mappaIndiciAltezzaMontagne = new HashMap<>();
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                altezzaMontagneList.add(mountainH);
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            Integer counter = 0;
            for (Integer i : altezzaMontagneList) {
                mappaIndiciAltezzaMontagne.put(counter, i);
                counter++;
            }

            Map.Entry<Integer, Integer> maxEntry = null;

            for (Map.Entry<Integer, Integer> entry : mappaIndiciAltezzaMontagne.entrySet()) {

                if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                    maxEntry = entry;
                }
            }


            System.out.println(maxEntry.getKey()); // The index of the mountain to fire on.
        }
    }
}