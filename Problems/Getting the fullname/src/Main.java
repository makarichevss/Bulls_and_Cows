class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        } else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "Unknown";
        } else if (firstName != null && lastName != null) {
            return firstName + " " + lastName;
        } else if (firstName == null && lastName != null) {
            return lastName;
        } else if (firstName != null && lastName == null) {
            return firstName;
        }
        return null;
    }
}