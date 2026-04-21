class Solution {
    public void calculate(int a, int b, int operator) {
        // code here
       
        if(operator == 1){
            System.out.print(a+b);
        }
        else if(operator == 2){
            System.out.print(b -a);
        }
        else if(operator == 3){
            System.out.print(a * b);
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}  