class Staff {

    int staffCode;
    String fullName;
    String designation;
    double income;

    Staff(int staffCode,
          String fullName,
          String designation,
          double income) {

        this.staffCode = staffCode;
        this.fullName = fullName;
        this.designation = designation;
        this.income = income;
    }
}

public class CompanyDirectory {

    static Staff[] workerList =
            new Staff[100];

    static int totalWorkers = 0;

    static void register(Staff worker) {
        workerList[totalWorkers++] = worker;
    }

    static Staff locate(int code) {

        for(int pos=0;pos<totalWorkers;pos++) {

            if(workerList[pos].staffCode == code)
                return workerList[pos];
        }

        return null;
    }

    static void displayAll() {

        for(int pos=0;pos<totalWorkers;pos++)
            System.out.println(workerList[pos].fullName);
    }

    static void erase(int code) {

        int removeIndex = -1;

        for(int pos=0;pos<totalWorkers;pos++) {

            if(workerList[pos].staffCode == code) {
                removeIndex = pos;
                break;
            }
        }

        if(removeIndex == -1)
            return;

        for(int pos=removeIndex;
            pos<totalWorkers-1;
            pos++) {

            workerList[pos] = workerList[pos+1];
        }

        totalWorkers--;
    }
}