package com.maderaiindra.alarmlista_list

//Database A-List
import android.os.FileObserver.CREATE

const val DB_NAME = "ToDoList"      //Nama Database Yaitu ToDoList
const val DB_VERSION = 1            //Version Database yang digunakan
const val TABLE_TODO = "ToDo"       //Table yang terdapat pada database
const val COL_ID = "id"             //Coloumn id dalam table
const val COL_CREATED_AT = "createdAt"  //Coloumn createdAt
const val COL_NAME = "name"             //Coloumn name


const val TABLE_TODO_ITEM = "ToDoItem"      //Table untuk menyimpan item
const val COL_TODO_ID = "toDoId"            //coloumn pada table
const val COL_ITEM_NAME = "itemName"        //coloumn pada table
const val COL_IS_COLPLETED = "isCompleted"  //coloumn pada table

const val INTENT_TODO_ID = "TodoId"
const val INTENT_TODO_NAME = "TodoName"

