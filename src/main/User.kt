class User (var email : String, var password : Int, var age :Int){

    var email: String = ""
    var password: Int = 0
    var age: Int = 0

    fun getEmail(): String {
        return email
    }

    fun getPassword(): Int {
        return password
    }

    fun getAge(): Int {
        return age
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun setPassword(password: Int) {
        this.password = password
    }

    fun setAge(age: Int) {
        this.age = age
    }

}