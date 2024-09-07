
//Exception Handling merupakan bentuk dari if else dengan security
//example;

Scanner scan = new Scanner();

int x = scan.next();
int y = scan.next();
int z = x/y;
System.out.println("Hasil adalah" + z);

//jika user menginputkan 0 maka yang tejadi adalah error, untuk menghindari kejadian tersebut
//dan memberhentikan keseluruhan program kita menggunakan exception handling

//menggunakan exception handling:
try{

int x = scan.next();
int y = scan.next();
int z = x/y;
System.out.println("Hasil adalah" + z);


}

catch(AritmethicException args)// berguna untuk menghandle error yang terjadi secara spesifik
{
System.out.println("error ketika dibagi dengan 0 ")
}

catch(InputMismatchException)
{
System.Out.println("error, silahkan masukan angka")
}

finally// produk yang akan selalu dieksekusi ketika exception dihandling
{
System.out.println("This will always be printed");
scan.close();
}
