package Introduction_to_java.OOPS;

class Subjects {
    private String subId;
    private String subName;
    private int maxMarks = 100;
    private int minMarks = 33;
    private int marksObt;
    private char result;

    public Subjects(String subId, String subName, int marksObt) {
        this.marksObt = marksObt;
        this.subId = subId;
        this.subName = subName;

        if (marksObt < minMarks) {
            result = 'F';
        } else {
            result = 'P';
        }
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getsubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMinMarks() {
        return minMarks;
    }

    public int getMarksObt() {
        return marksObt;
    }

    public void setMarksObt(int marksObt) {
        this.marksObt = marksObt;
    }

    public void qualified() {
        if (marksObt < minMarks) {
            System.out.println("F");
        } else {
            System.out.println("P");
        }
    }

    public void promote() {
        result = 'P';
    }

    public String toString() {
        return "\nSubject ID: " + subId + "\nName: " + subName + "\nMarks Obtained: " + marksObt;
    }

}
