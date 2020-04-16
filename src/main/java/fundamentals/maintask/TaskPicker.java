package fundamentals.maintask;

class TaskPicker {

    void runTask() {
        Utility utility = new Utility();
        int taskNumber = -1;

        while (taskNumber != 0) {
            taskNumber = utility.selectTask();

            switch (taskNumber) {
                case 1:
                    utility.sayHello();
                    break;
                case 2:
                    utility.printArgsInReverseOrder();
                    break;
                case 3:
                    utility.printRandomNumbers();
                    break;
                case 4:
                    utility.printSumAndProduct();
                    break;
                case 5:
                    utility.pickAndPrintMonth();
                    break;
                case 0:
                    taskNumber = 0;
            }
        }
    }
}
