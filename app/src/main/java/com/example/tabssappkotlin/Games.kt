package com.example.tabssappkotlin

data class Games(var gameName: String="", var gameGenre: String= "", var numOfPlayers: String?, var photo:Int)
{
    //val id = (Math.random() * 10 % 10).toString() +(Math.random() * 10 % 10).toString() +(Math.random() * 10 % 10).toString()+(Math.random() * 10 % 10).toString()+(Math.random() * 10 % 10).toString()+(Math.random() * 10 % 10).toString()

    /*override fun toString(): String {
        return nickName + (if (isMemberPlus) " is MemberPlus" else "is not MemberPlus") +
                if (address.isNotBlank()){" lives in " + address} else ""
    }

     */


}