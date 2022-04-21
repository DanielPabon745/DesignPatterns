package building.builder.builder;

public class User {

    private int id;
    private String email;
    private Name name;
    private Contact contact;

    public User(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.name = builder.name;
        this.contact = builder.contact;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name=" + name +
                ", contact=" + contact +
                '}';
    }

    public static class Builder {

        private int id;
        private String email;
        private Name name;
        private Contact contact;


        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder name(Name name) {
            this.name = name;
            return this;
        }

        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
