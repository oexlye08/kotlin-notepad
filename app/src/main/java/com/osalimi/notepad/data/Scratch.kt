package com.osalimi.notepad.data

fun demoDataClasses(){
    val note = Note(text = "This is a Note")
    note == note.copy() //this is true

    val aCopy = note.copy(text = "something else..", isPinned = true)
}