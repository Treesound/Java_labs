import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class treasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int treasureX = scanner.nextInt();
        int treasureY = scanner.nextInt();
        //нужно сохранить координаты карты для последующей обработки
        List<String> directions = new ArrayList<>();
        List<Integer> steps = new ArrayList<>();

        while (true) {
            String direction = scanner.next();
            if (direction.equals("стоп")) {
                break;
            }
            int step = scanner.nextInt();
            directions.add(direction);
            steps.add(step);
        }

        int currentX = 0;
        int currentY = 0;
        int minInstructions = 0;

        for (int i = 0; i < directions.size(); i++) {
            String direction = directions.get(i);
            int step = steps.get(i);

            // Выполняем указание, если оно приближает нас к кладу
            switch (direction) {
                case "север":
                    if (treasureY > currentY) {
                        currentY += step;
                        minInstructions++;
                    }
                    break;
                case "юг":
                    if (treasureY < currentY) {
                        currentY -= step;
                        minInstructions++;
                    }
                    break;
                case "запад":
                    if (treasureX < currentX) {
                        currentX -= step;
                        minInstructions++;
                    }
                    break;
                case "восток":
                    if (treasureX > currentX) {
                        currentX += step;
                        minInstructions++;
                    }
                    break;
            }

            if (currentX == treasureX && currentY == treasureY) {
                break;
            }
        }
        System.out.println(minInstructions);
    }
}
