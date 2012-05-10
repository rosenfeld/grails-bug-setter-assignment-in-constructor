package setter

class RegularUser { // Copied from User: just changed the name
    String email
    String passwordHash
    
    static transients = ['password']

    def setPassword(password) {
        passwordHash = email + password
    }
}
