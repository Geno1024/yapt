package com.geno1024.yapt

import com.geno1024.yapt.Networking.op

object Main
{
    fun help()
    {
        println("Yet Another Package Tool.")
        op()
    }

    fun main(args: Array<String>)
    {
        help()
    }
}

fun main(args: Array<String>) = Main.main(args)
