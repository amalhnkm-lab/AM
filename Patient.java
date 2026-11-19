public class Patient {

    private int patientID; //رقم المريض
    private String name; //اسم المريض

    public Patient(int patientID, String name) { //يستقبل رقم المريض واسمه

        this.patientID = patientID;//يخزن الرقم في خاصية الكلاس
        this.name = name;//بخزن الاسم
    }

    public int getPatientID() {//يرجع رقم المريض
        return patientID;
    }

    public String getName() {//يرجع اسم المريض
        return name;
    }
}
