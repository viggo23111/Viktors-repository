/*6.a make 2 integer variables named a and b. Print "Success!" if either of them is equal to 10 or if the sum is. If not, print "Failure!".
 6.b make 3 integer variables named x, y and z. Print "Success!" if their sum is 30, but none of them may have the value of 10, 20 or 30. Otherwise print "Failure!".*/
/*
int a=0;
 int b=10;
 int sum=a+b;
 
 if (a==10 || b==10 || sum==10){
 println("Success!");
 }else{
 println("Failure!");
 }*/

int x=0;
int y=27;
int z=3;
int sum=x+y+z;

if (sum==30 && x!=10 && x!=20 && x!=30 && y!=10 && y!=20 && y!=30 && z!=10 && z!=20 && z!=30) {
  println("Success!");
} else {
  println("Failure!");
}

//Shorter half solution (is not working if you put 0 in one of the variables...)
/*if (sum==30 && x%10!=0 && y%10!=0 && z%10!=0){
 println("Success!");
 }else{
 println("Failure!");
 }*/
