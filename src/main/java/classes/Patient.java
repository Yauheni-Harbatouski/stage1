package classes;

class Patient {
    private static int incId;
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private String phone;
    private int cardNumber;
    private String diagnosis;

    Patient(String surname, String name, String middleName, String address, String phone, int cardNumber, String diagnosis) {
        id = incId++;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.cardNumber = cardNumber;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", surname='" + surname + '\'' +
                        ", name='" + name + '\'' +
                        ", middleName='" + middleName + '\'' +
                        ", address='" + address + '\'' +
                        ", phone='" + phone + '\'' +
                        ", cardNumber='" + cardNumber + '\'' +
                        ", diagnosis='" + diagnosis;
    }


    public int getCardNumber() {
        return cardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

}