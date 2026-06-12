
class Novel {

    int serialNo;
    String bookTitle;
    String writer;

    Novel(int serialNo,
            String bookTitle,
            String writer) {

        this.serialNo = serialNo;
        this.bookTitle = bookTitle;
        this.writer = writer;
    }
}

public class BookLocator {

    static int normalSearch(
            Novel[] collection,
            String target) {

        for (int i = 0; i < collection.length; i++) {

            if (collection[i].bookTitle
                    .equals(target)) {
                return i;
            }
        }

        return -1;
    }

    static int smartSearch(
            Novel[] collection,
            String target) {

        int left = 0;
        int right = collection.length - 1;

        while (left <= right) {

            int middle
                    = (left + right) / 2;

            int check
                    = collection[middle].bookTitle.compareTo(target);

            if (check == 0) {
                return middle; 
            }else if (check < 0) {
                left = middle + 1; 
            }else {
                right = middle - 1;
            }
        }

        return -1;
    }
}
