package HackerRank;

interface OnlineAccount {
    int basePrice = 50;
    int regularMoviePrice = 100;

    int exclusiveMoviePrice = 200;

}

public class Account implements OnlineAccount, Comparable<Account> {

    int noOfRegularMovies, noOfExclusiveMovies;
    String ownerName;

    //1.
    public Account(int noOfRegularMovies, int noOfExclusiveMovies) {

        this.noOfExclusiveMovies = noOfExclusiveMovies;
        this.noOfRegularMovies = noOfRegularMovies;

    }

    //2,
    public int monthlyCost() {
        return basePrice + (this.noOfExclusiveMovies * exclusiveMoviePrice) + (this.noOfRegularMovies * regularMoviePrice);

    }

    //3.
    @Override
    public int compareTo(Account m) {
        return this.monthlyCost() - m.monthlyCost();
    }

    //4.
    public String toString() {
        return "Owner is " + this.ownerName + " and monthly cost is " + this.monthlyCost() + " USD.";
    }


    public static void main(String[] args) {
        Account obj = new Account(5, 2);
        System.out.println(obj.toString());

/*-
        ArrayList<Account> list = new ArrayList<Account>();
        list.add(new Account(5,2));
        list.add(new Account(1,2));
        list.add(new Account(5,4));
        list.add(new Account(3,1));
        list.forEach(s-> System.out.println(s));
        System.out.println("after sorting");
        Collections.sort(list);
        list.forEach(s-> System.out.println(s));
        */

    }
}
