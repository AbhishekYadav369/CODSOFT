package numberguess.game;
 class Guess {
     private int count = 0;
     private int score = 0;
     private int round=1;

     public int getRound() {  return round;}

     public void setRound(int round) { this.round = this.round + round; }

     public int getScore() { // return Math.max(0, score);
         return  score<0?0:score;}

     public void setScore(int score) { this.score = this.score+ score;}

     public void setCount(int count) {  this.count = count;}

     public int getCount() { return count;}
    public boolean guess(int random, int guess) {
        count++;
        if (guess < random) {
            System.out.println("Your guess is too low.Try again !");
            return false;
        } else if (guess > random) {
            System.out.println("Your guess is too high.Try again !");
            return false;
        } else {
            System.out.println("Congratulations! You've guessed the number in " + count + " attempts.");
            setScore(10);
            return true;
        }
    }  
    
}
