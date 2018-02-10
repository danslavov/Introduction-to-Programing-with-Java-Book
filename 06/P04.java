public class P04 {
    public static void main(String[] args) {
        String suit = "no";
        String value = "no";
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    suit = "clubs";
                    break;
                case 1:
                    suit = "diamonds";
                    break;
                case 2:
                    suit = "hearts";
                    break;
                case 3:
                    suit = "spades";
                    break;
            }
            for (int j = 2; j < 15; j++) {
                switch (j) {
                    case 2:
                        value = "Two";
                        break;
                    case 3:
                        value = "Three";
                        break;
                    case 4:
                        value = "Four";
                        break;
                    case 5:
                        value = "Five";
                        break;
                    case 6:
                        value = "Six";
                        break;
                    case 7:
                        value = "Seven";
                        break;
                    case 8:
                        value = "Eight";
                        break;
                    case 9:
                        value = "Nine";
                        break;
                    case 10:
                        value = "Ten";
                        break;
                    case 11:
                        value = "Jack";
                        break;
                    case 12:
                        value = "Queen";
                        break;
                    case 13:
                        value = "King";
                        break;
                    case 14:
                        value = "Ace";
                        break;
                }
                System.out.printf("%s of %s%n", value, suit);
            }
        }
    }
}
