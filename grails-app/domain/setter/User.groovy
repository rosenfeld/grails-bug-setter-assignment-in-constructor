package setter

class User {
    String email
    String passwordHash
    
    static transients = ['password']

    def setPassword(password) {
        passwordHash = email + password
    }
}
