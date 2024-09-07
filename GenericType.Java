
// Generic pada java digunakan untuk memuat dan mengembalikan tipedata yang bebas

// contoh: kita akan lebih mudah untuk membuat method yang mereturn semua tipe data dibandigkan
// kita membuat method 1 per 1 dengan tipe data berbeda


public class Main {
  
    Integer[] arr = {1, 2, 3, 4, 5};
    Double[] arr1 = {1.2, 2.3, 3.1, 4.2, 5.5};
    String[] arr2 = {"Selalu", "aku", "belakang mu", "disaat", "erat-eratnya"};
    Character[] arr3 = {'j', 'e', 'n', 'a', 'k'};

 
    public static <Alltype> void DisplayArray(T[] args) {
        for (Alltype x : args) {
            System.out.print(x + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        
    
        DisplayArray(new Main().arr); 
        DisplayArray(new Main().arr1); 
        DisplayArray(new Main().arr2); 
        DisplayArray(new Main().arr3); 
    }
}


