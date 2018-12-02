package com.example.liz.courseapplication;

public class DialActivity {

    private String val1;

    public DialActivity(){
        setVal1("");
    }

    void numberClicked(String num){
        val1 += num;
    }

    public void btn_clear(){
        val1 = "";
    }

    public String getPreview() {
        return getVal1();
    }

    public String getResult() {
        return getVal1();
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }
}
