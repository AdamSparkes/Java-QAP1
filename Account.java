public class Account {
//Fields
private String id;
private String name;
private int balance;


// Needed Cunstructors
public Account(String id, String name) {
    this.id = id;
    this.name = name;
}

public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
}

//getting the ID, Name and Balance from the Account
public String getID(){
    return this.id;
}


public String getName(){
    return this.name;
}

public int getBalance(){
    return this.balance;
}


public int credit(int amount){
    this.balance+=amount;
    return this.balance;
}

public int debit(int amount){
    if (amount <= this.balance){
    this.balance-=amount;
   
} else {
    System.out.println("Amount exceeded balance");}

return this.balance;
}

public int transferTo(Account another, int amount) {
    if (amount <= this.balance) {
        this.debit(amount);  
        another.credit(amount);  
    } else {
        System.out.println("Amount exceeded balance");
    }
    return this.balance;
}
    
  public String toString() {
        return "Account[id=" + this.id + ", name=" + this.name + ", balance=" + this.balance + "]";
    }
}