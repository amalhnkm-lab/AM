public abstract class Payment implements Payable {//إنشاء كلاس مجرد و يطبق الواجهه

    private double paidAmount;//متغير يخزن المبلغ المدفوع

    public Payment() {
        this.paidAmount = 0;//القيمة الابتدائية
    }

    public double getPaidAmount() {//يرجع المبلغ الدفوع
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {//يغير المبلغ المدفوع
        this.paidAmount = paidAmount;
    }
}
