package org.example;

public class Infor {
    private String voucher_id;
    private int numberOfVoucher;
    private String timeScheduled;

    public Infor(String voucher_id, int numberOfVoucher, String timeScheduled) {
        this.voucher_id = voucher_id;
        this.numberOfVoucher = numberOfVoucher;
        this.timeScheduled = timeScheduled;
    }

    public Infor() {
    }

    public void addDataToArrayList(String[] splidedData) {
        for (int i = 0; i < splidedData.length; i++) {
            if (i == 0) {
                this.voucher_id = splidedData[i];
            }else if (i == 1){
                this.numberOfVoucher = Integer.parseInt(splidedData[i]);
            }else{
                this.timeScheduled = splidedData[i];
            }
        }
    }

    public String toString() {
        String VC = "Voucher id : " + this.voucher_id + " Số lượng: " + this.numberOfVoucher
                + " Ngày phát hành: " + this.timeScheduled;
        return VC;
    }

}

