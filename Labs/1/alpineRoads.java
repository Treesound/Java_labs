import java.util.Scanner;

public class alpineRoads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numRoads = scanner.nextInt();
        int bestRoad = 0;
        int maxHeight = Integer.MIN_VALUE;
        
        for (int i = 1; i <= numRoads; i++) {
            int numTunnels = scanner.nextInt();
            int minHeight = Integer.MAX_VALUE;
            for (int j = 0; j < numTunnels; j++) {
                int tunnelHeight = scanner.nextInt();
                if (tunnelHeight < minHeight) {
                    minHeight = tunnelHeight; //находим туннель с минимальной высотой на данной дороге
                }
            }

            if (minHeight > maxHeight) {
                maxHeight = minHeight;
                bestRoad = i; //нам нужна дорога, высота самого низкого туннеля на которой максимальна (больше, чем на других дорогах)
            }
        }
        
        System.out.println(bestRoad);
        System.out.println(maxHeight);
        
        scanner.close();
    }
}
