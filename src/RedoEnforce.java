//Now using recursion to get sum of numbers between two numbers and eg 5 and 10
//remember between excludes the end number eg 10 in numbers between 5 and 10
public class RedoEnforce{
    public static void main(String[] args){
        int result = sum(5, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end){
        if (end > start){
            return end + sum(start, end-1);
        }
        else{
            return end;
        }


    }
}