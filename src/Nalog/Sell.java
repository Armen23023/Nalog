package Nalog;

public class Sell  {
    final int tax = 20;

    MyInterface arr[] = new MyInterface[10];
    int size = 0;

    public void buy(Product ob) {
        if (size == arr.length - 1) {
            System.out.println("Պահեստում տեղ չկա։ Գործարքը մերժված է։");
            return;
        }

        arr[size] = ob;
        size++;
    }


    public void sellOut(Product ob, int count) {
        if (size == 0) {
            System.out.println("Ապրանք չկա");
            return;
        }
        if (count > ob.count) {
            System.out.print("Քանակի պակասորդ");
            System.out.println(" " + ob.NameProduct + " տեսակի համար։");
            System.out.println();
            return;
        }
        if(count == ob.count){
            for (int i = 0; i < arr.length; i++) {
                if (ob==arr[i]){
                    skip(i);
                    System.out.println();
                    System.out.println("Բոլոր " + ob.NameProduct + " Տեսակի համակարգիչները վաճառվեցին"   );
                    System.out.print("հարկվել է ");
                    System.out.println((account(ob, count)) + " $ " + tax + " տոկոսով, շահույթը կազմում է " +  (shah(ob,count) - account(ob,count)) +" $:"  );

                    break;
                }
            }
        }
        else {
            ob.count  = ob.count-count;
            System.out.println("Վաճառվել է " + count + " հատ " + ob.NameProduct + " : " + ob.price+" $ գնով");
            System.out.print("հարկվել է ");
            System.out.println(account(ob, count) + " $: " + tax + " տոկոսով, շահույթը կազմում է " +  (shah(ob,count) - account(ob,count)) +" $"  );
            System.out.println("Պահեստում մնաց " + ob.count + " հատ " + ob.NameProduct);
            System.out.println();
        }


    }


    private void skip(int i){
        MyInterface [] newArr = new MyInterface[arr.length];
        int k = i;
        for (int j = 0; j < i; j++) {
            newArr[j] = arr[j];
        }
        for (int j = i+1; j < size; j++) {
            newArr[k] = arr[j];
            k++;
        }
        arr = newArr;
    }


    private int account(Product ob,int c) {
         int price = 0;
         price = ob.price * c;
         price = (price * tax)/100;
         return price;
    }

    private  int shah(Product ob,int c){
        return ob.price*c;
    }




    public void print(){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==null)
                return;
            System.out.println(arr[i]);

        }

    }

}
