import java.util.Scanner;

public class Tutorial2 {
    public static void main(String[] args){
        //comparison operators
        int x=1;
        int y=2;
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x>y);
        System.out.println(x<y);

        //logical operators -|| or && ,!
        int temperature = 24;
        boolean isWarm=temperature >20 && temperature <30;
        System.out.println(isWarm);
        
        //if statements
        int temp=32;
        if(temp>30){
            System.out.println("It's a hot day");;
        }
        else if (temp >20 && temp<=30){
            System.out.println("Beautiful day");
        }
        else {
            System.out.println("It's a cold day");
        }
       int income=120000;
       boolean hasHighIncome=false;
       if (income >100_000){
        
        hasHighIncome=true;
       }
         else {
          hasHighIncome=false;
         }
        System.out.println(hasHighIncome);

    // ternary operator
        int income2 =120_000;
        String className =income2 >100_000 ? "First" : "Economy";
        
      // switch statements
      String role ="admin";
      switch (role){
        case "admin":
          System.out.println("You are an admin");
          break;

         case "moderator":
          System.out.println("You are a moderator");
          break;
          
          default:
      }  

    // fizzbuzz
    Scanner scanner =new Scanner (System.in);
    System.out.println("Number");
    int number = scanner.nextInt();
    
    if (number % 3 == 0 && number % 5 == 0) {
        System.out.println("FizzBuzz");
    } else if (number % 3 == 0) {
        System.out.println("Fizz");
    } else if (number % 5 == 0) {
        System.out.println("Buzz");
    } else {
        System.out.println(number);
    }
    //for loop
     for(int i=0;i<5 ;i++){
        System.out.println("Hello world");
     }
     //while loop
     int i=10;
     while(i>0){
        System.out.println("Hello world");
        i--;
     }
    
     String input ="";
     while(!input.equals("quit")){
        
        System.out.println("Input:");
        input=scanner.next().toLowerCase();
        System.out.println(input);
     
     }
    // do while loop

    do{
    System.out.println("Input:");
      input=scanner.next().toLowerCase();
      System.out.println(input);    
    }
    while(!input.equals("quit"));

    //break and continue
    for(int j=0;j<5;j++){
        if(j==2){
            continue; //skips the current iteration
        }
        if(j==4){
            break; //exits the loop
        }
        System.out.println("Hello world " + i);
    }

    //for each
    String [] fruits ={"apple", "banana", "orange"};

    for (String fruit:fruits){
        System.out.println(fruit);
    }
}}
