package models

import javax.inject.Inject

@javax.inject.Singleton
class UserDao @Inject()() {

    def lookupUser(u: User): Boolean = {
        //TODO query your database here
        if (u.username == "foo" && u.password == "foo") true else false
    }

}


