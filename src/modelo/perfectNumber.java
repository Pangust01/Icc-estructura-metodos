package modelo;

public class perfectNumber {
    public boolean isPrime(double number) {
        if (number<=1) {
            return false;
        }
        for (int i = 2; i < number/2; i++) {
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }
    public boolean isPerfectNumber2(double number) {

        double count=1;
        double sumaCount=1;
        for (int i = 1; i <= number/2; i++) {
            count*=2;
            sumaCount+=count;
            if (isPrime(sumaCount)) {
                double multiPoten=(count*sumaCount);
                if (multiPoten==number) {
            
                    return true;
                }
            }
        }
        
        return false;
    }
}
