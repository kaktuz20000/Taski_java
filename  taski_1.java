

public class taski {

    // вывод всех тасков    
    public static void main(String[] args) {
        System.out.println("1.1 = " + convert(5)); 
        System.out.println("1.2 = " + convert(3)); 
        System.out.println("1.3 = " + convert(8)); 

        System.out.println("2.1 = " + (fitCalc(15, 1))); 
        System.out.println("2.2 = " + (fitCalc(24, 2))); 
        System.out.println("2.3 = " + (fitCalc (41, 3)));

        System.out.println("3.1 = " + (containers(3, 4, 2)));
        System.out.println("3.2 = " + (containers(5, 0, 2)));
        System.out.println("3.3 = " + (containers(4, 1, 4)));

        System.out.println("4.1 = " + (triangleType(5, 5, 5))); // равносторонний 
        System.out.println("4.2 = " + (triangleType(5, 4, 5))); // равнобедренный
        System.out.println("4.3 = " + (triangleType(3, 4, 5))); // разносторонний 
        System.out.println("4.4 = " + (triangleType(5, 1, 1))); // не треугольник

        System.out.println("5.1 = " + (ternaryEvaluation(8, 4))); 
        System.out.println("5.2 = " + (ternaryEvaluation(1, 11))); 
        System.out.println("5.3 = " + (ternaryEvaluation(5, 9))); 

        System.out.println("6.1 = " + (howManyItems(22, 1.4, 2)));  
        System.out.println("6.2 = " + (howManyItems(45, 1.8, 1.9))); 
        System.out.println("6.3 = " + (howManyItems(100, 2, 2)));  
        
        System.out.println("7.1 = " + (factorial(3)));
        System.out.println("7.2 = " + (factorial(5)));
        System.out.println("7.3 = " + (factorial(7)));

        System.out.println("8.1 = " + (gcd(48, 18)));
        System.out.println("8.2 = " + (gcd(52, 8)));
        System.out.println("8.3 = " + (gcd(259, 28)));

        System.out.println("9.1 = " + (ticketSaler(70, 1500)));
        System.out.println("9.2 = " + (ticketSaler(24, 950)));
        System.out.println("9.3 = " + (ticketSaler(53, 1250)));

        System.out.println("10.1 = " + (tables(5, 2)));
        System.out.println("10.2 = " + (tables(31, 20)));
        System.out.println("10.3 = " + (tables(123, 58)));
    }

    // 1 - перевод галлонов в литры
    public static double convert(int gallon) {
        double liter = gallon * 3.785;
        return liter;
    }


    // 2 - расчет сожженных калорий
    public static int fitCalc(int minutes, int intensity) {
        // Определяем коэффициент калорий от интенсивности
        int caloriesPerMinute;
        switch (intensity) {
            case 1: // низкая интенсивность
                caloriesPerMinute = 1;
                break;
            case 2: // cредняя интенсивность
                caloriesPerMinute = 2;

                break;
            case 3: // высокая интенсивность
                caloriesPerMinute = 3;
                break;
            default: // Неверное значение интенсивности
                throw new IllegalArgumentException("от 1 до 3");
            }
            
            // Рассчитываем количество сожженных калорий
            return minutes * caloriesPerMinute;
    }
    

    

    // 3 - метод для вычисления товаров
       public static int containers(int boxes, int bags, int barrels) {
    
        // Коробки содержат по 20 товаров каждая
        int boxCapacity = 20;
        // Мешки содержат по 50 товаров каждый
        int bagCapacity = 50;
        // Бочки содержат по 100 товаров каждая
        int barrelCapacity = 100;
    
        int totalItems = (boxes * boxCapacity) + (bags * bagCapacity) + (barrels * barrelCapacity);
    
        return totalItems;
    }
    

    // 4 - метод для определения типа треугольника
    public static String triangleType(int X, int Y, int Z) {
        // Проверка, является ли это треугольником по неравенству треугольника
        if (X + Y <= Z || X + Z <= Y || Y + Z <= X) {
            return "не треугольник";
        }
            
        // Проверка на равносторонний треугольник
        if (X == Y && Y == Z) {
            return "равносторонний";
        }
            
        // Проверка на равнобедренный треугольник
        if (X == Y || X == Z || Y == Z) {
            return "равнобедренный";
        }
            
        // Если все стороны разные, то это разносторонний треугольник
        return "разные стороны";
    }
    
    
    // 5 - метод для нахождения большего числа
    public static int ternaryEvaluation(int a, int b) {
        // Используем тернарный оператор для сравнения чисел a и b
        return (a > b) ? a : b;
    }
    

    // 6 - метод для расчета количества пододеяльников
    public static int howManyItems(int n, double w, double x) {
        int fabrics = n * 2;
        double wx = (w * x) * 2 * 2;
        int counter = 0;

        while(fabrics >= wx) {
            fabrics -= wx;
            counter++;
        }
        return counter;
    }
    
    
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }{
            return n * factorial(n - 1);
        }
    }


    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static String ticketSaler(int a, int b) {
        
        double sale = ((a * b) * 0.72);
        if(sale == (long) sale) {
        return String.format("%d",(long)sale);
        }{
        return String.format("%s",sale);
        }
    }


    public static double tables(double s, double d) {
        double parti = (s/2) - d;
        if (parti <= 0){
            return 0;
        }{
            return Math.ceil(parti);
        }
    }
}