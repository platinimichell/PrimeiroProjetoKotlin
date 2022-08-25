package cliente

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class ClienteTest {

    val cliente = Cliente(nome = "Michell", fone= "123456", end= "rua das couves")

    @Test

    fun insereItem() {

        cliente.insereItem("arroz")
        cliente.insereItem("feijão")

        assertEquals(2,cliente.list.size)
        assertTrue(cliente.list.contains("arroz"))
    }
}


    /*
    @Test
    fun excluirItem() {
    }
}

     */