public class CoinFlip {
    public CoinFlip() {
    }

    public String Flip() {
        int num = (int) (Math.random() * 2);

        if(num == 0) {
            return "heads";
        } else {
            return "tails";
        }
    }

    public double Simulate(int numberOfFlips) {
        
    }
}
