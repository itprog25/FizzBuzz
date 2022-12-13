public class FizzBuzz {
    public void process() {
        int s = 100;
        //for ciklussal 1-100-ig
        for (int i = 1; i <= s; i++)

            // Ha az adott szám osztható 5-tel és 3-mal is, akkor írjuk ki, hogy fizzbuzz
            if (i % 15 == 0){
                System.out.println("fizzbuzz");

            //Ha az adott szám osztható 3-mal, akkor írjuk ki, hogy fizz,
            }else if (i % 3 == 0){
                System.out.println("fizz");

            //Ha az adott szám osztható 5-tel, akkor írjuk ki, hogy buzz
            }else if (i%5 ==0){
                System.out.println("buzz");
            }
    }
}

