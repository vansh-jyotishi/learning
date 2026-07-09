package javaProgramming.oops.AbstractionAndInterfaces;
 interface Book {

void write(String text);
int getsize();
void setPrice(int price);
}
class MathsBook implements Book{
    String content;
    int size = 0;
    int price;
    @Override
    public void write(String text) {
        this.content = text;
    }

    @Override
    public int getsize() {
        return this.size;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class InterfaceEx {
   public static void main(String[] args) {
     MathsBook rdsharma = new MathsBook();
    rdsharma.write("guuouhsvjasjvi0sjv0");
    rdsharma.setPrice(300);
    rdsharma.size = 2000;
    System.out.println(rdsharma.getsize());
   }

}
