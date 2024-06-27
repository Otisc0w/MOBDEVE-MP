package com.example.exercise3

class Content{


    var txt : String = ""
    var pic : Int = 1
    var muscle : String = ""
    var id : String = ""
    var dsc : String = ""

    constructor(txt: String, pic: Int, muscle: String, id: String, dsc: String) {
        this.txt = txt
        this.pic = pic
        this.muscle = muscle
        this.id = id
        this.dsc = dsc
    }
}

class Workout{


    var workout : String = ""
    var sets : String = ""
    var reps : String = ""

    constructor(workout: String, sets: String, reps: String) {
        this.workout = workout
        this.sets = sets
        this.reps = reps

    }
}
