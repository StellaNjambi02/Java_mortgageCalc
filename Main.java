import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println ("Hello, World!");
        int myAge=25;
        int herAge=myAge;
        System.out.println(herAge);

        
    //PRIMITIVE TYPES
        byte age=30;
        long viewsCount=3_123_456_789L;
        float price = 10.99F;
        char letter ='A';
        boolean isEligible =false;


   //reference types
       Date now = new Date(); //create objects
       System.out.println(now);    
       String message ="Hello" + " World" + "!";
       
       System.out.println(message.startsWith("!!"));
       System.out.println(message.endsWith("!"));
       System.out.println(message.indexOf("H"));
       System.out.println(message.replace("!","*")); //does not modify our original string.
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); //removes leading and trailing spaces
   int [] numbers=new int[5];
   numbers[0]=1;
   numbers[1]=2;
   Arrays.toString(numbers); // This will not print the array, it just converts it to a string.
   
   System.out.println(Arrays.toString(numbers)); //prints the actual array elements
   int [] numbers2={2,3,7,9,5,6};
   Arrays.sort(numbers2); //sorts the array in ascending order
   System.out.println(Arrays.toString(numbers2)); //prints the sorted array
   System.out.println(numbers2.length); //prints the length of the array
  
  
   int [] [] []numbers7 =new int[2][3][5]; //2 rows, 3 columns
   numbers7[0][0] [0]=1;
   System.out.println(Arrays.toString(numbers)); //prints the first row of the 2D array

   int [][] numbers6={{1,2,2},{4,5,6}};
   System.out.println(Arrays.toString(numbers2)); //prints the 2D array


//constants
final float pi=3.14F;

//arithmetic expressions
int result=4+5;
System.out.println(result);
double result2 =(double)10/(double)3;
System.out.println(result2);
int x=1;
x++;
int y=++x; //pre-increment
System.out.println(y);
x=x+2;
x+=2; //shorthand for x=x+2


    //use brackets if you want to change BODMAS
    //implicit casting 
    short b=1;
    int f=x+2;
    System.out.println(f);


     //explicit casting
    double a=1.1;
    int c=(int)a; //explicit casting from double to int 
    System.out.println(c);


    //Main class
    int answer =Math.round(1.1F);
    int answer2 =(int)Math.ceil(1.5F);
    int answer3 =(int)Math.floor(1.5F);
    int answer4 =(int)Math.max(1, 2);
    int answer5 =(int)Math.min(1, 2);

    System.out.println(answer2); //rounds the number to the nearest integer


    //formatting numbers -NumberFormat
NumberFormat currency= NumberFormat.getCurrencyInstance();
String result6=currency.format(1234567.891);
System.out.println(result6); //prints the number in currency format


//reading input
Scanner scanner = new Scanner(System.in); //specifies where we are reading data from
System.out.print("Enter age:");
byte age2=scanner.nextByte(); //parses only float values
System.out.println("You are " + age2 );


//reads a single word
System.out.print("Enter your name:");
String name=scanner.nextLine().trim(); //reads a line of text and removes leading and trailing spaces
System.out.println("Your name is " + name);

    }}
 