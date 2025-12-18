public class WhileLoopDice {
    public static void main(String[] args) {

        int dice = (int) ((Math.random() * 6) + 1);

        while (dice != 6) {
            System.out.println("Dice: " + dice);
            dice = (int) ((Math.random() * 6) + 1);
        }

        System.out.println("Dice: 6 — Game Over");
    }
}
