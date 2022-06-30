package com.geno1024.yapt

import cinterop.winhttp.*

actual object Networking
{
    actual fun op()
    {
        println(WinHttpCheckPlatform())
    }
}
