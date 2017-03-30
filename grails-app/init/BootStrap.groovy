import hello.Role
import hello.User
import hello.UserRole

class BootStrap {

    def init = { servletContext ->                      //closure form of action.

        def adminRole = new Role(authority:'ROLE_ADMIN').save(flush:true);
        def testUser = new User(username:'admin',password:'admin').save(flush:true);
        UserRole.create testUser,adminRole

    }
    def destroy = {
    }
}
