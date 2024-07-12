//perbedaan static dengan public
//static tidak membutuhkan obyek sedangkan public membutuhkan deklarasi obyek
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Train {
    private Integer serialNumber;
    public Integer serialNumber2;
    
     public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }


    public Integer getSerialNumber() {
        return this.serialNumber;
    }
    
    static void cek()
    {
        System.out.println("ceking");
    }
    public void cek2()
    {
        System.out.println("ceking2");
    }
}

public class Main{
    public static void main(String[] args) {
        Train TrainNum1 = new Train();
        Train TrainNum2 = new Train();
        TrainNum2.serialNumber2 = 5;
        TrainNum1.setSerialNumber(10);
        System.out.println(TrainNum2.serialNumber2);
        System.out.println(TrainNum1.getSerialNumber());
        TrainNum2.cek2();
        cek(); //bisa dipanggil ketika terdapat pada satu kelas
    }
}

