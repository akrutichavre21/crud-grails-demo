package hello
import grails.plugin.springsecurity.annotation.Secured

class AbcController {

    @Secured(['ROLE_ADMIN'])
    def index() { }
    @Secured(['ROLE_ADMIN'])
    def create(){
        Profile a = new Profile([dEmail:params.email, dPassord:params.password])
        a.save();
        redirect(controller:'abc',action:'show')          //redirects to show action.
    }
    @Secured(['ROLE_ADMIN'])
    def read(){

    }
    @Secured(['ROLE_ADMIN'])
    def update(){

        def updateInstance = Profile.get(1)
        updateInstance.dEmail = "abc@gmail.com"     //in db version value increments.
        updateInstance.save();
        render "Successfully Updated. New Email is : ${updateInstance.dEmail}"

    }
    @Secured(['ROLE_ADMIN'])
    def delete(){

        def deleteInstance = Profile.get(3)
        deleteInstance.delete();                   //deletes whole row.
        render "Successfully User has been Deleted."

    }
    @Secured(['ROLE_ADMIN'])
    def show(){
        //reading from table.
        def viewInstance = Profile.get(1)                   //viewInstance is of type Profile.
        println viewInstance.dEmail
        println viewInstance.dPassord
        render (view:'show',model:[abc:viewInstance]) //sending in form of map thats why []
        //model is a charactrstic of render by which we can send data from controller to show.gsp
    }

}
