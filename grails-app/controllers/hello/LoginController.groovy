package hello

class LoginController {

    def index() { }

    def create(){
        Profile a = new Profile([dEmail:params.email, dPassord:params.password])
        a.save();
        redirect(controller:'login',action:'show')          //redirects to show action.
    }

    def read(){

    }

    def update(){

        def updateInstance = Profile.get(1)
        updateInstance.dEmail = "abc@gmail.com"     //in db version value increments.
        updateInstance.save();
        render "Successfully Updated. New Email is : ${updateInstance.dEmail}"

    }

    def delete(){

        def deleteInstance = Profile.get(3)
        deleteInstance.delete();                   //deletes whole row.
        render "Successfully User has been Deleted."

    }
    def show(){
        //reading from table.
        def viewInstance = Profile.get(1)                   //viewInstance is of type Profile.
        println viewInstance.dEmail
        println viewInstance.dPassord
        render (view:'show',model:[abc:viewInstance]) //sending in form of map thats why []
        //model is a charactrstic of render by which we can send data from controller to show.gsp
    }

}
