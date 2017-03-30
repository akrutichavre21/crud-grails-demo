package hello

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:'login', action:'auth')              // default localhost:8080 me kya dikhana chahiye. main url.
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
