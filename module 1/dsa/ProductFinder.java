class Goods {

    int code;
    String title;
    String section;

    Goods(int code,String title,String section) {
        this.code = code;
        this.title = title;
        this.section = section;
    }
}

public class ProductFinder {

    static int sequentialFind(Goods[] list,String key) {

        for(int idx=0;idx<list.length;idx++) {
            if(list[idx].title.equals(key))
                return idx;
        }

        return -1;
    }

    static int fastFind(Goods[] list,String key) {

        int start = 0;
        int end = list.length - 1;

        while(start <= end) {

            int center = (start + end) / 2;

            int result =
                list[center].title.compareTo(key);

            if(result == 0)
                return center;

            else if(result < 0)
                start = center + 1;

            else
                end = center - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        Goods[] catalog = {
                new Goods(1,"Camera","Electronics"),
                new Goods(2,"Laptop","Electronics"),
                new Goods(3,"Speaker","Electronics")
        };

        System.out.println(sequentialFind(catalog,"Laptop"));
    }
}