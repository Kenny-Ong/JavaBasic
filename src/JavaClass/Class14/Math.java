package JavaClass.Class14;

public class Math {



        void printFiboSeries(int size) {

            int previous =0;
            int currentNumber = 1;
            int nextNum =0;
            System.out.println(previous);
            System.out.println(currentNumber);
            for (int i =0; i<size; i++) {
                nextNum=previous+currentNumber;
                System.out.println(nextNum);
                previous=currentNumber;
                currentNumber=nextNum;
            }
        }

    public static void main(String[] args) {

        Math obj = new Math(); // creating on object of the math class
        obj.printFiboSeries(5); //this is hwo we execute the logic present inside the methods
        obj.printFiboSeries(10);

    }
}
