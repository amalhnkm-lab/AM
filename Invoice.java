public class Invoice {

    private int invoiceID;//رقم الفاتورة
    private Patient patient;//كائن المريض الذي تخصه الفاتورة
    private double consultationFee;//تكلفة الكشف
    private double medicineCost;//تكلفة الادوية
    private double labCost;//تكلفة التحاليل
    private double totalAmount;//إجمالي المبلغ
    private boolean paid;//حالة الدفع
    private Payable payment;//طريقة الدفع المستخدمة

    // Constructor يستقبل البيانات التي نحتاجها لانشاء فاتورة
    public Invoice(int invoiceID, Patient patient,
                   double consultationFee,
                   double medicineCost, double labCost) {

        this.invoiceID = invoiceID;// نستخدم this للوصول الى خصائص الكلاس ونعيين قيمتها لParameters
        this.patient = patient;
        this.consultationFee = consultationFee;
        this.medicineCost = medicineCost;
        this.labCost = labCost;
        this.paid = false;

        calculateTotal();
    }

    // Calculate total هذه الدالة تجمع تكلفة الكشف و الادوية و التحاليل
    public double calculateTotal() {

        totalAmount = consultationFee + medicineCost + labCost;

        return totalAmount;
    }

    // Process payment
    public void processPayment(Payable payment) {//تستقبل Object من نوع Payable كـ Parameter.

        payment.pay(totalAmount);//تستدعي لتنفيذ الدفع

        this.payment = payment;//تخزن طريقة الدفع داخل الفاتورة

        paid = true;//تجعل حالة الفاتورة مدفوعة
    }

    // Display invoice هذه الدالة تعرض تفاصيل الفاتورة
    public void displayInvoice() {

        System.out.println("\n===== Hospital Invoice =====");
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Patient ID: " + patient.getPatientID());
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Consultation Fee: " + consultationFee);
        System.out.println("Medicine Cost: " + medicineCost);
        System.out.println("Lab Cost: " + labCost);
        System.out.println("Total Amount: " + totalAmount);

        if (paid) {//اذا كانت حالة الدفع صحيحة تعرض طريقة الدفع وحالة الدفع

            System.out.println("Payment Method: "
                    + payment.getPaymentMethod());

            System.out.println("Payment Status: Paid");

        } else {

            System.out.println("Payment Status: Not Paid");
        }

        System.out.println("============================");
    }

    // Getters
    public int getInvoiceID() { // ترجع رقم الفاتورة
        return invoiceID;
    }

    public Patient getPatient() { //ترجع كائن المريض الموجود داخل الفاتورة
        return patient;
    }

    public double getTotalAmount() { //ترجع إجمالي الفاتورة
        return totalAmount;
    }

    public boolean isPaid() {// ترجع حالة الدفع، وهي إما true أو false
        return paid;
    }

    // Setters تعدل تكلفة الادوية وبعد التعديل تعيد جساب الاجمالي حتى لا يبقى الاجمالي القديم
    public void setMedicineCost(double medicineCost) {

        this.medicineCost = medicineCost;

        calculateTotal();
    }

    public void setLabCost(double labCost) {//تعدل تكلفة التحاليل و تعيد حساب الاجمالي

        this.labCost = labCost;

        calculateTotal();
    }
}
