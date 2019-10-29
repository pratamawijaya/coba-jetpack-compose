package com.pratamawijaya.demojetpackcompose

import androidx.compose.Context
import androidx.compose.state
import androidx.compose.unaryPlus

data class Page(val title:String, val function: (Context) -> Unit)

class Navigation {
    private val page = +state { -1 }
    var entries: List<Page>? = emptyList()

    fun setPages(pages:List<Page>){
        entries = pages
    }

    fun setHome(){
        page.value = -1
    }


}