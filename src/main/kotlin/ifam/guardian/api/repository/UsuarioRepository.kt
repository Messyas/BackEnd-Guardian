package ifam.guardian.api.repository

import ifam.guardian.api.entity.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository// torna a interface como um bin que vai ser gerenciado pelo spring
interface UsuarioRepository: JpaRepository<Usuario, Long> {
}
//Nessa interface é feita uma conecao com o banco de dados da tabela de Usuairo
