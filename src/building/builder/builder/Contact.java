package building.builder.builder;

public class Contact {

    private String address;
    private String phoneNumber;

    public Contact(Builder builder) {
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class Builder {

        private String address;
        private String phoneNumber;

        public Builder address(final String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(final String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }
    }
}
