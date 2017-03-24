package hello

class Profile {

    String dEmail;                           //dEmail so that it doesnt have conflict with name="email" from gsp file.
    String dPassord;

    static constraints = {

        dEmail (blank:false , nullable:false)
        dPassord (blank:false , nullable:false)

    }
}
