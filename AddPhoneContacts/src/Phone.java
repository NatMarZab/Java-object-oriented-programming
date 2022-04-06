public class Phone {
    private int countryCode;
    private String phoneNumber;

    public Phone(String phone) {
        if(phone.length() > 10) {
            this.countryCode = Integer.parseInt(phone.substring(0, phone.length() - 10));
            this.phoneNumber = phone.substring(phone.length() - 10);
        } else {
            // if the inputted number is lower than 10, we´ll asume the country code is 1:
            this.countryCode = 1;
            this.phoneNumber = phone;
        }
    }
    public Phone(int countryCode, String phone) {
        this.countryCode = countryCode;
        this.phoneNumber = phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "countryCode=" + countryCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
