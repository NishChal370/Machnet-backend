package Question3;
/*
    Question 3
 */
public class Number {
    private  int  value = 153;

    public boolean isZero ( ){
        if (value == 0)
            return true;
        else
            return false;
    }

    public boolean isPositive(){
        if(value <0){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean isNegative(){
        if(value >0){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean isOdd(){
        if(value%2 != 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEven(){
        if(value%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean  isAmstrong() {
        int number=0;
        int reminder;
        int val = value;
        while(val != 0){
            reminder = val%10;
            number = number + reminder*reminder*reminder;
            val = val/10;
        }
        if(number == val){
            return true;
        }else{
            return false;
        }
    }

    public boolean isPrime() {
        boolean flag = false;
        for (int i = 2; i <= value / 2; ++i) {
            if (value % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            return true;
        }else {
            return false;
        }
    }

    public int getFactorial(){
        int ans = 1;
        for(int i = value; i>0 ; i--){
            ans *= i;
        }
        return ans;
    }

    public int getSqr(){
        return (value*value);
    }

    public int sumDigits(){
        int temp = value;
        int sum=0,digit;

        while(temp!=0){
            digit=temp%10;
            sum+=digit;
            temp=temp/10;
        }
        return sum;
    }

    public int getReverse(){
        int reversed = 0;
        int val = value;
        if(val>9){
            while(val != 0) {
                int digit = val % 10;
                reversed = reversed * 10 + digit;
                val = val / 10;
            }
        }
        return reversed;
    }

    public double getSqrt(){
        int val = value;
        return Math.sqrt(val);
    }

    public static void main(String[] arg){
        Number numbObj = new Number();
        System.out.println("isZero: "+numbObj.isZero());
        System.out.println("isPositive: "+numbObj. isPositive());
        System.out.println("isNegative: "+numbObj.isNegative());
        System.out.println("isOdd: "+numbObj.isOdd());
        System.out.println("isEven: "+numbObj.isEven());
        System.out.println("isPrime: "+numbObj.isPrime());
        System.out.println("isAmstrong: "+numbObj.isAmstrong());
        System.out.println("getFactorial: "+numbObj.getFactorial());
        System.out.println("getSqr: "+numbObj.getSqr());
        System.out.println("sumDigits: "+numbObj.sumDigits());
        System.out.println("getReverse: "+numbObj.getReverse());
        System.out.println("getSqrt: "+numbObj.getSqrt());

    }
}
