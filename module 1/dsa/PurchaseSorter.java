class Purchase {

    int billNo;
    String buyer;
    double amount;

    Purchase(int billNo,String buyer,double amount) {

        this.billNo = billNo;
        this.buyer = buyer;
        this.amount = amount;
    }
}

public class PurchaseSorter {

    static void simpleSort(Purchase[] data) {

        int size = data.length;

        for(int outer=0;outer<size-1;outer++) {

            for(int inner=0;inner<size-outer-1;inner++) {

                if(data[inner].amount >
                   data[inner+1].amount) {

                    Purchase temp = data[inner];
                    data[inner] = data[inner+1];
                    data[inner+1] = temp;
                }
            }
        }
    }

    static int divide(Purchase[] data,
                      int left,
                      int right) {

        double pivot = data[right].amount;

        int mark = left - 1;

        for(int ptr=left;ptr<right;ptr++) {

            if(data[ptr].amount < pivot) {

                mark++;

                Purchase temp = data[mark];
                data[mark] = data[ptr];
                data[ptr] = temp;
            }
        }

        Purchase temp = data[mark+1];
        data[mark+1] = data[right];
        data[right] = temp;

        return mark + 1;
    }

    static void advancedSort(Purchase[] data,
                             int left,
                             int right) {

        if(left < right) {

            int split = divide(data,left,right);

            advancedSort(data,left,split-1);
            advancedSort(data,split+1,right);
        }
    }
}