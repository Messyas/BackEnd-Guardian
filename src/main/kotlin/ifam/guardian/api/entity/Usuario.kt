package ifam.guardian.api.entity

import jakarta.persistence.*

@Entity //faz com que a classe se torne uma tabela no banco,cada atributo = a coluna
//@Table(name = "Usuario")
data class Usuario(
    @Column(nullable = false) var primeiroNome: String = "", // a anotacao column ten varias constrants, neste caso os campos nao podem ser nulo
    @Column(nullable = false) var ultimoNome: String = "",
    @Column(nullable = false, unique = true) var cpf: String,
    @Column(nullable = false) var email: String = "",
    @Column(nullable = false) var senha: String = "",
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null// representa a primary key da tabela
    //generated faz a sequencia de id para cada user

) {
}