package Introduction_to_java.OOPS;

public class Student {
    
    private int eng, mth, sci;

    public void setEng(int a){
        eng = a;
    }
    public void setSci(int a){
        sci = a;
    }
    public void setMth(int a){
        mth = a;
    }

    public int getEng(){
        return eng;
    }
    public int getSci(){
        return sci;
    }
    public int getMth(){
        return mth;
    }

    public double avgMarks() {
        return (eng + mth + sci)/3;
    }

    public int  total() {
        return eng + mth + sci;
    }
}
